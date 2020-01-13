package com.malu.springboot.cache.mapper;

import com.malu.springboot.cache.bean.Department;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.sql.DataSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 5:18 下午
 */

@SpringBootTest
@RunWith(SpringRunner.class)
class DepartmentMapperTest {


    @Autowired
    DepartmentMapper departmentMapper;


    @Test
    void selectDepartment() {

        Department department = departmentMapper.selectDepartment(1);
        Assert.notNull(department,"department should not be null");
    }

    @Test
    void selectAll() {

        List<Department> departments = departmentMapper.selectAll();
        Assert.notNull(departments,"selectAll() return value should not be null");
    }

    @Test
    void insertDepartment() {

        Department department = new Department(5,"llll");

        boolean b = departmentMapper.insertDepartment(department);
        Assert.isTrue(b,"DepartmentMapper.insertDepartment() return false ");
    }



    @Test
    void updateDepartment() {

        boolean b = departmentMapper.updateDepartment(new Department(5, "ZHANZHANG"));
        Assert.isTrue(b,"DepartmentMapper.updateDepartment() return false");
    }

    @Test
    void deleteDepartment() {

        boolean b = departmentMapper.deleteDepartment(5);
        Assert.isTrue(b,"DepartmentMapper.deleteDepartment() return false");

    }
}