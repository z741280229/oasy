package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.StaffJob;
import com.ethan.oasy.pojo.StaffJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StaffJobMapper {
    int countByExample(StaffJobExample example);

    int deleteByExample(StaffJobExample example);

    int insert(StaffJob record);

    int insertSelective(StaffJob record);

    List<StaffJob> selectByExample(StaffJobExample example);

    int updateByExampleSelective(@Param("record") StaffJob record, @Param("example") StaffJobExample example);

    int updateByExample(@Param("record") StaffJob record, @Param("example") StaffJobExample example);
}