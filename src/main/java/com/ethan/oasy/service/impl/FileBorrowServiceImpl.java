package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.FileBorrowMapper;
import com.ethan.oasy.mapper.FileMapper;
import com.ethan.oasy.pojo.File;
import com.ethan.oasy.pojo.FileBorrow;
import com.ethan.oasy.pojo.FileBorrowExample;
import com.ethan.oasy.pojo.FileExample;
import com.ethan.oasy.service.FileBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 档案借阅实现类
 * @author: sam
 * @create: 2019-04-24 15:44
 */
@Service
@Transactional
public class FileBorrowServiceImpl implements FileBorrowService {

    @Autowired
    private FileBorrowMapper fileBorrowMapper;

    @Autowired
    private FileMapper fileMapper;


    @Override
    public int addFileBorrow(FileBorrow fileBorrow) {
        return fileBorrowMapper.insertSelective(fileBorrow);
    }

    @Override
    public int updateFileBorrow(FileBorrow fileBorrow) {
        return fileBorrowMapper.updateByPrimaryKeySelective(fileBorrow);
    }

    @Override
    public int deleteFileBorrow(String fbId) {
        FileBorrow fileBorrow = new FileBorrow();
        fileBorrow.setFileBorrowId(fbId);
        fileBorrow.setDataStatus(0);
        return fileBorrowMapper.updateByPrimaryKeySelective(fileBorrow);
    }

    @Override
    public FileBorrow getFileBorrowById(String fbId) {
        return fileBorrowMapper.selectByPrimaryKey(fbId);
    }

    @Override
    public List<FileBorrow> getAll() {
        FileBorrowExample example = new FileBorrowExample();
        FileBorrowExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andFileBorrowIdIsNotNull();
        return fileBorrowMapper.selectByExample(example);
    }

    @Override
    public List<FileBorrow> getMyAll(String borrowerId) {
        FileBorrowExample example = new FileBorrowExample();
        FileBorrowExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andFileBorrowIdIsNotNull();
        criteria.andBorrowerIdEqualTo(borrowerId);
        return fileBorrowMapper.selectByExample(example);
    }

    @Override
    public List<File> getNotBorrowFile() {
        FileExample example = new FileExample();
        FileExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andFileStatusEqualTo(1);
        criteria.andFileIdIsNotNull();
        return fileMapper.selectByExample(example);
    }
}
