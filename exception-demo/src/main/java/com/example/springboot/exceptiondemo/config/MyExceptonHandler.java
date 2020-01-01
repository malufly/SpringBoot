package com.example.springboot.exceptiondemo.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/26 9:45 下午
 */

@ControllerAdvice
public class MyExceptonHandler {

    final String viewNanme = "javax.servlet.error.status_code";
    @ExceptionHandler(MyLoginException.class)
    public String loginExceptionHandler(HttpServletRequest request){

        request.setAttribute(viewNanme,404);//设置视图
        HashMap<String, Object> map = new HashMap<>();
        map.put("hi","hi");
        map.put("hello","helleo");
        request.setAttribute("ext",map);//设置Modle


        return "forward:/error"; //让 springBoot 注入的默认controller处理  自适应客户端和浏览器

    }

}
