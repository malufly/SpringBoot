package com.malu.springboot.web.mvcConfig;


import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/4 6:26 下午
 */

public class SectionLoclaResolve implements LocaleResolver {

    Locale locale = Locale.getDefault();

    @Override
    public Locale resolveLocale(HttpServletRequest request) {


            String localeStr = request.getParameter("locale");
            if (!StringUtils.isEmpty(localeStr)) {
                String[] s = localeStr.split("_");
                locale = new Locale(s[0], s[1]);
                Locale.setDefault(locale);
            } else {
                locale = Locale.getDefault();
            }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

        locale = this.locale;
    }
}
