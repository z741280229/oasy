package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Staff;

import java.util.List;
import java.util.Map;

public interface StaffService {
    /**
     * 添加员工
     * @param staff
     * @return
     */
    int insertStaff(Staff staff);

    /**
     * 通过ID删除员工
     * @param sId
     * @return
     */
    int deleteStaffById(String sId);

    /**
     * 更新员工信息
     * @param staff
     * @return
     */
    int updateStaffInfo(Staff staff);

    /**
     * 通过员工ID获取员工信息
     * @param sId
     * @return
     */
    Staff findStaffById(String sId);

    /**
     * 获取所有员工信息
     * @return
     */
    List<Staff> findAllStaffInfo();

    /**
     * 查询所有员工工号
     * @return
     */
    List<String> findAllStaffNum();

    /**
     * 登录
     * @param sNum
     * @return
     */
    String getPass(String sNum);

    /**
     * 根据员工工号查询员工信息
     * @param sNum
     * @return
     */
    List<Staff> getStaffByNum(String sNum);

    /**
     * 初始化密码
     * @param staff
     * @return
     */
    int initializePass(Staff staff);

    /**
     * 获取权限
     * @param staffId
     * @return
     */
    Integer findMarkPower(String staffId);
}
