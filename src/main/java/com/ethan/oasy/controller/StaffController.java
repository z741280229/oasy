package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.*;
import com.ethan.oasy.utils.AccountValidatorUtil;
import com.ethan.oasy.utils.BaseUtils;
import com.ethan.oasy.utils.DepartUtils;
import com.ethan.oasy.utils.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: oasy
 * @description: 员工接口类
 * @author: sam
 * @create: 2019-03-20 20:34
 */
@Controller
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffService;

    @Autowired
    private SystemService systemService;

    @Autowired
    private OfficeSuppliesService officeSuppliesService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private DepartUtils departUtils;

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private PositionService positionService;

    @Autowired
    private NoticeNewsService noticeNewsService;

    @Autowired
    private MyApprovalService myApprovalService;

    @Autowired
    private OfficeSuppliesPickupService officeSuppliesPickupService;


    //字典表中部门类型Id
    @Value("${oasy_department_type}")
    private String oasy_department_type;

    //字典表中部门类型Id
    @Value("${oasy_staff_grade}")
    private String oasy_staff_grade;

    //初始化密码值
    @Value("${begin_password}")
    private String begin_password;

    //字典表性别类型
    @Value("${staff_gender_type}")
    private String staff_gender_type;

    //字典表员工状态
    @Value("${staff_status}")
    private String staff_status;

    @Autowired
    private ConferenceService conferenceService;

    /**
     * 用戶登录
     * @param sNum
     * @param sPass
     * @param session
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(String sNum,String sPass,HttpSession session) throws Exception{
        String password = staffService.getPass(sNum);
        if (MD5.verify(sPass,password)){  //登录成功
            Staff staff = staffService.getStaffByNum(sNum).get(0);  //获取该员工所有信息
            session.setAttribute("staff",staff);
            return "1";
        }else{   //登录失败
            return "0";
        }
    }

    /**
     *  退出登录
     * @param session
     * @return
     */
    @RequestMapping(value = "/logout")
    public ModelAndView logout(HttpSession session) throws Exception{
        ModelAndView modelAndView = new ModelAndView();
        session.removeAttribute("staff");
        modelAndView.setViewName("login");
        return modelAndView;
    }

    /**
     * 用户主页
     * @return
     * @throws Exception
     */
    @RequestMapping("/index")
    public String index(Model model,HttpSession session) throws Exception {
        //查询所有菜单列表
        //List<Resources> oldmenu = systemService.findAll();
        //获取用户权限菜单
        Staff staff = (Staff) session.getAttribute("staff");

        Integer markPower = staffService.findMarkPower(staff.getStaffId());
        List<Resources> oldmenu = systemService.getAllResourse(markPower,staff.getStaffId());

        //将菜单进行分组
        List<Menu> menus = new ArrayList<>();
        for (Resources res: oldmenu) { //查找一级目录
            if (res.getParentid() == 0){
                Menu menu = new Menu();
                menu.setId(res.getId()); // 保存一级目录ID
                menu.setName(res.getName());  //保存一级目录名称
                menu.setIcon(res.getIcon()); //设置图标
                List<Resources> resources = new ArrayList<>(); //保存该一级目录下的所有二级目录
                for (Resources sub:oldmenu){ //查找一级目录下的二级目录
                    if (res.getId().equals(sub.getParentid())){
                        resources.add(sub); //添加
                    }
                }
                menu.setSubs(resources); //将该一级目录下的所有二级目录全部保存
                menus.add(menu);
            }
        }
        Department department = departmentService.findDepartment(staff.getStaffDepart());

        //查询员工等级
        List<Dictionary> types = baseDictService.findTypes(oasy_staff_grade);

        //获取顶层部门
        List<DepartmentDetails> topDepartments = departmentService.findTopDepartment();
        //树形化部门列表
        List<DepartmentDetails> departments = departUtils.treeDepartment(topDepartments);

        //查询所有职位
        List<Position> positions = positionService.findAll();

        //查询员工性别范围
        List<Dictionary> gender = baseDictService.findTypes(staff_gender_type);

        //查询员工状态范围
        List<Dictionary> status = baseDictService.findTypes(staff_status);

        model.addAttribute("gender",gender);
        model.addAttribute("status",status);
        model.addAttribute("positions",positions);
        model.addAttribute("depart",departments);
        model.addAttribute("types",types);

        staff.setDepartName(department.getDepartName());
        // 设置页面进行跳转
        model.addAttribute("menus",menus);
        model.addAttribute("staff",staff);
        return "index";
    }

    /**
     * 加载欢迎页面
     * @return
     * @throws Exception
     */
    @RequestMapping("/welcome")
    public String welcome(Model model,HttpSession session) throws Exception{
        Staff staff = (Staff)session.getAttribute("staff");
        //查询通知公告
        List<NoticeAndNews> allNotice = noticeNewsService.findAllNoticeAndNews(Byte.valueOf("1"));
        System.out.println(allNotice);
        //获取我的申请
        List<EntryWithBLOBs> myApproval = myApprovalService.getMylist(staff.getStaffId());


        //获取会议记录
        List<ConferenceWithBLOBs> con = conferenceService.getMyAll(staff.getStaffId());// 0 :申请中 1：申请通过 2:未通过 3：结束

        model.addAttribute("con",con);
        model.addAttribute("approval",myApproval);
        model.addAttribute("notice",allNotice);
        return "welcome";
    }




    /**
     * 获取用户列表
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "list")
    public String listUI(Model model){
        try{
            //查询所有员工信息
            List<Staff> allStaffInfo = staffService.findAllStaffInfo();

            //查询员工等级
            List<Dictionary> types = baseDictService.findTypes(oasy_staff_grade);

            //获取顶层部门
            List<DepartmentDetails> topDepartments = departmentService.findTopDepartment();
            //树形化部门列表
            List<DepartmentDetails> departments = departUtils.treeDepartment(topDepartments);

            //查询所有职位
            List<Position> positions = positionService.findAll();

            //查询员工性别范围
            List<Dictionary> gender = baseDictService.findTypes(staff_gender_type);

            //查询员工状态范围
            List<Dictionary> status = baseDictService.findTypes(staff_status);

            model.addAttribute("gender",gender);
            model.addAttribute("status",status);
            model.addAttribute("positions",positions);
            model.addAttribute("depart",departments);
            model.addAttribute("list",allStaffInfo);
            model.addAttribute("types",types);
            return "staff/list";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }




    /**
     * 插入员工信息
     * @param staff
     * @return
     */
    @RequestMapping(value = "/add",produces="text/html;charset=UTF-8;",method = RequestMethod.POST)
    @ResponseBody
    public String addStaff(Staff staff){
        try {
            staff.setStaffId(BaseUtils.getUUID()); //创建员工ID
            staff.setStaffPass(MD5.md5(begin_password));  //密码加密
            staff.setCreateDate(BaseUtils.getDate()); //记录入库时间
            if(!AccountValidatorUtil.isEmail(staff.getStmail())){
                return "邮箱格式错误";
            }
            if(!AccountValidatorUtil.isMobile(staff.getStaffTel())){
                return "电话号码格式错误";
            }
            List<String> allStaffNum = staffService.findAllStaffNum();
            if (allStaffNum.contains(staff.getStaffAccNum())){
                return "工号以存在";
            }
            if (!AccountValidatorUtil.isNumber(staff.getStaffSal().toString())){
                return "工资格式不正确";
            }
            staffService.insertStaff(staff);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "服务器异常";
        }
    }

    /**
     * 更新员工信息
     * @param staff
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
   public String updateStaff(Staff staff,HttpSession session){
        try{
            staffService.updateStaffInfo(staff);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
   }


    /**
     * 更新个人员工信息
     * @param staff
     * @param session
     * @return
     */
    @RequestMapping(value = "updatePri",method = RequestMethod.POST)
    @ResponseBody
    public String updateStaffPrivate(Staff staff,HttpSession session){
        try{
            staffService.updateStaffInfo(staff);
            Staff sta = staffService.findStaffById(staff.getStaffId()); //重新获取员工信息
            session.removeAttribute("staff"); //移除存放在session当中的旧员工
            session.setAttribute("staff",sta);  //添加修改后员工信息
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }



    /**
     * 删除员工信息
     * @param staffId
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String deletestaff(String staffId){
        try{
            staffService.deleteStaffById(staffId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 初始化密码
     * @param staffId
     * @return
     */
    @RequestMapping(value = "/initializePass",method = RequestMethod.POST)
    @ResponseBody
    public String initializePass(String staffId){
        try{
            Staff staff = new Staff();
            staff.setStaffId(staffId);
            staff.setStaffPass(MD5.md5(begin_password));
            staffService.initializePass(staff);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


    /**
     * 回显员工信息
     * @param staffId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    @ResponseBody
    public Staff editStaff(String staffId) throws Exception{
        return staffService.findStaffById(staffId);
    }


}
