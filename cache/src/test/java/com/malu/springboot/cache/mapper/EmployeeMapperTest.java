package com.malu.springboot.cache.mapper;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.malu.springboot.cache.bean.Department;
import com.malu.springboot.cache.bean.Employee;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.sql.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 6:26 下午
 */

@SpringBootTest
@RunWith(SpringRunner.class)
class EmployeeMapperTest {

    @Resource
    EmployeeMapper employeeMapper;

    @Test
    void selectEmployeeById() {

        Employee employee = employeeMapper.selectEmployeeById(1);
        Assert.assertNotNull("EmployeeMapper.selectEmployeeById() return null",employee);
    }

    @Test
    void selectAll() {

        List<Employee> employees = employeeMapper.selectAll();
        Assert.assertNotNull("EmployeeMapper.selectAll() return null " ,employees);
    }

    @Test
    void addEmployee() {

        Department department = new Department();
        department.setId(1);
        Employee employee = new Employee(2, "zhang", "ered", 0, department, new Date(System.currentTimeMillis()));
        boolean b = employeeMapper.addEmployee(employee);
        Assert.assertTrue(b);


    }

    @Test
    void deleteEmployeeById() {
        boolean b = employeeMapper.deleteEmployeeById(2);
        Assert.assertTrue(b);
    }

    @Test
    void updateEmployee() {

        Department department = new Department();
        department.setId(1);
        Employee employee = new Employee(2, "zhang", "ered", 0, department, new Date(System.currentTimeMillis()));
        boolean b = employeeMapper.updateEmployee(employee);
        Assert.assertTrue(b);
    }
}