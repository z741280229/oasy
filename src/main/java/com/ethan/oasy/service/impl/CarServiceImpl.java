package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.CarMapper;
import com.ethan.oasy.pojo.Car;
import com.ethan.oasy.pojo.CarExample;
import com.ethan.oasy.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 车辆业务层
 * @author: sam
 * @create: 2019-04-24 18:57
 */
@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarMapper carMapper;

    @Override
    public int addCar(Car car) {
        return carMapper.insertSelective(car);
    }

    @Override
    public int deteleCar(String carId) {
        Car car = new Car();
        car.setCarId(carId);
        car.setDataStatus(0);
        return carMapper.updateByPrimaryKeySelective(car);
    }

    @Override
    public int updateCar(Car car) {
        return carMapper.updateByPrimaryKeySelective(car);
    }

    @Override
    public Car getCarById(String carId) {
        return carMapper.selectByPrimaryKey(carId);
    }

    @Override
    public List<Car> getAll() {
        CarExample example = new CarExample();
        CarExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andCarIdIsNotNull();
        return carMapper.selectByExample(example);
    }
}
