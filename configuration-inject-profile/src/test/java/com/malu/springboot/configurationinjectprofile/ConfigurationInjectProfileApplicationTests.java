package com.malu.springboot.configurationinjectprofile;

import com.malu.springboot.configurationinjectprofile.bean.Person;
import com.malu.springboot.configurationinjectprofile.bean.SpringBootInjectValueFromConfiguration;
import com.malu.springboot.configurationinjectprofile.bean.SpringBootInjectValueFromConfigurationBySign;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class ConfigurationInjectProfileApplicationTests {

    @Autowired
    ApplicationContext ioc;

    @Autowired
    Person person;

    @Autowired
    SpringBootInjectValueFromConfiguration springBootInjectValueFromConfiguration;

    @Autowired
    SpringBootInjectValueFromConfigurationBySign springBootInjectValueFromConfigurationBySign;


    @Test
    void testIOCinject() {

        Assert.assertNotNull("ioc 容器 没有创建",ioc);
        boolean isExist = ioc.containsBean("dog");
        Assert.assertTrue("isExsit is true",isExist);
    }

    @Test
    void testInjectFromConfigurationByValue(){

        Assert.assertNotNull("person is not null",person);
        System.out.println(person);

    }

    @Test
    void testSpringBootInjectValueFromConfiguration(){

        Assert.assertNotNull("SpringBootInjectValueFromConfiguration should not be null ",springBootInjectValueFromConfiguration);
        System.out.println(springBootInjectValueFromConfiguration);
    }

    /**
     * 指定文件获取值
     */
    @Test
    void testSpringBootInjectValueFromConfigurationBySign(){

        Assert.assertNotNull("springBootInjectValueFromConfigurationBySign should not be null",springBootInjectValueFromConfigurationBySign);
        System.out.println(springBootInjectValueFromConfigurationBySign);
    }

}
