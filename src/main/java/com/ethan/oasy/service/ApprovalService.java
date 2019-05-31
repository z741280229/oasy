package com.ethan.oasy.service;

import com.ethan.oasy.pojo.ApprovalList;
import com.ethan.oasy.pojo.Entry;
import com.ethan.oasy.pojo.EntryWithBLOBs;

import java.util.List;

/**
 *
 *审批流转业务层接口
 */
public interface ApprovalService {

    /**
     * 获取所有流程菜单
     * @return
     */
    List<ApprovalList> getMenu();




}
