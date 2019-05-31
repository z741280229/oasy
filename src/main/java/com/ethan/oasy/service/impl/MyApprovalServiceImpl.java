package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.EntryMapper;
import com.ethan.oasy.mapper.MyApprovalMapper;
import com.ethan.oasy.pojo.EntryExample;
import com.ethan.oasy.pojo.EntryWithBLOBs;
import com.ethan.oasy.pojo.MyApproval;
import com.ethan.oasy.pojo.MyApprovalExample;
import com.ethan.oasy.service.MyApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description:
 * @author:
 * @create: 2019-05-03 20:30
 */

@Service
@Transactional
public class MyApprovalServiceImpl implements MyApprovalService {

    @Autowired
    private MyApprovalMapper myApprovalMapper;

    @Autowired
    private EntryMapper entryMapper;

    @Override
    public int addMyApproval(MyApproval myApproval) {
        return myApprovalMapper.insertSelective(myApproval);
    }

    @Override
    public List<EntryWithBLOBs> getMylist(String staffId) {
        EntryExample example = new EntryExample();
        EntryExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andStaffIdEqualTo(staffId);
        criteria.andEnIdIsNotNull();
        return entryMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<MyApproval> getMyLIstById(String myPrId) {
        return myApprovalMapper.getMyLIstById(myPrId);
    }

    @Override
    public List<MyApproval> getMydealById(String staffId) {
        MyApprovalExample example = new MyApprovalExample();
        MyApprovalExample.Criteria criteria = example.createCriteria();
        criteria.andMyapIdIsNotNull();
        criteria.andPrStaffIdEqualTo(staffId);
        criteria.andDataStatusEqualTo(1);
        return myApprovalMapper.selectByExample(example);
    }

    @Override
    public int updateApproval(MyApproval myApproval) {
        MyApprovalExample example = new MyApprovalExample();
        MyApprovalExample.Criteria criteria = example.createCriteria();
        criteria.andPrStaffIdEqualTo(myApproval.getPrStaffId());
        criteria.andMyapIdEqualTo(myApproval.getMyapId());
        return myApprovalMapper.updateByExampleSelective(myApproval,example);
    }
}
