package com.malu.springboot.configurationinjectprofile.bean;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Map;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2019/12/19 5:44 下午
 */


public class Person {

    //字面量
    @Value("${person.lastName}") //从配置文件 系统变量中获取值
    private String lastName;
    @Value("#{2*4}") //支持sPLe表达式
    private int age;
    @Value("false")
    private Boolean boss;

    //数组对象 map
    @Value("${person.list}") //支持数组 不支持 对象 和 map值的注入
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
