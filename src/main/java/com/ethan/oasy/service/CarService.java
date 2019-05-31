package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Car;

import java.util.List;

/**
 * 车辆业务层
 */
public interface CarService {
    int addCar(Car car);
    int deteleCar(String carId);
    int updateCar(Car car);
    Car getCarById(String carId);
    List<Car> getAll();
}
