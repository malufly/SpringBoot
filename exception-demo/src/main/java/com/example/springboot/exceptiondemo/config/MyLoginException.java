package com.example.springboot.exceptiondemo.config;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/26 9:43 下午
 */
public class MyLoginException extends RuntimeException {

    public MyLoginException(String message) {
        super(message);
    }
}
