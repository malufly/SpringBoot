package com.malu.springboot.configurationwebserver.serverCompoment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpFilter;
import java.io.IOException;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/27 1:28 下午
 */
public class Myfilter extends HttpFilter {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        logger.info("进入了 MyFilter");
        chain.doFilter(request, response);
    }
}
