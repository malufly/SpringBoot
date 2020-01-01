package com.malu.springboot.webthymeleaf.controller;

import com.malu.springboot.webthymeleaf.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/22 1:59 下午
 */

@Controller
public class HelloThymeleaf {

    @RequestMapping("/hello")
    public String sayHello(Map<String,Object> map){

        map.put("test","helloThymeleaf");
        map.put("testText","<h1>test Text</h1>");
        map.put("users", Arrays.asList("张三","李四","王五"));

        Person person = new Person("测试*{}", 22);
        map.put("person",person);


        return "helloThymeleaf";
    }

}
