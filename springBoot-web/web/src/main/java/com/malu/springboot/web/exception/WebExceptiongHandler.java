package com.malu.springboot.web.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/5 12:57 下午
 */

@ControllerAdvice
public class WebExceptiongHandler {

    private final String statuCode = "javax.servlet.error.status_code";

    @ExceptionHandler(FiledNotDefined.class)
    public String  fileNotDefineHandler(HttpServletRequest request,Throwable exception) {

        request.setAttribute(statuCode,999);//设置跳转的错误定制页面

        //定制返回消息
        HashMap<String, String> ext = new HashMap<>();
        ext.put("code:", "404");
        ext.put("msg",exception.getMessage());
        ext.put("logo","malu");
        request.setAttribute("ext",ext);

        return "forward:/error";
    }


}
