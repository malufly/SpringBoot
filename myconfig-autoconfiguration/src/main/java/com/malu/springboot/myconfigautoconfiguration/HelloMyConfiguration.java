package com.malu.springboot.myconfigautoconfiguration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 12:23 下午
 */


@Data
public class HelloMyConfiguration {

    HelloMyConfiguraionProperties helloMyConfiguraionProperties;

    public String sayHi(String name){
        return helloMyConfiguraionProperties.getPrefix() +  name + helloMyConfiguraionProperties.getSuffix();
    }
}
