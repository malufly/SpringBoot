package com.malu.springboot.cache.service;

import com.malu.springboot.cache.bean.Department;
import org.omg.CORBA.portable.ValueOutputStream;
import org.omg.PortableInterceptor.INACTIVE;
import sun.reflect.generics.tree.VoidDescriptor;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 7:56 下午
 */
public interface DepartmentService {

    List<Department> listDepartment();

    Department getDepartmentById(Integer id);

    Department addDepartment(Department department);

    void delDepartment(Integer id);

    Department updateDepartment(Department department);

}
