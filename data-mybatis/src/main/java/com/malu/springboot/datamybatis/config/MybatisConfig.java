package com.malu.springboot.datamybatis.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/30 6:11 下午
 */

@org.springframework.context.annotation.Configuration
public class MybatisConfig {

    //application 中配置了 mybaties 配置文件 这个配置被覆盖 不生效 xml 优先
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){

        return new ConfigurationCustomizer() {
            @Override
            public void customize(Configuration configuration) {
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }


}


