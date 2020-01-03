package com.malu.springboot.application.config;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/2 6:48 下午
 */
public class HelloApplicationContextInitlizar implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {

        System.out.println("hello...ApplicationInitializer");
    }


}
