package com.malu.springboot.web;

import com.malu.springboot.web.entities.Department;
import com.malu.springboot.web.mapper.DepartmentMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 5:03 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMapperTests {

    @Resource
    DepartmentMapper departmentMapper;

    @Test
    public void testAutowied(){
        Assert.notNull(departmentMapper,"departmentMapper should be Autowired");
    }

    @Test
   public void testListDepartment() {
        List<Department> departments = departmentMapper.listDepartment();
        Assert.notNull(departments,"listDepartment result should not be null");
    }

    @Test
    public void testGetDepartment() {
        Department department = departmentMapper.getDepartment(1);
        Assert.notNull(department,"getDepartment() result should not be null");
    }

    @Test
    public void testAddDepartment() {
        Department department = new Department();
        department.setId(2);
        department.setDepartmentName("hahaLA");
        boolean b = departmentMapper.addDepartment(department);
        Assert.isTrue(b,"addDepartment() should return true");
    }

    @Test
    public void testUpdateDepartment() {

        Department department = new Department();
        department.setId(2);
        department.setDepartmentName("haha");
        boolean b = departmentMapper.updateDepartment(department);
        Assert.isTrue(b,"updateDepartment() should return true");
    }

    @Test
    public void testDelDepartment() {
        boolean b = departmentMapper.delDepartment(2);
        Assert.isTrue(b,"delDepartment() should return true");
    }

}
