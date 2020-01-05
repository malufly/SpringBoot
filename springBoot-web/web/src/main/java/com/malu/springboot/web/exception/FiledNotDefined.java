package com.malu.springboot.web.exception;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/4 8:58 下午
 */
public class FiledNotDefined extends RuntimeException {
    public FiledNotDefined(String message) {
        super(message);
    }
}
