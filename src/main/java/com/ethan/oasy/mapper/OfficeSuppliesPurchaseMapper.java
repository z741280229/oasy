package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.OfficeSuppliesPurchase;
import com.ethan.oasy.pojo.OfficeSuppliesPurchaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeSuppliesPurchaseMapper {
    int countByExample(OfficeSuppliesPurchaseExample example);

    int deleteByExample(OfficeSuppliesPurchaseExample example);

    int deleteByPrimaryKey(String osbId);

    int insert(OfficeSuppliesPurchase record);

    int insertSelective(OfficeSuppliesPurchase record);

    List<OfficeSuppliesPurchase> selectByExample(OfficeSuppliesPurchaseExample example);

    OfficeSuppliesPurchase selectByPrimaryKey(String osbId);

    int updateByExampleSelective(@Param("record") OfficeSuppliesPurchase record, @Param("example") OfficeSuppliesPurchaseExample example);

    int updateByExample(@Param("record") OfficeSuppliesPurchase record, @Param("example") OfficeSuppliesPurchaseExample example);

    int updateByPrimaryKeySelective(OfficeSuppliesPurchase record);

    int updateByPrimaryKey(OfficeSuppliesPurchase record);

    List<OfficeSuppliesPurchase> findAll();
}