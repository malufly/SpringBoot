package com.malu.springboot.myconfigautoconfiguration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 12:29 下午
 */

@Data
@ConfigurationProperties(prefix = "malu.config")
public class HelloMyConfiguraionProperties {

    private String prefix;
    private String suffix;
}
