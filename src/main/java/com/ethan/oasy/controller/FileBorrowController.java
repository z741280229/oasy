package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Department;
import com.ethan.oasy.pojo.File;
import com.ethan.oasy.pojo.FileBorrow;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.DepartmentService;
import com.ethan.oasy.service.FileBorrowService;
import com.ethan.oasy.service.FileService;
import com.ethan.oasy.service.StaffService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @program: oasy
 * @description: 档案借阅
 * @author: sam
 * @create: 2019-04-24 15:51
 */
@Controller
@RequestMapping("/fbc")
public class FileBorrowController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private FileBorrowService fileBorrowService;

    @Autowired
    private FileService fileService;


    /**
     * 添加档案借阅
     * @param fileBorrow
     * @param session
     * @return
     */
    @RequestMapping(value = "add")
    @ResponseBody
    public String addFileBorrow(FileBorrow fileBorrow, HttpSession session){
        try{
            //设置借阅档案Id
            fileBorrow.setFileBorrowId(BaseUtils.getUUID());
            //设置借阅时间
            String borrowTime = BaseUtils.getDate();
            fileBorrow.setFileBorrowDate(borrowTime);
            //设置应还时间
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = sdf.parse(borrowTime);
            Calendar rightNow = Calendar.getInstance();
            rightNow.setTime(date);
            rightNow.add(Calendar.DAY_OF_MONTH, 30);
            Date dt1 = rightNow.getTime();
            String reStr = sdf.format(dt1);
            fileBorrow.setFilePreReturnDate(reStr);
            //设置借阅者信息
            Staff staff = staffService.findStaffById(fileBorrow.getBorrowerId());
            fileBorrow.setBorrowerId(staff.getStaffId());
            fileBorrow.setBorrowerName(staff.getStaffName());
            fileBorrow.setBorrowerNum(staff.getStaffAccNum());
            //设置文件信息
            File file = fileService.getFileById(fileBorrow.getFileId());
            fileBorrow.setFileName(file.getFileName());
            fileBorrow.setFileNum(file.getFileNum());
            //设置处理者信息
            Staff staff1 = (Staff)session.getAttribute("staff");
            fileBorrow.setDealBorrowId(staff1.getStaffId());
            fileBorrow.setDealBorrowName(staff1.getStaffName());
            //设置借阅状态
            fileBorrow.setFileBorrowStatus(0);//0 以借阅  1 以归还  2 以超期
            fileBorrowService.addFileBorrow(fileBorrow);

            //改变档案状态(以借)
            File bfile = new File();
            bfile.setFileId(fileBorrow.getFileId());
            bfile.setFileStatus(0);
            fileService.updateFile(bfile);
            return "1";
        }catch (Exception e){
            return "0";
        }
    }

    /**
     * 更新文档借阅记录
     * @param dealWay
     * @return
     */
    @RequestMapping(value = "deal")
    @ResponseBody
    public String dealFileBorrow(Integer dealWay,String fbId,HttpSession session){ // dealWay 1 归还 2 超期 3 续借
        try{
            FileBorrow fileBorrow = fileBorrowService.getFileBorrowById(fbId);
            Staff staff = (Staff) session.getAttribute("staff");
            if (dealWay == 1){  //归还
                fileBorrow.setFileBorrowStatus(1);//0 以借阅  1 以归还  2 以超期
                fileBorrow.setFileReturnDate(BaseUtils.getDateTime());//设置归还时间
                fileBorrow.setDealReturnId(staff.getStaffId());//设置处理者ID
                fileBorrow.setDealReturnName(staff.getStaffName());//设置处理者姓名
                //改变档案状态(以还)
                File file = new File();
                file.setFileId(fileBorrow.getFileId());
                file.setFileStatus(1);
                fileService.updateFile(file);
                //更新借阅档案信息
                fileBorrowService.updateFileBorrow(fileBorrow);
                return "1";
            }else if(dealWay == 2){   //超期
                fileBorrow.setFileBorrowStatus(2);//0 以借阅  1 以归还  2 以超期 3 续借
                fileBorrow.setDealReturnId(staff.getStaffId());//设置处理者ID
                fileBorrow.setDealReturnName(staff.getStaffName());//设置处理者姓名
                fileBorrowService.updateFileBorrow(fileBorrow);
                return "2";
            }else if (dealWay == 3){  //续借
                fileBorrow.setFileBorrowStatus(3);//0 以借阅  1 以归还  2 以超期 3 续借
                String filePreReturnDate = fileBorrow.getFilePreReturnDate();

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date date = sdf.parse(filePreReturnDate);
                Calendar rightNow = Calendar.getInstance();
                rightNow.setTime(date);
                rightNow.add(Calendar.DAY_OF_MONTH, 30);
                Date dt1 = rightNow.getTime();
                String reStr = sdf.format(dt1);
                fileBorrow.setFilePreReturnDate(reStr); //归还时间向后延期一个月

                fileBorrow.setDealReturnId(staff.getStaffId());//设置处理者ID
                fileBorrow.setDealReturnName(staff.getStaffName());//设置处理者姓名
                fileBorrowService.updateFileBorrow(fileBorrow);
                return "3";
            }else {
                return "4";
            }
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 获取所有借阅记录（管理员）
     * @param model
     * @return
     */
    @RequestMapping(value = "list")
    public String getAllList(Model model){
        try {
            //获取所有员工信息
            List<Staff> allStaffInfo = staffService.findAllStaffInfo();
            //获取所有档案
            List<File> allFile = fileBorrowService.getNotBorrowFile();
            //获取所有借阅记录
            List<FileBorrow> all = fileBorrowService.getAll();
            model.addAttribute("list",all);
            model.addAttribute("allFile",allFile);
            model.addAttribute("allStaffInfo",allStaffInfo);
            return "file/borrowList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取个人档案借阅记录(用户)
     * @param model
     * @return
     */
    @RequestMapping(value = "myList")
    public String getMyAllList(Model model,HttpSession session){
        try {
            Staff staff = (Staff) session.getAttribute("staff");
            //获取所有档案
            List<FileBorrow> myAll = fileBorrowService.getMyAll(staff.getStaffId());
            model.addAttribute("myAll",myAll);
            return "file/myBorrow";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }
}
