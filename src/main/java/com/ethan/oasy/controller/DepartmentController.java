package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Department;
import com.ethan.oasy.pojo.DepartmentDetails;
import com.ethan.oasy.pojo.Dictionary;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.DepartmentService;
import com.ethan.oasy.service.StaffService;
import com.ethan.oasy.utils.BaseUtils;
import com.ethan.oasy.utils.DepartUtils;
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
 * @description: 部门接口
 * @author: sam
 * @create: 2019-03-26 21:09
 */
@Controller
@RequestMapping("/depart")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartUtils departUtils;

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private StaffService staffService;

    //字典表中部门类型Id
    @Value("${oasy_department_type}")
    private String oasy_department_type;

    /**
     * 添加部门
     * @param department
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String ddDepartment(Department department){
        try {
            String id = BaseUtils.getUUID();
            department.setDepartId(id);  //初始化ID
            String date = BaseUtils.getDate();
            department.setCreateDate(date);  //设置部门创建时间
            departmentService.insertDepartment(department);
            return "1"; //插入成功
        }catch (Exception e){
            e.printStackTrace();
            return "0"; //插入失败
        }
    }

    /**
     * 查询部门并以树形展示
     * @return
     */
    @RequestMapping(value = "list")
    public String findAll(Model model){
        try{
            //获取顶层部门
            List<DepartmentDetails> topDepartments = departmentService.findTopDepartment();
            //树形化部门列表
            List<DepartmentDetails> departments = departUtils.treeDepartment(topDepartments);
            //获取部门类型
            List<Dictionary> types = baseDictService.findTypes(oasy_department_type);
            //获取所有员工信息
            List<Staff> allStaffInfo = staffService.findAllStaffInfo();

            model.addAttribute("list",departments);
            model.addAttribute("dapartTpye",types);
            model.addAttribute("staffs",allStaffInfo);
            return "department/list";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    /**
     * 删除部门
     * @param departId
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteDepart(String departId){
        try{
            departUtils.deletePartment(departId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 回显编辑页面
     * @param departId
     * @return
     */
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    @ResponseBody
    public Department editDapartment(String departId) throws Exception{
            return departmentService.findDepartment(departId);
    }

    /**
     * 更新本部信息
     * @param department
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String updateDepartment(Department department){
        try{
            departmentService.updateDepartment(department);
            return "1";
        }catch (Exception e){
            return "0";
        }
    }

}
