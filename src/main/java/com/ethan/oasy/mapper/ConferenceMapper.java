package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Conference;
import com.ethan.oasy.pojo.ConferenceExample;
import com.ethan.oasy.pojo.ConferenceWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ConferenceMapper {
    int countByExample(ConferenceExample example);

    int deleteByExample(ConferenceExample example);

    int deleteByPrimaryKey(String conId);

    int insert(ConferenceWithBLOBs record);

    int insertSelective(ConferenceWithBLOBs record);

    List<ConferenceWithBLOBs> selectByExampleWithBLOBs(ConferenceExample example);

    List<Conference> selectByExample(ConferenceExample example);

    ConferenceWithBLOBs selectByPrimaryKey(String conId);

    int updateByExampleSelective(@Param("record") ConferenceWithBLOBs record, @Param("example") ConferenceExample example);

    int updateByExampleWithBLOBs(@Param("record") ConferenceWithBLOBs record, @Param("example") ConferenceExample example);

    int updateByExample(@Param("record") Conference record, @Param("example") ConferenceExample example);

    int updateByPrimaryKeySelective(ConferenceWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ConferenceWithBLOBs record);

    int updateByPrimaryKey(Conference record);

    List<ConferenceWithBLOBs> getMyAll(@Param("staffId") String staffId);

    List<ConferenceWithBLOBs> getMyDealConference(@Param("staffId") String staffId,@Param("status") Integer status);
}