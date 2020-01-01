package com.malu.springboot.datamybatis.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewFilter;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/30 11:40 上午
 */

@Configuration
public class DruidDataSourceConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource(){
        return  new DruidDataSource();
    }


    //配置druid监控页面
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet(){

        ServletRegistrationBean<StatViewServlet> bean = new ServletRegistrationBean<>();
        bean.setServlet(new StatViewServlet());
        bean.setUrlMappings(Arrays.asList("/druid/*"));
        HashMap<String, String> initParam = new HashMap<>();
        initParam.put("loginUsername","admin");
        initParam.put("loginPassword","1111");
        initParam.put("allow","");

        bean.setInitParameters(initParam);

        return bean;
    }

    //配置druid过滤页面请求 配合servlet使用
    @Bean
    public FilterRegistrationBean<Filter> statViewFilter(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();
        bean.setFilter(new WebStatFilter());
        bean.setUrlPatterns(Arrays.asList("/*"));
        HashMap<String, String> initMap = new HashMap<>();
        initMap.put("exclusions","*.js,*.css,/druid/*");

        bean.setInitParameters(initMap);

        return bean;
    }



}
