package com.malu.springboot.application.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Iterator;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/2 6:51 下午
 */
public class HelloApplicationRunerListener implements SpringApplicationRunListener {

    private final SpringApplication application;
    private final String[] args;
    private final SimpleApplicationEventMulticaster initialMulticaster;

    public HelloApplicationRunerListener(SpringApplication application, String[] args) {
        this.application = application;
        this.args = args;
        this.initialMulticaster = new SimpleApplicationEventMulticaster();
        Iterator var3 = application.getListeners().iterator();

        while(var3.hasNext()) {
            ApplicationListener<?> listener = (ApplicationListener)var3.next();
            this.initialMulticaster.addApplicationListener(listener);
        }

    }


    @Override
    public void starting() {
        System.out.println("hello >>>>.>>> SpringApplicationRunListener >>>>>Starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        System.out.println("hello>>>>>>>>>SpringApplicationRunnerListenner>>>>>enviromentPrepared");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("hello>>>>>>>>>>>SpringApplicaton>>>>>>contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("Hello>>>>>>>>SoringApplicationRunListener>>>>>contextLoaded");
    }

    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("hello>>>>>>SpringAPPLICATIONrUNlISTENER >>>>>>started");
    }

    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("hello >>>>>>>>>>ApplicationRunListenned>>>>>>>runing");
    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("hello>>>>>>>>>SpringApplicationRunListener >>>>>>>>>faid");
    }


}
