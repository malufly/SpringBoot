package com.malu.springboot.web;

import com.malu.springboot.web.entities.Department;
import com.malu.springboot.web.entities.Employee;
import com.malu.springboot.web.mapper.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 6:42 下午
 */

@SpringBootTest
@RunWith(SpringRunner.class)
public class EmployeeMapperTests {

    @Resource
    EmployeeMapper employeeMapper;

    @Test
    public void testEmployeeMapper(){
        Assert.notNull(employeeMapper,"employeeMapper should be Autowired");
    }

    @Test
    public void testListEmployee() {
        List<Employee> employees = employeeMapper.listEmployee();
        Assert.notNull(employees,"listEmployees() should return values");
    }

    @Test
    public void testGetEmployee() {
        Employee employee = employeeMapper.getEmployee(1);
        Assert.notNull(employee,"getEmployee() should return values");
    }

    @Test
    public void testAddEmployee( ) {

        Employee employee = new Employee();
        employee.setBirth(new Date());
        Department department = new Department();
        department.setId(2);
        employee.setDepartment(department);
        employee.setEmail("LI");
        employee.setGender(1);
        employee.setId(2);

        boolean b = employeeMapper.addEmployee(employee);
        Assert.isTrue(b,"addEmployee() should return true");
    }

    @Test
    public void testUpdateEmployee( ) {

        Employee employee = new Employee();
        employee.setBirth(new Date());
        Department department = new Department();
        department.setId(2);
        employee.setDepartment(department);
        employee.setEmail("zhang");
        employee.setGender(0);
        employee.setId(2);

        boolean b = employeeMapper.updateEmployee(employee);
        Assert.isTrue(b,"updateEmployee() should return true");
    }

    @Test
    public void testDelEmployeeById( ) {

        boolean b = employeeMapper.delEmployeeById(2);
        Assert.isTrue(b,"delEmplyee() should return true");
    }
}
