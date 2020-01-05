package com.malu.springboot.web.exception;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/5 1:33 下午
 */
@Component
public class ErrorAttributeSetting extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {

        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        Object ext = webRequest.getAttribute("ext", WebRequest.SCOPE_REQUEST);
        errorAttributes.put("ext",ext);
        return errorAttributes;
    }
}
