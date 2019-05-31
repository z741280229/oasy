package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Car;
import com.ethan.oasy.pojo.CarApplication;

import java.util.List;

/**
 * 车辆申请接口
 */
public interface CarApplicationService {
    int addCarApplication(CarApplication carApplication);
    int deleteCarApplication(String carAppId);
    int updatecarApp(CarApplication carApplication);
    CarApplication getCarApp(String carAppId);
    List<CarApplication> getAllApp();
    List<CarApplication> getMyAllApp(String staffId);
    List<CarApplication> getMyDealApp(String staffId);
    List<Car> getCanUseCar();
}
