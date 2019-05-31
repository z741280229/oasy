package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.DepartmentMapper;
import com.ethan.oasy.pojo.Department;
import com.ethan.oasy.pojo.DepartmentDetails;
import com.ethan.oasy.pojo.DepartmentExample;
import com.ethan.oasy.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: oasy
 * @description: 部门业务层实现类
 * @author: sam
 * @create: 2019-03-31 18:40
 */
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public int insertDepartment(Department department) {
        return departmentMapper.insertSelective(department);
    }

    @Override
    public List<DepartmentDetails> findAllDepartments() {
       return departmentMapper.findAllDepartments();
    }

    @Override
    public List<DepartmentDetails> findChildDepartment(String parentId) {
        return departmentMapper.findChildDepartment(parentId);
    }

    @Override
    public int deleteDepart(String departId) {
        Department department = new Department();
        department.setDepartId(departId);
        department.setDataStatus(Byte.valueOf("0"));
        return departmentMapper.updateByPrimaryKeySelective(department);
    }

    @Override
    public List<DepartmentDetails> findDepartByIdToList(String departId) {
        DepartmentExample example = new DepartmentExample();
        DepartmentExample.Criteria criteria = example.createCriteria();
        criteria.andDepartIdEqualTo(departId);
        List<Department> departments = departmentMapper.selectByExample(example);
        List<DepartmentDetails> departmentDetails = new ArrayList<>();
        for (Department department: departments) {
            DepartmentDetails depart = new DepartmentDetails();
            depart.setDepartId(department.getDepartId());
            depart.setParentId(department.getParentId());
            departmentDetails.add(depart);
        }

        return departmentDetails;
    }

    @Override
    public List<DepartmentDetails> findTopDepartment() {
        return departmentMapper.findTopDepartment();
    }

    @Override
    public Department findDepartment(String departId) {
        return departmentMapper.selectByPrimaryKey(departId);
    }

    @Override
    public int updateDepartment(Department department) {
        return departmentMapper.updateByPrimaryKeySelective(department);
    }
}
