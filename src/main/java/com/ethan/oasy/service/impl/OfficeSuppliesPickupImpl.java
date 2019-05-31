package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.OfficeSuppliesPickupMapper;
import com.ethan.oasy.pojo.OfficeSuppliesPickup;
import com.ethan.oasy.service.OfficeSuppliesPickupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: oasy
 * @description: 办公用品领用业务层实现类
 * @author: sam
 * @create: 2019-04-22 13:48
 */
@Service
@Transactional
public class OfficeSuppliesPickupImpl implements OfficeSuppliesPickupService {

    @Autowired
    private OfficeSuppliesPickupMapper officeSuppliesPickupMapper;

    @Override
    public int insertOsApp(OfficeSuppliesPickup officeSuppliesPickup) {
        return officeSuppliesPickupMapper.insertSelective(officeSuppliesPickup);
    }

    @Override
    public int deleteOsApp(String ospId) {
        OfficeSuppliesPickup officeSuppliesPickup = new OfficeSuppliesPickup();
        officeSuppliesPickup.setOspId(ospId);
        officeSuppliesPickup.setDataStatus(0);
        return officeSuppliesPickupMapper.updateByPrimaryKeySelective(officeSuppliesPickup);
    }

    @Override
    public int updateOsApp(OfficeSuppliesPickup officeSuppliesPickup) {
        return officeSuppliesPickupMapper.updateByPrimaryKeySelective(officeSuppliesPickup);
    }

    @Override
    public List<OfficeSuppliesPickup> getAll() {
        return officeSuppliesPickupMapper.getAll();
    }

    @Override
    public List<OfficeSuppliesPickup> getMyAll(String staffId) {
        return officeSuppliesPickupMapper.getMyAll(staffId);
    }

    @Override
    public OfficeSuppliesPickup getOsAppById(String ospId) {
        return officeSuppliesPickupMapper.getOsAppById(ospId);
    }

    @Override
    public List<OfficeSuppliesPickup> getApps(String staffId, Integer status) {
        return officeSuppliesPickupMapper.getApps(staffId,status);
    }
}
