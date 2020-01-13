package com.malu.springboot.cache.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 9:49 下午
 */

@Configuration
public class CacheConfig {

    @Bean
    public KeyGenerator myKeyGenerator(){

        Logger logger = LoggerFactory.getLogger(this.getClass());
        return new KeyGenerator() {
          @Override
          public Object generate(Object o, Method method, Object... objects) {
              logger.info("生成的缓存key为：" + method.getName()+o.toString() + Arrays.asList(objects).toString());
              return method.getName()+o.toString() + Arrays.asList(objects).toString();
          }
      };

    }
}
