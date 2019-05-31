package com.ethan.oasy.service.impl;


import com.ethan.oasy.mapper.OfficeSuppliesPurchaseMapper;
import com.ethan.oasy.pojo.OfficeSuppliesPurchase;
import com.ethan.oasy.pojo.OfficeSuppliesPurchaseExample;
import com.ethan.oasy.service.OfficeSuppliesPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description:
 * @author:
 * @create: 2019-04-20 18:30
 */
@Service
@Transactional
public class OfficeSuppliesPurchaseServiceImpl implements OfficeSuppliesPurchaseService {

    @Autowired
    private OfficeSuppliesPurchaseMapper officeSuppliesPurchaseMapper;

    @Override
    public int insertOfficeSuppliesPurchase(OfficeSuppliesPurchase officeSuppliesPurchase) {
        return officeSuppliesPurchaseMapper.insertSelective(officeSuppliesPurchase);
    }

    @Override
    public int deleteOfficeSuppliesPurchase(String id) {
        OfficeSuppliesPurchase officeSuppliesPurchase = new OfficeSuppliesPurchase();
        officeSuppliesPurchase.setOsbId(id);
        officeSuppliesPurchase.setDataStatus(0);
        return officeSuppliesPurchaseMapper.updateByPrimaryKeySelective(officeSuppliesPurchase);
    }

    @Override
    public int updateOfficeSuppliesPurchase(OfficeSuppliesPurchase officeSuppliesPurchase) {
        return officeSuppliesPurchaseMapper.updateByPrimaryKeySelective(officeSuppliesPurchase);
    }

    @Override
    public OfficeSuppliesPurchase findById(String id) {
        return officeSuppliesPurchaseMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OfficeSuppliesPurchase> findAll() {
        /*OfficeSuppliesPurchaseExample example = new OfficeSuppliesPurchaseExample();
        OfficeSuppliesPurchaseExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andOsbIdIsNotNull();
        return officeSuppliesPurchaseMapper.selectByExample(example);*/
        return officeSuppliesPurchaseMapper.findAll();
    }
}
