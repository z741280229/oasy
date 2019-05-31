package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.StaffMapper;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.pojo.StaffExample;
import com.ethan.oasy.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 员工业务层实现类
 * @author: sam
 * @create: 2019-03-20 20:18
 */
@Service
@Transactional
public class StaffServiceImpl implements StaffService {

   @Autowired
    private StaffMapper staffMapper;

    @Override
    public int insertStaff(Staff staff) {
        return staffMapper.insertSelective(staff);
    }

    @Override
    public int deleteStaffById(String sId) {
        Staff staff = new Staff();
        staff.setStaffId(sId);
        staff.setDataStatus(Byte.valueOf("0"));
        return staffMapper.updateByPrimaryKeySelective(staff);
    }

    @Override
    public int updateStaffInfo(Staff staff) {
        return staffMapper.updateByPrimaryKeySelective(staff);
    }

    @Override
    public Staff findStaffById(String sId) {
        return staffMapper.selectByPrimaryKey(sId);
    }

    @Override
    public List<Staff> findAllStaffInfo() {
        StaffExample example = new StaffExample();
        StaffExample.Criteria criteria = example.createCriteria();
        criteria.andStaffIdIsNotNull();  //员工ID不为空
        criteria.andDataStatusEqualTo(Byte.valueOf("1"));
        return staffMapper.selectByExample(example);
    }

    @Override
    public List<String> findAllStaffNum() {
        return staffMapper.findAllStaffNum();
    }

    @Override
    public String getPass(String sNum) {
        return staffMapper.getPass(sNum);
    }

    @Override
    public List<Staff> getStaffByNum(String sNum) {
        StaffExample example = new StaffExample();
        StaffExample.Criteria criteria = example.createCriteria();
        criteria.andStaffAccNumEqualTo(sNum);
        criteria.andDataStatusEqualTo(Byte.valueOf("1"));
        return staffMapper.selectByExample(example);
    }

    @Override
    public int initializePass(Staff staff) {
        return staffMapper.updateByPrimaryKeySelective(staff);
    }

    @Override
    public Integer findMarkPower(String staffId) {
        return staffMapper.findMarkPower(staffId);
    }
}
