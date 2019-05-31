package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.StaffJobMapper;
import com.ethan.oasy.pojo.StaffJob;
import com.ethan.oasy.service.StaffJobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: oasy
 * @description: 员工工作业务层接口
 * @author: sam
 * @create: 2019-04-15 14:41
 */
@Service
@Transactional
public class StaffJobServiceImpl implements StaffJobService {

    @Autowired
    private StaffJobMapper staffJobMapper;

    @Override
    public int addMenbers(StaffJob staffJob) {
        return staffJobMapper.insertSelective(staffJob);
    }
}
