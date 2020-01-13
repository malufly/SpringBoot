package com.malu.springboot.cache.service.imp;

import com.malu.springboot.cache.bean.Department;
import com.malu.springboot.cache.mapper.DepartmentMapper;
import com.malu.springboot.cache.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malu 763941715@qq.com
 * @version 1.0
 * @date 2020/1/6 7:59 下午
 */

@CacheConfig(cacheNames = {"DepartmentServiceImp"})
@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;



    @Override
    @Cacheable(key = "#root.targetClass")
    public List<Department> listDepartment() {
        List<Department> departments = departmentMapper.selectAll();
        return departments;
    }

    @Override
    @Cacheable(key = "#a0")
    public Department getDepartmentById(Integer id) {
        Department department = departmentMapper.selectDepartment(id);
        return department;
    }

    @Override
    @CachePut(key = "#a0.id")
    @CacheEvict(key = "#root.targetClass")
    public Department addDepartment(Department department) {

        departmentMapper.insertDepartment(department);
        return department;
    }

    @Override
    @Caching(evict = {@CacheEvict(key = "#id",beforeInvocation = true),
                        @CacheEvict(key = "#root.targetClass",beforeInvocation = true)})
    public void delDepartment(Integer id) {

        departmentMapper.deleteDepartment(id);

    }

    @Override
    @Caching(put = {@CachePut(key = "#a0.id")},
            evict = {@CacheEvict(key = "#root.targetClass")})
    public Department updateDepartment(Department department) {

        departmentMapper.updateDepartment(department);
        return department;
    }
}
