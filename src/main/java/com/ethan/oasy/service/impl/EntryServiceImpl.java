package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.EntryMapper;
import com.ethan.oasy.mapper.MyApprovalMapper;
import com.ethan.oasy.pojo.EntryWithBLOBs;
import com.ethan.oasy.service.EntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.soap.Addressing;

/**
 * @program: oasy
 * @description: 入职申请表单实现类
 * @author: sam
 * @create: 2019-05-03 20:25
 */
@Service
@Transactional
public class EntryServiceImpl implements EntryService {

    @Autowired
    private EntryMapper entryMapper;

    @Override
    public int addEntry(EntryWithBLOBs entryWithBLOBs) {
        return entryMapper.insertSelective(entryWithBLOBs);
    }

    @Override
    public EntryWithBLOBs getEntryWithBLOBsById(String enId) {
        return entryMapper.selectByPrimaryKey(enId);
    }

    @Override
    public int updateEntry(EntryWithBLOBs entryWithBLOBs) {
        return entryMapper.updateByPrimaryKeySelective(entryWithBLOBs);
    }
}
