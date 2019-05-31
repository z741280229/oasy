package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Attence;
import com.ethan.oasy.pojo.AttenceCount;
import com.ethan.oasy.pojo.AttenceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttenceMapper {
    int countByExample(AttenceExample example);

    int deleteByExample(AttenceExample example);

    int deleteByPrimaryKey(String attId);

    int insert(Attence record);

    int insertSelective(Attence record);

    List<Attence> selectByExample(AttenceExample example);

    Attence selectByPrimaryKey(String attId);

    int updateByExampleSelective(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByExample(@Param("record") Attence record, @Param("example") AttenceExample example);

    int updateByPrimaryKeySelective(Attence record);

    int updateByPrimaryKey(Attence record);

    List<AttenceCount> getCount();
}