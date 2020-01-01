package com.malu.springboot.configurationinjectprofile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


//@ImportResource(locations = {"classpath:bean.xml"}) //配置 spring xml 方式配置bean 不推荐使用 用 @Configuration @Bean
@SpringBootApplication
public class ConfigurationInjectProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationInjectProfileApplication.class, args);
    }

}
