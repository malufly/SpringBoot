package com.malu.springboot.configurationinjectprofile.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/19 5:44 下午
 */
@Component
@ConfigurationProperties(prefix = "personsign")
@PropertySource(value = "classpath:person.properties")
public class SpringBootInjectValueFromConfigurationBySign {

    //字面量
    private String lastName;
    private int age;
    private Boolean boss;

    //数组对象 map
    private List list;
    private Dog dog;
    private Map map;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }


    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", list=" + list +
                ", dog=" + dog +
                ", map=" + map +
                '}';
    }
}
