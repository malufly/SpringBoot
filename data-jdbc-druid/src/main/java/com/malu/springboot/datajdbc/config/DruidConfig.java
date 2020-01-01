package com.malu.springboot.datajdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
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
 * @date 2019/12/29 5:48 下午
 */
@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druidDataSource(){
        return new DruidDataSource();
    }


    //配置一个管理后台的servelet  /druid/index.html
    @Bean
    public ServletRegistrationBean<StatViewServlet> statViewServlet(){
        //路径要映射/druid路径下的所有 路径，否则跳转路径的时候会报错
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");

        HashMap<String, String> initParam = new HashMap<>();
        initParam.put("loginUsername","admin");
        initParam.put("loginPassword","1111");
        initParam.put("allow",""); //默认全部 ip都可以访问
        bean.setInitParameters(initParam);
        return bean;
    }

    //配置一个管理

    @Bean
    public FilterRegistrationBean<Filter> webStatfilter(){

        FilterRegistrationBean<Filter> filterBean = new FilterRegistrationBean<>();
        filterBean.setFilter(new WebStatFilter());
        filterBean.setUrlPatterns(Arrays.asList("/*"));

        HashMap<String, String> initParam = new HashMap<>();
        initParam.put("exclusions","*.js,*.css,/druid/*"); //不过滤druid下的路径

        filterBean.setInitParameters(initParam);

        return filterBean;
    }


}
