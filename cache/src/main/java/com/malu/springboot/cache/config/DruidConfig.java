package com.malu.springboot.cache.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 3:43 下午
 */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDatasource(){
        return new DruidDataSource();
    }

    /**
     * 注册druid 后台控制界面
     */
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet() {

        ServletRegistrationBean<StatViewServlet> registrationBean = new ServletRegistrationBean<>();
        registrationBean.setServlet(new StatViewServlet());
        registrationBean.setUrlMappings(Arrays.asList("/druid/*"));

        HashMap<String, String> initParam = new HashMap<>();
        initParam.put("loginUsername","admin");
        initParam.put("loginPassword", "4444");
        initParam.put("allow", "");
        registrationBean.setInitParameters(initParam);

        return registrationBean;
    }

    /**
     * 配置过滤器 过滤请求 统计数据
     */
    //@Bean
    public FilterRegistrationBean<WebStatFilter> webStatFilter(){

        FilterRegistrationBean<WebStatFilter> filterRegist = new FilterRegistrationBean<>();
        filterRegist.setFilter(new WebStatFilter());
        filterRegist.setUrlPatterns(Arrays.asList("/druid/*"));

        HashMap<String, String> initParam = new HashMap<>();
        initParam.put("exclusions", "");
        filterRegist.setInitParameters(initParam);


        return filterRegist;
    }


}
