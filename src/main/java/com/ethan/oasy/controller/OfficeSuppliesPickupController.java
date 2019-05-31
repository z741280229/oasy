package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Department;
import com.ethan.oasy.pojo.OfficeSupplies;
import com.ethan.oasy.pojo.OfficeSuppliesPickup;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.DepartmentService;
import com.ethan.oasy.service.OfficeSuppliesPickupService;
import com.ethan.oasy.service.OfficeSuppliesService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: oasy
 * @description: 物品领用
 * @author: sam
 * @create: 2019-04-22 14:18
 */
@Controller
@RequestMapping("/ospc")
public class OfficeSuppliesPickupController {

    @Autowired
    private OfficeSuppliesPickupService officeSuppliesPickupService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private OfficeSuppliesService officeSuppliesService;

    @Value("${to_who_app_os}")
    private String to_who_app_os;

    /**
     * 提交申请
     * @param pickup
     * @return
     */
    @RequestMapping(value = "addApp",method = RequestMethod.POST)
    @ResponseBody
    public String insertApp(OfficeSuppliesPickup pickup, HttpSession session){
        try{
            Staff staff = (Staff)session.getAttribute("staff");
            //申请日期
            pickup.setAppDate(BaseUtils.getDate());
            //申请Id
            pickup.setOspId(BaseUtils.getUUID());
            //向谁申请
            pickup.setToAppId(to_who_app_os);
            //设置申请人ID,姓名，部门
            pickup.setPickupStaffId(staff.getStaffId());
            pickup.setPickupStaffName(staff.getStaffName());
            Department department = departmentService.findDepartment(staff.getStaffDepart());
            pickup.setPickupStaffDepart(department.getDepartName());
            pickup.setAppStatus(0); // 0 :表示申请中，1，申请通过
            officeSuppliesPickupService.insertOsApp(pickup);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 获取我的领用历史
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "myList")
    public String getMyList(Model model,HttpSession session){
        try {
            Staff staff = (Staff)session.getAttribute("staff");
            List<OfficeSuppliesPickup> myAll = officeSuppliesPickupService.getMyAll(staff.getStaffId());
            List<OfficeSupplies> oslist = officeSuppliesService.findAll();
            model.addAttribute("oslist",oslist);
            model.addAttribute("list",myAll);
            return "os/myPickup";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取所有领用历史
     * @param model
     * @return
     */
    @RequestMapping(value = "allList")
    public String getAllList(Model model){
        try {

            List<OfficeSuppliesPickup> All = officeSuppliesPickupService.getAll();
            model.addAttribute("list",All);
            return "os/allList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取待处理物品申请
     * @param model
     * @return
     */
    @RequestMapping(value = "getpu")
    public String getPickUpList(Model model,HttpSession session){
        try {
            Staff staff = (Staff)session.getAttribute("staff");
            List<OfficeSuppliesPickup> All = officeSuppliesPickupService.getApps(staff.getStaffId(),0);
            model.addAttribute("list",All);
            return "os/pickUpList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 处理申请
     * @param appStatus
     * @param ospIds
     * @return
     */
    @RequestMapping(value = "dealApp",method = RequestMethod.POST)
    @ResponseBody
    public String dealApp(@RequestParam("appStatus") int appStatus,@RequestParam("ospIds[]") List<String> ospIds){
        try {
            //更新状态
            for (String ospId:ospIds) {
                System.out.println(ospId);
                OfficeSuppliesPickup pickup = new OfficeSuppliesPickup();
                pickup.setOspId(ospId);
                pickup.setAppStatus(appStatus);
                officeSuppliesPickupService.updateOsApp(pickup);
            }
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

}
