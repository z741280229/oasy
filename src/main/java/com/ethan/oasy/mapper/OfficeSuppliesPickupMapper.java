package com.ethan.oasy.mapper;

import com.ethan.oasy.pojo.OfficeSuppliesPickup;
import com.ethan.oasy.pojo.OfficeSuppliesPickupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OfficeSuppliesPickupMapper {
    int countByExample(OfficeSuppliesPickupExample example);

    int deleteByExample(OfficeSuppliesPickupExample example);

    int deleteByPrimaryKey(String ospId);

    int insert(OfficeSuppliesPickup record);

    int insertSelective(OfficeSuppliesPickup record);

    List<OfficeSuppliesPickup> selectByExampleWithBLOBs(OfficeSuppliesPickupExample example);

    List<OfficeSuppliesPickup> selectByExample(OfficeSuppliesPickupExample example);

    OfficeSuppliesPickup selectByPrimaryKey(String ospId);

    int updateByExampleSelective(@Param("record") OfficeSuppliesPickup record, @Param("example") OfficeSuppliesPickupExample example);

    int updateByExampleWithBLOBs(@Param("record") OfficeSuppliesPickup record, @Param("example") OfficeSuppliesPickupExample example);

    int updateByExample(@Param("record") OfficeSuppliesPickup record, @Param("example") OfficeSuppliesPickupExample example);

    int updateByPrimaryKeySelective(OfficeSuppliesPickup record);

    int updateByPrimaryKeyWithBLOBs(OfficeSuppliesPickup record);

    int updateByPrimaryKey(OfficeSuppliesPickup record);

    List<OfficeSuppliesPickup> getAll();

    List<OfficeSuppliesPickup> getMyAll(@Param("staffId") String staffId);

    OfficeSuppliesPickup getOsAppById(@Param("ospId")  String ospId);

    List<OfficeSuppliesPickup> getApps(@Param("staffId") String staffId,@Param("status") Integer status);
}