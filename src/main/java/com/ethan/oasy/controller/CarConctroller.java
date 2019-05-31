package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Car;
import com.ethan.oasy.pojo.Dictionary;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.CarService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: oasy
 * @description: 车辆
 * @author: sam
 * @create: 2019-04-24 19:04
 */
@Controller
@RequestMapping("/car")
public class CarConctroller {

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private CarService carService;

    @Value("${car_type}")
    private String car_type;


    /**
     * 获取汽车列表
     * @param model
     * @return
     */
    @RequestMapping("list")
    public String getAllCar(Model model){
        try{
            //获取汽车信息
            List<Car> all = carService.getAll();
            //获取汽车类型
            List<Dictionary> types = baseDictService.findTypes(car_type);
            model.addAttribute("list",all);
            model.addAttribute("types",types);
            return "car/carList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    /**
     * 新增车辆（管理员）
     * @param car
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String  addCar(Car car){
        try {
            car.setCarId(BaseUtils.getUUID());
            carService.addCar(car);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 删除车辆（管理员）
     * @param carId
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteCar(String carId){
        try {
            carService.deteleCar(carId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 更新车辆
     * @param car
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String updateCar(Car car){
        try {
            carService.updateCar(car);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 回显汽车信息
     * @param carId
     * @return
     */
    @RequestMapping(value = "edit")
    @ResponseBody
    public Car editCar(String carId) throws Exception{
        return carService.getCarById(carId);
    }

}
