package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.Procedu;
import com.ethan.oasy.pojo.ProceduExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProceduMapper {
    int countByExample(ProceduExample example);

    int deleteByExample(ProceduExample example);

    int deleteByPrimaryKey(Integer prId);

    int insert(Procedu record);

    int insertSelective(Procedu record);

    List<Procedu> selectByExample(ProceduExample example);

    Procedu selectByPrimaryKey(Integer prId);

    int updateByExampleSelective(@Param("record") Procedu record, @Param("example") ProceduExample example);

    int updateByExample(@Param("record") Procedu record, @Param("example") ProceduExample example);

    int updateByPrimaryKeySelective(Procedu record);

    int updateByPrimaryKey(Procedu record);
}