package com.malu.springboot.cache.config;

import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Configuration;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 4:46 下午
 */
@Configuration
public class MyBatisConfig {

    public ConfigurationCustomizer configurationCustomizer () {

        return new ConfigurationCustomizer() {
            @Override
            public void customize(org.apache.ibatis.session.Configuration configuration) {

                configuration.setMapUnderscoreToCamelCase(true);

            }
        };
    }

}
