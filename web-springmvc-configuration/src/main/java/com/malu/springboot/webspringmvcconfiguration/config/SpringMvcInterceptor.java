package com.malu.springboot.webspringmvcconfiguration.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/22 7:29 下午
 */

//@EnableWebMvc //取消springBoot 默认配置
@Configuration
public class SpringMvcInterceptor implements WebMvcConfigurer {
    //扩展springMvc springBoot自动配置和自定义配置一起生效

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/sayhi").setViewName("viewController");

    }
}
