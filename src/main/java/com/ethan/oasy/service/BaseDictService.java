package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Dictionary;

import java.util.List;

public interface BaseDictService {

    /**
     * 获取字典类型
     * @param typeId
     * @return
     */
    List<Dictionary> findTypes(String typeId);

    /**
     * 获取指定类型
     * @param dId
     * @return
     */
    Dictionary findById(Integer dId);
}
