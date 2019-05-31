package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.ConferencePart;
import com.ethan.oasy.pojo.ConferencePartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConferencePartMapper {
    int countByExample(ConferencePartExample example);

    int deleteByExample(ConferencePartExample example);

    int insert(ConferencePart record);

    int insertSelective(ConferencePart record);

    List<ConferencePart> selectByExample(ConferencePartExample example);

    int updateByExampleSelective(@Param("record") ConferencePart record, @Param("example") ConferencePartExample example);

    int updateByExample(@Param("record") ConferencePart record, @Param("example") ConferencePartExample example);
}