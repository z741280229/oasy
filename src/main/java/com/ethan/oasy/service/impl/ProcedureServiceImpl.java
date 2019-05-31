package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.ProceduMapper;
import com.ethan.oasy.pojo.Procedu;
import com.ethan.oasy.pojo.ProceduExample;
import com.ethan.oasy.service.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description:
 * @author:
 * @create: 2019-05-03 20:36
 */

@Service
@Transactional
public class ProcedureServiceImpl implements ProcedureService {

    @Autowired
    private ProceduMapper proceduMapper;

    @Override
    public List<Procedu> getProcedureById(Integer prTypeId) {

        ProceduExample example = new ProceduExample();
        ProceduExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andPrIdIsNotNull();
        criteria.andPrTypeIdEqualTo(prTypeId);
        return proceduMapper.selectByExample(example);
    }
}
