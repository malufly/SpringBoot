package com.malu.springboot.configurationwebserver.config;

import com.malu.springboot.configurationwebserver.ConfigurationWebServerApplication;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/27 12:30 下午
 */

@Configuration
public class MySpringMvcConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){

        return new WebMvcConfigurer() {
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {

            }
        };
    }






}
