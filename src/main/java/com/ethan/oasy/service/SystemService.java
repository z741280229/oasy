package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Resources;

import java.util.List;

/**
 * 系统管理接口
 */
public interface SystemService {

    /**
     * 查询所有菜单信息
     * @return
     */
    List<Resources> findAll();

    /**
     *根据等级获取菜单列表
     * @param markPower
     * @param staffId
     * @return
     */
    List<Resources> getAllResourse(Integer markPower,String staffId);
}
