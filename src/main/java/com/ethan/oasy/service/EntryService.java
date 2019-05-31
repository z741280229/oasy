package com.ethan.oasy.service;

import com.ethan.oasy.pojo.EntryWithBLOBs;

/**
 * 入职申请单
 */
public interface EntryService {
    /**
     * 插入入职申请
     * @param entryWithBLOBs
     * @return
     */
    int addEntry(EntryWithBLOBs entryWithBLOBs);

    /**
     * 获取某个入职申请
     * @param enId
     * @return
     */
    EntryWithBLOBs getEntryWithBLOBsById(String enId);

    /**
     * 更新入职申请
     * @param entryWithBLOBs
     * @return
     */
    int updateEntry(EntryWithBLOBs entryWithBLOBs);
}
