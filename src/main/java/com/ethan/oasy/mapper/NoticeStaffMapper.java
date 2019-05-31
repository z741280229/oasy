package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.NoticeStaff;
import com.ethan.oasy.pojo.NoticeStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NoticeStaffMapper {
    int countByExample(NoticeStaffExample example);

    int deleteByExample(NoticeStaffExample example);

    int deleteByPrimaryKey(String ncId);

    int insert(NoticeStaff record);

    int insertSelective(NoticeStaff record);

    List<NoticeStaff> selectByExample(NoticeStaffExample example);

    NoticeStaff selectByPrimaryKey(String ncId);

    int updateByExampleSelective(@Param("record") NoticeStaff record, @Param("example") NoticeStaffExample example);

    int updateByExample(@Param("record") NoticeStaff record, @Param("example") NoticeStaffExample example);

    int updateByPrimaryKeySelective(NoticeStaff record);

    int updateByPrimaryKey(NoticeStaff record);
}