package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Resources;
import com.ethan.oasy.pojo.ResourcesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResourcesMapper {
    int countByExample(ResourcesExample example);

    int deleteByExample(ResourcesExample example);

    int insert(Resources record);

    int insertSelective(Resources record);

    List<Resources> selectByExample(ResourcesExample example);

    int updateByExampleSelective(@Param("record") Resources record, @Param("example") ResourcesExample example);

    int updateByExample(@Param("record") Resources record, @Param("example") ResourcesExample example);

    List<Resources> getAllResourse(@Param("markPower") Integer markPower, @Param("staffId") String staffId);
}