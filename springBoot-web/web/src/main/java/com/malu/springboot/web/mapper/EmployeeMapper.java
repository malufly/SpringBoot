package com.malu.springboot.web.mapper;

import com.malu.springboot.web.entities.Employee;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 4:45 下午
 */
public interface EmployeeMapper {

    List<Employee> listEmployee();

    Employee getEmployee(Integer id);

    boolean addEmployee(Employee employee);

    boolean updateEmployee(Employee employee);

    boolean delEmployeeById(Integer id);

}
