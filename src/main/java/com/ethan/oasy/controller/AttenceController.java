package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Attence;
import com.ethan.oasy.pojo.AttenceCount;
import com.ethan.oasy.pojo.DepartmentDetails;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.AttenceService;
import com.ethan.oasy.service.DepartmentService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: oasy
 * @description: 考勤
 * @author: sam
 * @create: 2019-05-01 15:11
 */
@Controller
@RequestMapping("/attence")
public class AttenceController {

    @Autowired
    private AttenceService attenceService;

    @Autowired
    private DepartmentService departmentService;


    /**
     * 增加考勤记录
     * @param attence
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String addAttence(Attence attence){
        try {
            attence.setAttId(BaseUtils.getUUID());
            if (BaseUtils.compareDate(attence.getCheckInTime(),attence.getStartWorkTime()) == -1){
                attence.setCheckInStatus(1);//签到成功
            }else if(BaseUtils.compareDate(attence.getCheckInTime(),attence.getStartWorkTime()) == 1){
                attence.setCheckInStatus(0);//签到失败
            }
            attenceService.addAttence(attence);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


    /**
     * 删除本条浏览记录
     * @param atId
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteAttence(String atId){
        try {
            attenceService.deleteAttence(atId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


    /**
     * 更新考勤
     * @param attence
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String updateAttence(Attence attence){
        try {
            attenceService.updateAttence(attence);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 获取某个考勤
     * @param
     * @return
     */
    @RequestMapping(value = "single",method = RequestMethod.POST)
    @ResponseBody
    public Attence getAttenceById(String atId) throws Exception{
       return attenceService.getAttenceById(atId);
    }


    /**
     * 获取个人所有的考勤记录
     * @return
     */
    @RequestMapping(value = "record")
    public String getMyAttece(HttpSession session, Model model){
        try {
            Staff staff = (Staff) session.getAttribute("staff");
            List<Attence> myAttences = attenceService.getMyAttences(staff.getStaffId());
            model.addAttribute("record",myAttences);
            return "attence/record";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取所有考勤统计
     * @param model
     * @return
     */
    @RequestMapping(value = "list")
    public String getAllAttece(Model model){
        try {
            List<AttenceCount> all = attenceService.getCount();

            List<DepartmentDetails> departs = departmentService.findAllDepartments();
            model.addAttribute("list",all);
            model.addAttribute("departs",departs);
            return "attence/list";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
