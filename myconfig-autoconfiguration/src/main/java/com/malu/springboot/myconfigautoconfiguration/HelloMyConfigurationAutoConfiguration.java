package com.malu.springboot.myconfigautoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 12:39 下午
 */

@Configuration
@ConditionalOnWebApplication
@EnableConfigurationProperties(HelloMyConfiguraionProperties.class)
public class HelloMyConfigurationAutoConfiguration {

    @Autowired
    HelloMyConfiguraionProperties helloMyConfiguraionProperties;

    @Bean
    public HelloMyConfiguration helloMyConfiguration(){

        HelloMyConfiguration helloMyConfiguration = new HelloMyConfiguration();
        helloMyConfiguration.setHelloMyConfiguraionProperties(helloMyConfiguraionProperties);

        return helloMyConfiguration;
    }

}
