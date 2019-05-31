package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.ApprovalListMapper;
import com.ethan.oasy.mapper.EntryMapper;
import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.ApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @program: oasy
 * @description:
 * @author:
 * @create: 2019-05-03 10:43
 */

@Service
@Transactional
public class ApprovalServiceImpl implements ApprovalService {

    @Autowired
    private ApprovalListMapper approvalListMapper;



    @Override
    public List<ApprovalList> getMenu() {
        ApprovalListExample example = new ApprovalListExample();
        ApprovalListExample.Criteria criteria = example.createCriteria();
        criteria.andAlIdIsNotNull();
        criteria.andDataStatusEqualTo(1);
        return approvalListMapper.selectByExample(example);
    }


}
