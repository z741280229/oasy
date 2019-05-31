package com.ethan.oasy.service;

import com.ethan.oasy.pojo.OfficeSuppliesPickup;

import java.util.List;

/**
 * 办公用品领用业务层
 */
public interface OfficeSuppliesPickupService {
    /**
     * 插入申请
     * @param officeSuppliesPickup
     * @return
     */
    int insertOsApp(OfficeSuppliesPickup officeSuppliesPickup);

    /**
     * 删除领用
     * @param ospId
     * @return
     */
    int deleteOsApp(String ospId);

    /**
     * 更新领用过程
     * @param officeSuppliesPickup
     * @return
     */
    int updateOsApp(OfficeSuppliesPickup officeSuppliesPickup);

    /**
     * 获取所有领用清单
     * @return
     */
    List<OfficeSuppliesPickup> getAll();

    /**
     * 我的所有领用物品
     * @param staffId
     * @return
     */
    List<OfficeSuppliesPickup> getMyAll(String staffId);

    /**
     * 获取某一个领用详情
     * @param ospId
     * @return
     */
    OfficeSuppliesPickup getOsAppById(String ospId);

    /**
     * 获取我的待审批
     * @param staffId
     * @param status
     * @return
     */
    List<OfficeSuppliesPickup> getApps(String staffId,Integer status);
}

