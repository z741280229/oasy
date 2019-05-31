package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.ConferenceService;
import com.ethan.oasy.service.DepartmentService;
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
import java.util.ArrayList;
import java.util.List;

/**
 * @program: oasy
 * @description: 会议
 * @author: sam
 * @create: 2019-04-22 18:59
 */
@Controller
@RequestMapping("/conference")
public class ConferenceController {

    @Autowired
    private ConferenceService conferenceService;

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private DepartmentService departmentService;

    @Value("${conference_type}")
    private String conference_type;


    /**
     * 获取我的会议
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "myList")
    public String getCons(Model model, HttpSession session){
        try{
            Staff staff = (Staff)session.getAttribute("staff");
            //获取员工信息
            List<Staff> allStaffInfo = staffService.findAllStaffInfo();
            //获取会议记录
            List<ConferenceWithBLOBs> myAll = conferenceService.getMyAll(staff.getStaffId());// 0 :申请中 1：申请通过 2:未通过 3：结束
            //会议类型
            List<Dictionary> contypes = baseDictService.findTypes(conference_type);
            //获取会议室
            List<Boardroom> allBoardroom = conferenceService.findAllBoardroom();
            //获取所有部门
            List<DepartmentDetails> allDepartments = departmentService.findAllDepartments();

            for (DepartmentDetails details:allDepartments) {  //添加部门名称
                for (Staff st:allStaffInfo){
                    if (st.getStaffDepart().equals(details.getDepartId())){
                        st.setDepartName(details.getDepartName());
                    }
                }
            }

            model.addAttribute("staffs",allStaffInfo);
            model.addAttribute("list",myAll);
            model.addAttribute("contypes",contypes);
            model.addAttribute("allBoardroom",allBoardroom);
            model.addAttribute("allDepartments",allDepartments);
            return "conference/myList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 申请会议
     * @param conferenceWithBLOBs
     * @return
     */
    @RequestMapping(value = "addCon",method = RequestMethod.POST)
    @ResponseBody
    public String addConference(ConferenceWithBLOBs conferenceWithBLOBs){
        try{
            //0 :申请中 1：申请通过 2:未通过 3：结束
            conferenceWithBLOBs.setConStatus(0);
            conferenceWithBLOBs.setConId(BaseUtils.getUUID());

            //获得主持人信息
            Staff compere = staffService.findStaffById(conferenceWithBLOBs.getConCompere());
            //获得主持人信息
            Staff linkman = staffService.findStaffById(conferenceWithBLOBs.getConLinkman());
            //获取会议室
            Boardroom boardroom = conferenceService.getBoardroomById(conferenceWithBLOBs.getConPlaceId());
            //获取主办部门
            Department department = departmentService.findDepartment(conferenceWithBLOBs.getConSponsorDapart());


            conferenceWithBLOBs.setConCompereName(compere.getStaffName());
            conferenceWithBLOBs.setConLinkmanName(linkman.getStaffName());
            conferenceWithBLOBs.setConLinkmanTel(linkman.getStaffTel());
            conferenceWithBLOBs.setConPlaceName(boardroom.getBdName());
            conferenceWithBLOBs.setConSponsorDapartName(department.getDepartName());
            conferenceWithBLOBs.setConAppTime(BaseUtils.getDateTime());

            //获取参会人员
            String[] newMembers = conferenceWithBLOBs.getMembers().split(",");//获取人员Id
            ConferencePart conferencePart = new ConferencePart();
            conferencePart.setConferenceId(conferenceWithBLOBs.getConId()); //设置会议ID
            conferencePart.setConferenceName(conferenceWithBLOBs.getConTheme());
            conferencePart.setPartType(0); //0：等待参与 1：未参与
            for(int i = 0;i < newMembers.length;i++){ //插入到会议表中
                conferencePart.setPartId(newMembers[i]); //设置参与者ID
                conferenceService.insertToConList(conferencePart);
            }
            conferenceService.insertConference(conferenceWithBLOBs);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 获取待我审批会议
     * @param session
     * @param model
     */
    @RequestMapping(value = "myDeal")
    public String getMyDealCon(HttpSession session,Model model){
        try{
            Staff staff = (Staff)session.getAttribute("staff");
            //0 :申请中 1：申请通过 2:未通过 3：结束
            List<ConferenceWithBLOBs> myDealConference = conferenceService.getMyDealConference(staff.getStaffId(), 0);
            //会议类型
            List<Dictionary> contypes = baseDictService.findTypes(conference_type);
            model.addAttribute("contypes",contypes);
            model.addAttribute("list",myDealConference);
            return "conference/myDeal";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 处理申请
     * @return
     */
    @RequestMapping(value = "dealAppCon")
    @ResponseBody
    public String dealAppCon(@RequestParam("appStatus") int appStatus, @RequestParam("conIds[]") List<String> conIds){
        try{
            ConferenceWithBLOBs conferenceWithBLOBs = new ConferenceWithBLOBs();
            for (String conId:conIds) {
                conferenceWithBLOBs.setConId(conId);
                conferenceWithBLOBs.setConStatus(appStatus);
                conferenceService.updateConference(conferenceWithBLOBs);
            }
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 获取单个会议详情
     * @param conId
     * @return
     */
    @RequestMapping(value = "details")
    @ResponseBody
    public ConferenceWithBLOBs getDetails(String conId) throws Exception{
        List<ConferencePart> conParts = conferenceService.getConPart(conId);
        List<Staff> staffs = new ArrayList<>();
        //获取该会议的参会人员
        for (ConferencePart cp:conParts) {
            Staff staff = staffService.findStaffById(cp.getPartId());
            staffs.add(staff);
        }
        ConferenceWithBLOBs conferences = conferenceService.getConferenceById(conId);

        conferences.setNeedReachedStaffs(staffs);
        return conferences;
    }

    /**
     * 获取获取未做纪要的会议
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "record")
    public String recordCon(Model model,HttpSession session){
        try{
            Staff staff = (Staff)session.getAttribute("staff");
            //获取的参加的会议
            List<ConferenceWithBLOBs> myAll = conferenceService.getMyAll(staff.getStaffId());
            //获取未做纪要的会议
            List<ConferenceWithBLOBs> allNotRecord = new ArrayList<>();
            for (ConferenceWithBLOBs con:myAll) {
                if (con.getConRecord() == null || con.getConRecord() ==""){
                    allNotRecord.add(con);
                }
            }
            model.addAttribute("list",myAll);
            model.addAttribute("notReord",allNotRecord);
            return "conference/record";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 增加纪要
     * @param conferenceWithBLOBs
     * @param session
     * @return
     */
    @RequestMapping(value = "addRecord")
    @ResponseBody
    public String addConRecord(ConferenceWithBLOBs conferenceWithBLOBs,HttpSession session){
        try{
            Staff staff = (Staff)session.getAttribute("staff");
            //纪要人员ID
            conferenceWithBLOBs.setConRecorder(staff.getStaffId());
            //纪要人员姓名
            conferenceWithBLOBs.setConRecorderName(staff.getStaffName());
            //设置会议结束
            conferenceWithBLOBs.setConStatus(3);
            conferenceService.updateConference(conferenceWithBLOBs);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }


    }
}
