package com.malu.springboot.cache.mapper;

import com.malu.springboot.cache.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 4:41 下午
 */


public interface EmployeeMapper {

    Employee selectEmployeeById(Integer id);

    List<Employee> selectAll();

    boolean addEmployee(Employee employee);

    boolean deleteEmployeeById(Integer id);

    boolean updateEmployee(Employee employee);


}
