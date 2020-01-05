package com.malu.springboot.web.mapper;

import com.malu.springboot.web.entities.Department;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/3 4:44 下午
 */
public interface DepartmentMapper {

    List<Department> listDepartment();

    Department getDepartment(Integer id);

    boolean addDepartment(Department department);

    boolean updateDepartment(Department department);

    boolean delDepartment(Integer id);

}
