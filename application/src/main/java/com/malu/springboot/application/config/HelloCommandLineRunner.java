package com.malu.springboot.application.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/2 7:04 下午
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello>>>>>>>>>>>>CommandLineRunner running.");
    }
}
