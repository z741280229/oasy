package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.CarApplication;
import com.ethan.oasy.pojo.CarApplicationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CarApplicationMapper {
    int countByExample(CarApplicationExample example);

    int deleteByExample(CarApplicationExample example);

    int deleteByPrimaryKey(String carAppId);

    int insert(CarApplication record);

    int insertSelective(CarApplication record);

    List<CarApplication> selectByExampleWithBLOBs(CarApplicationExample example);

    List<CarApplication> selectByExample(CarApplicationExample example);

    CarApplication selectByPrimaryKey(String carAppId);

    int updateByExampleSelective(@Param("record") CarApplication record, @Param("example") CarApplicationExample example);

    int updateByExampleWithBLOBs(@Param("record") CarApplication record, @Param("example") CarApplicationExample example);

    int updateByExample(@Param("record") CarApplication record, @Param("example") CarApplicationExample example);

    int updateByPrimaryKeySelective(CarApplication record);

    int updateByPrimaryKeyWithBLOBs(CarApplication record);

    int updateByPrimaryKey(CarApplication record);
}