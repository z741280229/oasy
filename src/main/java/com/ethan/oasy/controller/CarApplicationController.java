package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Car;
import com.ethan.oasy.pojo.CarApplication;
import com.ethan.oasy.pojo.Dictionary;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.CarApplicationService;
import com.ethan.oasy.service.CarService;
import com.ethan.oasy.service.StaffService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;

/**
 * @program: oasy
 * @description: 车辆申请
 * @author: sam
 * @create: 2019-04-24 23:08
 */
@Controller
@RequestMapping(value = "/car")
public class CarApplicationController {


    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private CarService carService;

    @Autowired
    private CarApplicationService carApplicationService;

    @Value("${car_type}")
    private String car_type;


    /**
     * 用车记录（用户）
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "myList")
    public String getMyList(Model model, HttpSession session){
        try{
            //获取所有可以使用的车辆
            List<Car> canUseCar = carApplicationService.getCanUseCar();
            //获取全部人员信息
            List<Staff> staffs = staffService.findAllStaffInfo();
            //获取车型
            List<Dictionary> types = baseDictService.findTypes(car_type);
            //获取我的用车记录
            Staff  staff = (Staff) session.getAttribute("staff");
            List<CarApplication> myApps = carApplicationService.getMyAllApp(staff.getStaffId());
            model.addAttribute("canUseCar",canUseCar);
            model.addAttribute("staffs",staffs);
            model.addAttribute("types",types);
            model.addAttribute("myApps",myApps);
            return "car/myApp";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取用车申请列表
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "toDeal")
    public String getMyDealList(Model model, HttpSession session){
        try{
            //获取所有可以使用的车辆
            List<Car> canUseCar = carApplicationService.getCanUseCar();
            //获取全部人员信息
            List<Staff> staffs = staffService.findAllStaffInfo();
            //获取车型
            List<Dictionary> types = baseDictService.findTypes(car_type);
            //获取我的用车记录
            Staff  staff = (Staff) session.getAttribute("staff");
            List<CarApplication> myApps = carApplicationService.getMyDealApp(staff.getStaffId());
            model.addAttribute("canUseCar",canUseCar);
            model.addAttribute("staffs",staffs);
            model.addAttribute("types",types);
            model.addAttribute("list",myApps);
            return "car/myDeal";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 处理用车申请
     * @return
     */
    @RequestMapping(value = "deal")
    @ResponseBody
    public String dealApp(@RequestParam("appStatus") int appStatus, @RequestParam("carAppIds[]") List<String> carAppIds){
        try{
            CarApplication carApplication = new CarApplication();
            for (String carAppId:carAppIds) {
               carApplication.setCarAppId(carAppId);
               carApplication.setCarAppStatus(appStatus);
                Car car = carService.getCarById(carApplicationService.getCarApp(carAppId).getCarId());
                car.setCarStatus(0);
                carService.updateCar(car);
                carApplicationService.updatecarApp(carApplication);
            }
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }




    /**
     * 车辆申请（用户）
     * @param carApplication
     * @return
     */
    @RequestMapping(value = "carApp",method = RequestMethod.POST)
    @ResponseBody
    public String addCarApp(CarApplication carApplication,HttpSession session,Integer isSelf){
        try{
            carApplication.setCarAppId(BaseUtils.getUUID());//用车申请ID
            carApplication.setAppCarTime(BaseUtils.getDateTime());//设置申请时间
            Staff  staff = (Staff) session.getAttribute("staff");
            //设置申请者信息
            carApplication.setCarAppUserId(staff.getStaffId());
            carApplication.setCarAppUserName(staff.getStaffName());
            carApplication.setCarAppUserTel(staff.getStaffTel());
            //设置汽车信息
            Car car = carService.getCarById(carApplication.getCarId());
            carApplication.setCarName(car.getCarBrand());
            carApplication.setCarNum(car.getCarNumber());

            if (isSelf  == 1 ){ //自驾
                carApplication.setDriverName(staff.getStaffName());
                carApplication.setDriverTel(staff.getStaffTel());
            }else{ //代驾
                carApplication.setDriverName(car.getCarDriverName());
                carApplication.setDriverTel(car.getCarDriverTel());
            }
            carApplication.setCarAppStatus(0); //0 提交申请  1 申请成功  2  拒绝申请 3 已归还
            carApplicationService.addCarApplication(carApplication);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


}
