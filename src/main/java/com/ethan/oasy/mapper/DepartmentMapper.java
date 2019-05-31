package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Department;
import com.ethan.oasy.pojo.DepartmentDetails;
import com.ethan.oasy.pojo.DepartmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    int countByExample(DepartmentExample example);

    int deleteByExample(DepartmentExample example);

    int deleteByPrimaryKey(String departId);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExampleWithBLOBs(DepartmentExample example);

    List<Department> selectByExample(DepartmentExample example);

    Department selectByPrimaryKey(String departId);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExampleWithBLOBs(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentExample example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKeyWithBLOBs(Department record);

    int updateByPrimaryKey(Department record);

    /**
     * 查询部门详情
     * @return
     */
    List<DepartmentDetails> findAllDepartments();

    /**
     * 查询子部门
     * @param parentId
     * @return
     */
    List<DepartmentDetails> findChildDepartment(@Param("parentId") String parentId);

    /**
     * 查询所有顶级部门
     * @return
     */
    List<DepartmentDetails> findTopDepartment();
}