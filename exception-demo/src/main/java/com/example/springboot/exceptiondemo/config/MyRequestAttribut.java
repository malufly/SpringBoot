package com.example.springboot.exceptiondemo.config;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/26 9:51 下午
 */

@Component
public class MyRequestAttribut extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Object ext = webRequest.getAttribute("ext", WebRequest.SCOPE_REQUEST);
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);

        errorAttributes.put("ext",ext);
        return errorAttributes;
    }
}
