package com.malu.springboot.web.mvcConfig;

import com.malu.springboot.web.exception.FiledNotDefined;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.thymeleaf.util.StringUtils;

import java.lang.reflect.Field;
import java.util.Locale;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/4 8:43 下午
 */
public class Constant {


    private static Constant constant;
    private static Logger logger = LoggerFactory.getLogger(Constant.class);

    public String msg_US = "password or username is wrong";
    public String msg_CN = "用户名密码错误";



    private static Constant getConstant(){

        if(constant == null){
            synchronized (Constant.class) {
                if(constant == null){
                    constant = new Constant();
                }
            }

        }
        return constant;
    }

    public static String getMessage(String name)  {

        String country = Locale.getDefault().getCountry();
        String filedName = name + "_" + country;
        logger.info("拼成的Constant常量名为：" + filedName);
        Class<Constant> clazz = Constant.class;
        String message = "";
        try {
            Field declaredField = clazz.getDeclaredField(filedName);
            declaredField.setAccessible(true);
            message = declaredField.get(getConstant()).toString();

        } catch (NoSuchFieldException e) {
           throw new FiledNotDefined("Constant 中的属性没有定义");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return message;
    }
}
