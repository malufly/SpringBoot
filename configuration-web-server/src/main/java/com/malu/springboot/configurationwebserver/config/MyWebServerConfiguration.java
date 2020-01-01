package com.malu.springboot.configurationwebserver.config;

import com.malu.springboot.configurationwebserver.serverCompoment.LoginServlet;
import com.malu.springboot.configurationwebserver.serverCompoment.MyListener;
import com.malu.springboot.configurationwebserver.serverCompoment.Myfilter;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Servlet;
import java.util.Arrays;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/27 1:10 下午
 */

@Configuration
public class MyWebServerConfiguration {

    //通用的server 配置注册
    @Bean
   public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){

        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {

                factory.setPort(8081);
           }
        };
    }


    //注册Servlet
    @Bean
    public ServletRegistrationBean<Servlet> servletRegistrationBean(){

        ServletRegistrationBean<Servlet> loginServler = new ServletRegistrationBean<>();
        loginServler.addUrlMappings("/login/user"); //设置映射路径
        loginServler.setServlet(new LoginServlet());

        return loginServler;
    }

    //注册Filter
    @Bean
    public FilterRegistrationBean<Myfilter> filterRegistrationBean(){

        FilterRegistrationBean<Myfilter> myFilter = new FilterRegistrationBean<>();
        myFilter.setFilter(new Myfilter());
        myFilter.setUrlPatterns(Arrays.asList("/login/user")); //设置拦截路径
        return  myFilter;
    };

    //注册Listener
    @Bean
    public ServletListenerRegistrationBean listenerRegistrationBean(){

        ServletListenerRegistrationBean<MyListener> myListener = new ServletListenerRegistrationBean<>();
        myListener.setListener(new MyListener());
        return myListener;
    }



}
