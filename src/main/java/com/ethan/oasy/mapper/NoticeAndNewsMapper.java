package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.NoticeAndNews;
import com.ethan.oasy.pojo.NoticeAndNewsExample;
import java.util.List;

import com.ethan.oasy.pojo.StaffNoticeAndNews;
import org.apache.ibatis.annotations.Param;

public interface NoticeAndNewsMapper {
    int countByExample(NoticeAndNewsExample example);

    int deleteByExample(NoticeAndNewsExample example);

    int deleteByPrimaryKey(String nId);

    int insert(NoticeAndNews record);

    int insertSelective(NoticeAndNews record);

    List<NoticeAndNews> selectByExampleWithBLOBs(NoticeAndNewsExample example);

    List<NoticeAndNews> selectByExample(NoticeAndNewsExample example);

    NoticeAndNews selectByPrimaryKey(String nId);

    int updateByExampleSelective(@Param("record") NoticeAndNews record, @Param("example") NoticeAndNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") NoticeAndNews record, @Param("example") NoticeAndNewsExample example);

    int updateByExample(@Param("record") NoticeAndNews record, @Param("example") NoticeAndNewsExample example);

    int updateByPrimaryKeySelective(NoticeAndNews record);

    int updateByPrimaryKeyWithBLOBs(NoticeAndNews record);

    int updateByPrimaryKey(NoticeAndNews record);

    List<StaffNoticeAndNews> findAllNoticeAndNewsByStaffId(@Param("staffId") String staffId, @Param("distinguish") Byte distinguish);

    List<NoticeAndNews> findAllNoticeAndNews(@Param("type") Byte type);
}