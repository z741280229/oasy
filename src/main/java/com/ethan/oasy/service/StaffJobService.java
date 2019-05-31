package com.ethan.oasy.service;

import com.ethan.oasy.pojo.StaffJob;

/**
 * @program: oasy
 * @description: 员工工作
 * @author: sam
 * @create: 2019-04-15 14:38
 */
public interface StaffJobService {

    /**
     * 插入到工作表中
     * @param staffJob
     * @return
     */
    int addMenbers(StaffJob staffJob);
}
