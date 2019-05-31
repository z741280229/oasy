package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.CarApplicationMapper;
import com.ethan.oasy.mapper.CarMapper;
import com.ethan.oasy.pojo.Car;
import com.ethan.oasy.pojo.CarApplication;
import com.ethan.oasy.pojo.CarApplicationExample;
import com.ethan.oasy.pojo.CarExample;
import com.ethan.oasy.service.CarApplicationService;
import com.ethan.oasy.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.swing.text.Caret;
import java.util.List;

/**
 * @program: oasy
 * @description: 车辆申请业务层实现类
 * @author: sam
 * @create: 2019-04-24 22:56
 */
@Service
@Transactional
public class CarApplicationServiceImpl implements CarApplicationService {

    @Autowired
    private CarApplicationMapper carApplicationMapper;

    @Autowired
    private CarMapper carMapper;

    @Override
    public int addCarApplication(CarApplication carApplication) {
        return carApplicationMapper.insertSelective(carApplication);
    }

    @Override
    public int deleteCarApplication(String carAppId) {
        CarApplication carApplication = new CarApplication();
        carApplication.setCarAppId(carAppId);
        carApplication.setDataStatus(0);
        return carApplicationMapper.updateByPrimaryKeySelective(carApplication);
    }

    @Override
    public int updatecarApp(CarApplication carApplication) {
        return carApplicationMapper.updateByPrimaryKeySelective(carApplication);
    }

    @Override
    public CarApplication getCarApp(String carAppId) {
        return carApplicationMapper.selectByPrimaryKey(carAppId);
    }

    @Override
    public List<CarApplication> getAllApp() {
        CarApplicationExample example = new CarApplicationExample();
        CarApplicationExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andCarAppIdIsNotNull();
        return carApplicationMapper.selectByExample(example);
    }

    @Override
    public List<CarApplication> getMyAllApp(String staffId) {
        CarApplicationExample example = new CarApplicationExample();
        CarApplicationExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andCarAppIdIsNotNull();
        criteria.andCarAppUserIdEqualTo(staffId);
        return carApplicationMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<CarApplication> getMyDealApp(String staffId) {
        CarApplicationExample example = new CarApplicationExample();
        CarApplicationExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andCarAppIdIsNotNull();
        criteria.andToStaffEqualTo(staffId);
        criteria.andCarAppStatusEqualTo(0);
        return carApplicationMapper.selectByExampleWithBLOBs(example);
    }

    @Override
    public List<Car> getCanUseCar() {
        CarExample example = new CarExample();
        CarExample.Criteria criteria = example.createCriteria();
        criteria.andCarIdIsNotNull();
        criteria.andDataStatusEqualTo(1);
        criteria.andCarStatusEqualTo(1);
        return carMapper.selectByExample(example);
    }
}
