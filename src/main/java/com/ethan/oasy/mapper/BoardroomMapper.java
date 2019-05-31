package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Boardroom;
import com.ethan.oasy.pojo.BoardroomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardroomMapper {
    int countByExample(BoardroomExample example);

    int deleteByExample(BoardroomExample example);

    int deleteByPrimaryKey(Integer bdId);

    int insert(Boardroom record);

    int insertSelective(Boardroom record);

    List<Boardroom> selectByExample(BoardroomExample example);

    Boardroom selectByPrimaryKey(Integer bdId);

    int updateByExampleSelective(@Param("record") Boardroom record, @Param("example") BoardroomExample example);

    int updateByExample(@Param("record") Boardroom record, @Param("example") BoardroomExample example);

    int updateByPrimaryKeySelective(Boardroom record);

    int updateByPrimaryKey(Boardroom record);
}