package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.*;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.jws.WebParam;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: oasy
 * @description: 审批流转
 * @author: sam
 * @create: 2019-05-02 16:42
 */
@Controller
@RequestMapping("/approval")
public class ApprovalController {


    @Autowired
    private ApprovalService approvalService;

    @Autowired
    private EntryService entryService;

    @Autowired
    private ProcedureService procedureService;

    @Autowired
    private MyApprovalService myApprovalService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private StaffService staffService;

    @Value("${ministr_of_personnel}")
    private String ministr_of_personnel;


    /**
     * 审批流转主界面
     * @return
     */
    @RequestMapping(value = "menu")
    public String menuList(Model model){
        try {
            List<ApprovalList> menu = approvalService.getMenu();
            //寻找一级菜单
            List<ApprovalList> parents = new ArrayList<>();
            for (ApprovalList approvalList:menu) {
                if (approvalList.getAlParent().equals(0)){
                    parents.add(approvalList);//将一级菜单添加到集合中
                }
            }

            //将菜单归类
            for (ApprovalList parent:parents){ //遍历一级目录
                List<ApprovalList> sub = new ArrayList<>();//用于存放一级目录下的二级目录
                for (ApprovalList approvalList:menu) { //遍历所有目录
                    if(parent.getAlId().equals(approvalList.getAlParent())){
                        sub.add(approvalList);
                    }
                }
                parent.setSubs(sub);
            }
            model.addAttribute("parents",parents);
            return "approval/menu";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 跳转到申请页面
     * @return
     */
    @RequestMapping(value = "toJsp")
    public String toAppJsp(Model model,String linkName,Integer typeId){
        try{
            List<DepartmentDetails> allDepartments = departmentService.findAllDepartments();
            List<Position> allPosi = positionService.findAll();
            model.addAttribute("allPosi",allPosi);
            model.addAttribute("allDepartments",allDepartments);
            model.addAttribute("typeId",typeId);
            return linkName;
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 添加入职申请
     * @param entryWithBLOBs
     * @return
     */
    @RequestMapping(value = "addEntry",method = RequestMethod.POST)
    @ResponseBody
    public String addEntry(EntryWithBLOBs entryWithBLOBs, HttpSession session){
        try {
            //查询入职申请的流程
            System.out.println(entryWithBLOBs.getPrId());
            List<Procedu> procedureById = procedureService.getProcedureById(entryWithBLOBs.getPrId());
            //生成入职申请单ID
            entryWithBLOBs.setEnId(BaseUtils.getUUID());
            //设置申请时间
            entryWithBLOBs.setEnDate(BaseUtils.getDateTime());
            //设置编号
            entryWithBLOBs.setEnNum(BaseUtils.createNum());
            //将入职申请单插入进入入职申请单中
            Staff staff = (Staff)session.getAttribute("staff");
            entryWithBLOBs.setStaffId(staff.getStaffId());
            entryService.addEntry(entryWithBLOBs);

            //将我的入职申请表加入所有审批流转表中
            for (Procedu p:procedureById) {
                MyApproval myApproval = new MyApproval();
                myApproval.setApId(entryWithBLOBs.getEnId()); //需要审批的ID
                myApproval.setPrId(p.getPrId());//设置流程的具体id
                myApproval.setPrTypeId(p.getPrTypeId()); //设置流程步骤ID
                myApproval.setPrTypeName(p.getPrName());//流程步骤名
                myApproval.setPrNumber(p.getPrNumber()); //流程序号
                if(p.getPrNumber().equals(1)){
                    myApproval.setPrStaffId(staff.getStaffId());
                    myApproval.setDataStatus(1);
                }
                if(p.getPrNumber().equals(2)){//设置部门ID，部门领导处理改事件
                    Department department = departmentService.findDepartment(entryWithBLOBs.getStaffDepartId());
                    myApproval.setPrStaffId(department.getDepartLeader());//
                }
                if(p.getPrNumber().equals(3)){ //人事部领导
                    Department department = departmentService.findDepartment(ministr_of_personnel);
                    myApproval.setPrStaffId(department.getDepartLeader());
                }
                myApprovalService.addMyApproval(myApproval);
            }
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 获取我的申请流程
     * @return
     */
    @RequestMapping(value = "mylist")
    public String  getMylist(Model model,HttpSession session){
            try{
                Staff staff = (Staff) session.getAttribute("staff");
                List<EntryWithBLOBs> mylist = myApprovalService.getMylist(staff.getStaffId());
                model.addAttribute("mylist",mylist);
                return "approval/mylist";
            }catch (Exception e){
                e.printStackTrace();
                return "error";
            }
    }

    /**
     * 获取某个入职申请单体
     * @param enId
     * @return
     */
    @RequestMapping(value = "entryById")
    public String getMyEntryById(Model model,String enId,Integer myapId){
        try {
            EntryWithBLOBs entryWithBLOBsById = entryService.getEntryWithBLOBsById(enId);
            List<MyApproval> myLIstById = myApprovalService.getMyLIstById(enId);
            List<DepartmentDetails> allDepartments = departmentService.findAllDepartments();
            List<Position> all = positionService.findAll();
            entryWithBLOBsById.setMyApprovals(myLIstById);
            List<Staff> allStaffInfo = staffService.findAllStaffInfo();
            model.addAttribute("allStaffInfo",allStaffInfo);
            model.addAttribute("list",entryWithBLOBsById);
            model.addAttribute("depart",allDepartments);
            model.addAttribute("posi",all);
            model.addAttribute("myapId",myapId);
            return "approval/details";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 查看我的详情
     * @param model
     * @param enId
     * @param myapId
     * @return
     */
    @RequestMapping(value = "myDeatils")
    public String myDeatils(Model model,String enId,Integer myapId){
        try {
            EntryWithBLOBs entryWithBLOBsById = entryService.getEntryWithBLOBsById(enId);
            List<MyApproval> myLIstById = myApprovalService.getMyLIstById(enId);
            List<DepartmentDetails> allDepartments = departmentService.findAllDepartments();
            List<Position> all = positionService.findAll();
            entryWithBLOBsById.setMyApprovals(myLIstById);
            List<Staff> allStaffInfo = staffService.findAllStaffInfo();
            model.addAttribute("allStaffInfo",allStaffInfo);
            model.addAttribute("list",entryWithBLOBsById);
            model.addAttribute("depart",allDepartments);
            model.addAttribute("posi",all);
            model.addAttribute("myapId",myapId);
            return "approval/myDetails";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }



    /**
     * 待我审批列表
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "mydeal")
    public String getMyDeal(Model model,HttpSession session){
        try {
            Staff staff = (Staff) session.getAttribute("staff");
            List<MyApproval> mydealById = myApprovalService.getMydealById(staff.getStaffId());
            for (MyApproval myApproval: mydealById) {
                EntryWithBLOBs entryWithBLOBsById = entryService.getEntryWithBLOBsById(myApproval.getApId());
                myApproval.setEntryWithBLOBs(entryWithBLOBsById);
            }
            model.addAttribute("mylist",mydealById);
            return "approval/mydeal";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 处理审批
     * @param enId
     * @param result
     * @return
     */
    @RequestMapping(value = "dealApp",method = RequestMethod.POST)
    @ResponseBody
    public String dealApp(Integer myapId,String enId,Integer result,String enOpinion,HttpSession session){
        try {
            MyApproval myApproval = new MyApproval();
            myApproval.setPrStatus(result);
            Staff staff = (Staff) session.getAttribute("staff");
            myApproval.setPrStaffId(staff.getStaffId());
            myApproval.setPrDealTime(BaseUtils.getDateTime());
            myApproval.setMyapId(myapId);
            myApprovalService.updateApproval(myApproval);//更新过程
            EntryWithBLOBs entryWithBLOBs = new EntryWithBLOBs();
            entryWithBLOBs.setEnId(enId);
            entryWithBLOBs.setEnOpinion(enOpinion);
            entryService.updateEntry(entryWithBLOBs);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

}
