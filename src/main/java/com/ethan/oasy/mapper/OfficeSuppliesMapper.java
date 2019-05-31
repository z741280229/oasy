package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.OfficeSupplies;
import com.ethan.oasy.pojo.OfficeSuppliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeSuppliesMapper {
    int countByExample(OfficeSuppliesExample example);

    int deleteByExample(OfficeSuppliesExample example);

    int deleteByPrimaryKey(String osId);

    int insert(OfficeSupplies record);

    int insertSelective(OfficeSupplies record);

    List<OfficeSupplies> selectByExample(OfficeSuppliesExample example);

    OfficeSupplies selectByPrimaryKey(String osId);

    int updateByExampleSelective(@Param("record") OfficeSupplies record, @Param("example") OfficeSuppliesExample example);

    int updateByExample(@Param("record") OfficeSupplies record, @Param("example") OfficeSuppliesExample example);

    int updateByPrimaryKeySelective(OfficeSupplies record);

    int updateByPrimaryKey(OfficeSupplies record);
}