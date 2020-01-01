package com.malu.springboot.configurationwebserver.serverCompoment;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Element;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.xml.ws.EndpointReference;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;
import java.security.Principal;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/27 2:20 下午
 */
public class MyListener implements ServletContextListener {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        logger.info("listener监听Web container启动" + sce.getServletContext().getContextPath() );
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

        logger.info("listener监听 Web Container 销毁" + sce.getServletContext().getServerInfo() );
    }
}
