package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Department;
import com.ethan.oasy.pojo.DepartmentDetails;

import java.util.List;

/**
 * 部门接口
 */
public interface DepartmentService {

    /**
     * 添加部门
     * @param department
     * @return
     */
    int insertDepartment(Department department);

    /**
     * 查询所有部门
     * @return
     */
    List<DepartmentDetails> findAllDepartments();

    /**
     * 查找所有子部门
     * @param parentId
     * @return
     */
    List<DepartmentDetails> findChildDepartment(String parentId);

    /**
     * 删除部门
     * @param departId
     * @return
     */
    int deleteDepart(String departId);

    /**
     * 按ID查找返回集合类型
     * @param departId
     * @return
     */
    List<DepartmentDetails> findDepartByIdToList(String departId);

    /**
     * 查询所有顶级部门
     * @return
     */
    List<DepartmentDetails> findTopDepartment();

    /**
     * 查询部门
     * @param departId
     * @return
     */
    Department findDepartment(String departId);

    /**
     * 更新部门信息
     * @param department
     * @return
     */
    int updateDepartment(Department department);
}
