package com.malu.springboot.application.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/2 7:02 下午
 */

@Component
public class HelloApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("hello>>>>>>>>>>applicationRunner >>>>>run");
    }
}
