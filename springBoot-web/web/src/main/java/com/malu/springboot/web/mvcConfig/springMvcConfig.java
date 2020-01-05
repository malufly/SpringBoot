package com.malu.springboot.web.mvcConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/4 6:02 下午
 */

@Configuration
public class springMvcConfig {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {

        return new WebMvcConfigurer() {

            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("index");
                registry.addViewController("/dashboard.html").setViewName("dashboard");
            }


            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/user/login", "/", "/static/**", "/asserts/**");
            }

        };

    }

    @Bean
    public LocaleResolver localeResolver() {

        return new SectionLoclaResolve();
    }
}
