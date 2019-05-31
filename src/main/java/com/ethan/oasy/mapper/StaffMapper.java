package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.pojo.StaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffMapper {
    int countByExample(StaffExample example);

    int deleteByExample(StaffExample example);

    int deleteByPrimaryKey(String staffId);

    int insert(Staff record);

    int insertSelective(Staff record);

    List<Staff> selectByExampleWithBLOBs(StaffExample example);

    List<Staff> selectByExample(StaffExample example);

    Staff selectByPrimaryKey(String staffId);

    int updateByExampleSelective(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExampleWithBLOBs(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByExample(@Param("record") Staff record, @Param("example") StaffExample example);

    int updateByPrimaryKeySelective(Staff record);

    int updateByPrimaryKeyWithBLOBs(Staff record);

    int updateByPrimaryKey(Staff record);

    List<String> findAllStaffNum();

    String getPass(@Param("sNum") String sNum);

    Integer findMarkPower(@Param("staffId") String staffId);
}