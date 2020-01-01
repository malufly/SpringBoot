package com.malu.springboot.configurationinjectprofile.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/19 6:06 下午
 */
@Configuration //标识配置文件 替代spring xml
public class SpringBootInjectIoc {

    @Bean //替代 xml 中 <bean> </bean>
    public Dog dog(){  //方法名 dog 为 bean 中 的id值
        return new Dog();
    }

    @Bean
    public Person person(){
       return new Person();
    }


}
