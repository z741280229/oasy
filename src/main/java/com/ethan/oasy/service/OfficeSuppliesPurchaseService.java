package com.ethan.oasy.service;

import com.ethan.oasy.pojo.OfficeSuppliesPurchase;

import java.util.List;

/**
 * 物品采购接口
 */
public interface OfficeSuppliesPurchaseService {
    int insertOfficeSuppliesPurchase(OfficeSuppliesPurchase officeSuppliesPurchase);
    int deleteOfficeSuppliesPurchase(String id);
    int updateOfficeSuppliesPurchase(OfficeSuppliesPurchase officeSuppliesPurchase);
    OfficeSuppliesPurchase findById(String id);
    List<OfficeSuppliesPurchase> findAll();
}
