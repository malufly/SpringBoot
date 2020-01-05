package com.malu.springboot.myconfig.druidConfig;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 2:48 下午
 */

@Configuration
public class DruidDataSourceAutoConfigration {


    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DruidDataSource druidDataSource(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean<StatViewServlet> servletRegistrationBean(){

        ServletRegistrationBean<StatViewServlet> servletRegist = new ServletRegistrationBean<>();
        servletRegist.setServlet(new StatViewServlet());
        servletRegist.setUrlMappings(Arrays.asList("/druid/*"));

        HashMap<String, String> initParam = new HashMap<>();
        initParam.put("loginUsername","admin");
        initParam.put("loginPassword", "4444");
        initParam.put("allow", "");

        servletRegist.setInitParameters(initParam);
        return servletRegist;
    }

    @Bean
    public FilterRegistrationBean<WebStatFilter> filterFilterRegistrationBean(){

        FilterRegistrationBean<WebStatFilter> filterRegist = new FilterRegistrationBean<>();
        filterRegist.setFilter(new WebStatFilter());
        filterRegist.addUrlPatterns("/*");

        HashMap<String, String> initparam = new HashMap<>();
        initparam.put("exclusions","/druid/*,/static/*,/asserts/*");

        filterRegist.setInitParameters(initparam);

        return filterRegist;
    }



}
