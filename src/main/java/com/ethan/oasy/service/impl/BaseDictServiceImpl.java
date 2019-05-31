package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.DictionaryMapper;
import com.ethan.oasy.pojo.Dictionary;
import com.ethan.oasy.pojo.DictionaryExample;
import com.ethan.oasy.service.BaseDictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: oasy
 * @description: 字典类型业务层
 * @author: sam
 * @create: 2019-04-02 16:21
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {

    @Autowired
    private DictionaryMapper dictionaryMapper;

    @Override
    public List<Dictionary> findTypes(String typeId) {
        DictionaryExample example = new DictionaryExample();
        DictionaryExample.Criteria criteria = example.createCriteria();
        criteria.andDictTypeIdEqualTo(typeId);
        return dictionaryMapper.selectByExample(example);
    }

    @Override
    public Dictionary findById(Integer dId) {
        return dictionaryMapper.selectByPrimaryKey(dId);
    }
}
