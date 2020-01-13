package com.malu.springboot.cache.mapper;

import com.malu.springboot.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 4:41 下午
 */


public interface DepartmentMapper {


    Department selectDepartment(Integer id);

    List<Department> selectAll();

    boolean insertDepartment(Department department);

    boolean deleteDepartment(Integer id);

    boolean updateDepartment(Department department);


}
