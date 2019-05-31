package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.ResourcesMapper;
import com.ethan.oasy.pojo.Resources;
import com.ethan.oasy.pojo.ResourcesExample;
import com.ethan.oasy.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description:
 * @author:
 * @create: 2019-03-31 15:56
 */
@Service
@Transactional
public class SystemServiceImpl implements SystemService {

    @Autowired
    private ResourcesMapper resourcesMapper;

    @Override
    public List<Resources> findAll() {
        ResourcesExample example = new ResourcesExample();
        ResourcesExample.Criteria criteria = example.createCriteria();
        criteria.andIdIsNotNull();
        return resourcesMapper.selectByExample(example);
    }

    @Override
    public List<Resources> getAllResourse(Integer markPower, String staffId) {
        return resourcesMapper.getAllResourse(markPower,staffId);
    }


}
