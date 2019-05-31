package com.ethan.oasy.service;

import com.ethan.oasy.pojo.OfficeSupplies;
import com.ethan.oasy.pojo.OfficeSuppliesCheckLog;

import java.util.List;

/**
 * 办公用品规格实现类
 */
public interface OfficeSuppliesService {
    int insertOfficeSupplies(OfficeSupplies officeSupplies);
    int deleteOfficeSupplies(String osId);
    int updateOfficeSupplies(OfficeSupplies officeSupplies);
    OfficeSupplies findOfficeSuppliesById(String osId);
    List<OfficeSupplies> findAll();
    int insertCheckLog(OfficeSuppliesCheckLog officeSuppliesCheckLog);
    int updateCheckLog(OfficeSuppliesCheckLog officeSuppliesCheckLog);
    List<OfficeSuppliesCheckLog> findAllLog();
}
