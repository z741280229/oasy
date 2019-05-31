package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.OfficeSuppliesCheckLog;
import com.ethan.oasy.pojo.OfficeSuppliesCheckLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeSuppliesCheckLogMapper {
    int countByExample(OfficeSuppliesCheckLogExample example);

    int deleteByExample(OfficeSuppliesCheckLogExample example);

    int deleteByPrimaryKey(Integer osCheckId);

    int insert(OfficeSuppliesCheckLog record);

    int insertSelective(OfficeSuppliesCheckLog record);

    List<OfficeSuppliesCheckLog> selectByExample(OfficeSuppliesCheckLogExample example);

    OfficeSuppliesCheckLog selectByPrimaryKey(Integer osCheckId);

    int updateByExampleSelective(@Param("record") OfficeSuppliesCheckLog record, @Param("example") OfficeSuppliesCheckLogExample example);

    int updateByExample(@Param("record") OfficeSuppliesCheckLog record, @Param("example") OfficeSuppliesCheckLogExample example);

    int updateByPrimaryKeySelective(OfficeSuppliesCheckLog record);

    int updateByPrimaryKey(OfficeSuppliesCheckLog record);
}