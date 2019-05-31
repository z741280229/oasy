package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.OfficeSuppliesCheckLogMapper;
import com.ethan.oasy.mapper.OfficeSuppliesMapper;
import com.ethan.oasy.pojo.OfficeSupplies;
import com.ethan.oasy.pojo.OfficeSuppliesCheckLog;
import com.ethan.oasy.pojo.OfficeSuppliesCheckLogExample;
import com.ethan.oasy.pojo.OfficeSuppliesExample;
import com.ethan.oasy.service.OfficeSuppliesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 办公用品规格服务类接口实现类
 * @author: sam
 * @create: 2019-04-20 15:59
 */
@Service
@Transactional
public class OfficeSuppliesImpl implements OfficeSuppliesService {

    @Autowired
    private OfficeSuppliesMapper officeSuppliesMapper;

    @Autowired
    private OfficeSuppliesCheckLogMapper officeSuppliesCheckLogMapper;

    @Override
    public int insertOfficeSupplies(OfficeSupplies officeSupplies) {
        return officeSuppliesMapper.insertSelective(officeSupplies);
    }

    @Override
    public int deleteOfficeSupplies(String osId) {
        OfficeSupplies officeSupplies = new OfficeSupplies();
        officeSupplies.setOsId(osId);
        officeSupplies.setDataStatus(0);
        return officeSuppliesMapper.updateByPrimaryKeySelective(officeSupplies);
    }

    @Override
    public int updateOfficeSupplies(OfficeSupplies officeSupplies) {
        return officeSuppliesMapper.updateByPrimaryKeySelective(officeSupplies);
    }

    @Override
    public OfficeSupplies findOfficeSuppliesById(String osId) {
        return officeSuppliesMapper.selectByPrimaryKey(osId);
    }

    @Override
    public List<OfficeSupplies> findAll() {
        OfficeSuppliesExample example = new OfficeSuppliesExample();
        OfficeSuppliesExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andOsIdIsNotNull();
        return officeSuppliesMapper.selectByExample(example);
    }

    @Override
    public int insertCheckLog(OfficeSuppliesCheckLog officeSuppliesCheckLog) {
        return officeSuppliesCheckLogMapper.insertSelective(officeSuppliesCheckLog);
    }

    @Override
    public int updateCheckLog(OfficeSuppliesCheckLog officeSuppliesCheckLog) {
        return officeSuppliesCheckLogMapper.updateByPrimaryKeySelective(officeSuppliesCheckLog);
    }

    @Override
    public List<OfficeSuppliesCheckLog> findAllLog() {
        OfficeSuppliesCheckLogExample example = new OfficeSuppliesCheckLogExample();
        OfficeSuppliesCheckLogExample.Criteria criteria = example.createCriteria();
        criteria.andOsIdIsNull();
        criteria.andDatatstatusEqualTo(1);
        return officeSuppliesCheckLogMapper.selectByExample(example);
    }
}
