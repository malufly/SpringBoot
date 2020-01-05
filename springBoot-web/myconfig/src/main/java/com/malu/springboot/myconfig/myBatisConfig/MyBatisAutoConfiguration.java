package com.malu.springboot.myconfig.myBatisConfig;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 4:26 下午
 */
@Configuration
@ConditionalOnBean(MyBatisAutoConfiguration.class)
public class MyBatisAutoConfiguration {

    @Bean
    public ConfigurationCustomizer configurationCustomizer(){

        return new ConfigurationCustomizer() {

            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {

                configuration.setMapUnderscoreToCamelCase(true);

            }
        };

    }
}
