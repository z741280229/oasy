package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.AttenceMapper;
import com.ethan.oasy.pojo.Attence;
import com.ethan.oasy.pojo.AttenceCount;
import com.ethan.oasy.pojo.AttenceExample;
import com.ethan.oasy.service.AttenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 考勤业务层实现类
 * @author: sam
 * @create: 2019-05-01 15:02
 */
@Service
@Transactional
public class AttenceServiceImpl implements AttenceService {

    @Autowired
    private AttenceMapper attenceMapper;

    @Override
    public int addAttence(Attence attence) {
        return attenceMapper.insertSelective(attence);
    }

    @Override
    public int deleteAttence(String atId) {
        Attence attence = new Attence();
        attence.setAttId(atId);
        attence.setDataStatus(0);
        return attenceMapper.updateByPrimaryKeySelective(attence);
    }

    @Override
    public int updateAttence(Attence attence) {
        return attenceMapper.updateByPrimaryKeySelective(attence);
    }

    @Override
    public Attence getAttenceById(String btId) {
        return attenceMapper.selectByPrimaryKey(btId);
    }

    @Override
    public List<Attence> getMyAttences(String staffId) {
        AttenceExample example = new AttenceExample();
        AttenceExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andStaffIdEqualTo(staffId);
        criteria.andAttIdIsNotNull();
        return attenceMapper.selectByExample(example);
    }

    @Override
    public List<Attence> getDepartAttences(String departId) {
        AttenceExample example = new AttenceExample();
        AttenceExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andStaffDepartEqualTo(departId);
        criteria.andAttIdIsNotNull();
        return attenceMapper.selectByExample(example);
    }

    @Override
    public List<Attence> getAll() {
        AttenceExample example = new AttenceExample();
        AttenceExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andAttIdIsNotNull();
        return attenceMapper.selectByExample(example);
    }

    @Override
    public List<AttenceCount> getCount() {
        return attenceMapper.getCount();
    }
}
