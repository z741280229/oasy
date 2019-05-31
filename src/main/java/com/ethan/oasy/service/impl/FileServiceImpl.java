package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.FileMapper;
import com.ethan.oasy.pojo.File;
import com.ethan.oasy.pojo.FileExample;
import com.ethan.oasy.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 档案业务层实现类
 * @author: sam
 * @create: 2019-04-23 15:42
 */
@Service
@Transactional
public class FileServiceImpl implements FileService {

    @Autowired
    private FileMapper fileMapper;

    @Override
    public int addFile(File file) {
        return fileMapper.insertSelective(file);
    }

    @Override
    public int deleteFile(String fId) {
        File file = new File();
        file.setFileId(fId);
        file.setDataStatus(0);
        return fileMapper.updateByPrimaryKeySelective(file);
    }

    @Override
    public int updateFile(File file) {
        return fileMapper.updateByPrimaryKeySelective(file);
    }

    @Override
    public File getFileById(String fId) {
        return fileMapper.selectByPrimaryKey(fId);
    }

    @Override
    public List<File> getAllFile() {
        FileExample example = new FileExample();
        FileExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andFileIdIsNotNull();
        return fileMapper.selectByExample(example);
    }

    @Override
    public List<File> getFilesByFileBelong(Integer pId) {
        FileExample example = new FileExample();
        FileExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andFileIdIsNotNull();
        criteria.andFileParentEqualTo(pId);
        return fileMapper.selectByExample(example);
    }
}
