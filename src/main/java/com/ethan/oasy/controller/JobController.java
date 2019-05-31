package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.*;
import com.ethan.oasy.utils.BaseUtils;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @program: oasy
 * @description: 任务接口
 * @author: sam
 * @create: 2019-04-06 21:40
 */
@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private StaffJobService staffJobService;

    @Value("${job_schedule}")
    private String job_schedule; //进度

    @Value("${job_grade}")
    private String job_grade;   //等级

    @Value("${job_type}")
    private String job_type;  //类型


    @Value("${file_upload_path}")
    private String file_upload_path;

//    @Value("job_file_path")
//    private String job_file_path;


    /**
     * 获取所有工作任务
     * @param model
     * @return
     */
    @RequestMapping(value = "getAll")
    public String findAllJobs(Model model){
        try {
            List<JobWithBLOBs> allJobs = jobService.getAllJobs();
            List<Staff> allStaffInfo = staffService.findAllStaffInfo();   //获取所有员工信息
            List<DepartmentDetails> departments = departmentService.findAllDepartments();

            for (JobWithBLOBs job:allJobs) {  //添加工作名称
                for (Staff staff:allStaffInfo) {
                    if (job.getJobLeader().equals(staff.getStaffId())){
                        job.setJobLeaderName(staff.getStaffName());
                    }
                }
            }

            for (DepartmentDetails details:departments) {  //添加部门名称
                for (Staff staff:allStaffInfo){
                    if (staff.getStaffDepart().equals(details.getDepartId())){
                        staff.setDepartName(details.getDepartName());
                    }
                }
            }

            List<Dictionary> job_schedules = baseDictService.findTypes(job_schedule);
            List<Dictionary> job_grades = baseDictService.findTypes(job_grade);
            List<Dictionary> job_types = baseDictService.findTypes(job_type);

            model.addAttribute("allStaffInfo",allStaffInfo);
            model.addAttribute("job_schedules",job_schedules);
            model.addAttribute("job_grades",job_grades);
            model.addAttribute("job_types",job_types);
            model.addAttribute("jobs",allJobs);
            return "job/allJobs";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取我的任务
     * @param model
     * @return
     */
    @RequestMapping(value = "getMyAll")
    public String findMyAllJobs(Model model, HttpSession session){
        try {
            Staff staff = (Staff) session.getAttribute("staff");
            List<JobWithBLOBs> allJobs = jobService.getJobsByStaffId(staff.getStaffId());
            List<Dictionary> job_schedules = baseDictService.findTypes(job_schedule);
            List<Dictionary> job_grades = baseDictService.findTypes(job_grade);
            List<Dictionary> job_types = baseDictService.findTypes(job_type);

            model.addAttribute("job_schedules",job_schedules);
            model.addAttribute("job_grades",job_grades);
            model.addAttribute("job_types",job_types);
            model.addAttribute("jobs",allJobs);
            return "job/myJobs";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    /**
     * 获取我负责的工作
     * @param session
     * @return
     */
    @RequestMapping(value = "getMyRe")
    public String myResponsibleJob(HttpSession session,Model model){
        try{
            Staff staff = (Staff)session.getAttribute("staff");
            List<JobWithBLOBs> myReJob = jobService.getMyResresponsibleJob(staff.getStaffId());
            List<Dictionary> job_schedules = baseDictService.findTypes(job_schedule);
            List<Dictionary> job_grades = baseDictService.findTypes(job_grade);
            List<Dictionary> job_types = baseDictService.findTypes(job_type);

            model.addAttribute("job_schedules",job_schedules);
            model.addAttribute("job_grades",job_grades);
            model.addAttribute("job_types",job_types);
            model.addAttribute("jobs",myReJob);
            return "job/responsible";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取下级工作任务列表
     * @param session
     * @param model
     * @return
     */
    @RequestMapping(value = "mySubJob")
    public String mySubJobs(HttpSession session,Model model){
        try{
            Staff staff = (Staff)session.getAttribute("staff");
            List<JobWithBLOBs> mySubJob = jobService.findMySubJob(staff.getStaffId());
            List<Dictionary> job_schedules = baseDictService.findTypes(job_schedule);
            List<Dictionary> job_grades = baseDictService.findTypes(job_grade);
            List<Dictionary> job_types = baseDictService.findTypes(job_type);

            model.addAttribute("job_schedules",job_schedules);
            model.addAttribute("job_grades",job_grades);
            model.addAttribute("job_types",job_types);
            model.addAttribute("jobs",mySubJob);
            return "job/mySubJobs";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }






    /**
     * 任务详情
     * @param jobId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "details")
    @ResponseBody
    public JobWithBLOBs getJobDetails(String jobId) throws Exception{
        List<Staff> participants = jobService.findJobParticipant(jobId);
        List<Dictionary> job_schedules = baseDictService.findTypes(job_schedule);
        List<Dictionary> job_grades = baseDictService.findTypes(job_grade);
        List<Dictionary> job_types = baseDictService.findTypes(job_type);
       JobWithBLOBs jobWithBLOBs = jobService.getJobById(jobId);
       jobWithBLOBs.setStaffs(participants); //设置参与者
       Staff staff = staffService.findStaffById(jobWithBLOBs.getJobLeader());
        for (Dictionary s: job_schedules) {
            if(s.getDictId().equals(jobWithBLOBs.getSchedule())){
                jobWithBLOBs.setScheduleName(s.getDictTypeDetails());
            }
        }
        for (Dictionary g: job_grades) {
            if(g.getDictId().equals(jobWithBLOBs.getJobGrade())){
                jobWithBLOBs.setJobGradeName(g.getDictTypeDetails());
            }
        }
        for (Dictionary t: job_types) {
            if(t.getDictId().equals(jobWithBLOBs.getJobType())){
                jobWithBLOBs.setJobTypeName(t.getDictTypeDetails());
            }
        }
       jobWithBLOBs.setJobLeaderName(staff.getStaffName());
       return jobWithBLOBs;
    }


    /**
     * 添加任务
     * @param
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String addJob(HttpServletRequest request, HttpServletResponse response,String jobLeader,String jobTitle,Integer jobGrade,
                         String jobKeyWord,Integer schedule,Integer jobAroundTime,String jobStartTime,String jobEndTime,String jobContent,Integer jobType,String members){
        try {
            //获取服务器中保存文件的路径
            //String path = request.getSession().getServletContext().getRealPath("")+"upload\\record\\";
            String path = request.getSession().getServletContext().getRealPath("")+file_upload_path;
            //获取解析器
            CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            String[] newMembers = members.split(",");//获取人员Id
            JobWithBLOBs jobWithBLOBs = new JobWithBLOBs();
            jobWithBLOBs.setJobId(BaseUtils.getUUID());
            for (int i = 0;i < newMembers.length; i++){
                StaffJob staffJob = new StaffJob();
                staffJob.setJobId(jobWithBLOBs.getJobId());
                staffJob.setStaffId(newMembers[i]);
                staffJobService.addMenbers(staffJob);
            }
            jobWithBLOBs.setJobLeader(jobLeader);
            jobWithBLOBs.setJobTitle(jobTitle);
            jobWithBLOBs.setJobGrade(jobGrade);
            jobWithBLOBs.setJobKeyWord(jobKeyWord);
            jobWithBLOBs.setSchedule(schedule);
            jobWithBLOBs.setJobAroundTime(jobAroundTime);
            jobWithBLOBs.setJobStartTime(jobStartTime);
            jobWithBLOBs.setJobEndTime(jobEndTime);
            jobWithBLOBs.setJobContent(jobContent);
            jobWithBLOBs.setJobType(jobType);

            //判断是否是文件
            if(resolver.isMultipart(request)) {
                //进行转换
                MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) (request);
                //获取所有文件名称
                Iterator<String> it = multiRequest.getFileNames();
                while (it.hasNext()) {
                    //根据文件名称取文件
                    MultipartFile file = multiRequest.getFile(it.next());
                    if (file.getSize()>0){
                        //设置文件类型
                        jobWithBLOBs.setJobFileType(file.getContentType());

                        //将文件真实名称进行保存
                        jobWithBLOBs.setJobFileRealName(file.getOriginalFilename());
                        //获取文件后缀
                        String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

                        //重新定义新文件名  避免文件名冲突
                        String fileName = BaseUtils.getUUID()+suffix;

                        jobWithBLOBs.setJobFileNumberName(fileName);

                        File fi = new File(path);
                        if (!fi.exists()){
                            fi.mkdirs();
                        }
                        File saveFile = new File(fi,fileName);

                        jobWithBLOBs.setJobFile(file_upload_path);
                        //上传的文件写入到指定的文件中
                        file.transferTo(saveFile);
                    }
                }
            }
            jobService.insertJob(jobWithBLOBs);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 删除任务
     * @param jobId
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    @ResponseBody
    public String deleteJob(String jobId){
        try {
            jobService.deleteJob(jobId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 更新任务
     * @param jobWithBLOBs
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String updateJob(JobWithBLOBs jobWithBLOBs){
        try {
            jobService.updateJob(jobWithBLOBs);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 下载文件
     * @param fileName
     */
    @RequestMapping(value = "download",method = RequestMethod.POST)
    public void downLoadFile(HttpServletRequest request,HttpServletResponse response,String fileName,String fileType,String fileRealName) throws Exception{
        FileInputStream input = null;
        OutputStream output = null;
            try{
                //String path = request.getSession().getServletContext().getRealPath("")+"upload\\record\\";
                String path = request.getSession().getServletContext().getRealPath("")+file_upload_path;
                File file = new File(path+"/"+fileName);
                response.setContentLength((int)file.length());
                response.setContentType(fileType);
                response.setHeader("Content-Disposition","attachment;filename="+fileRealName);
                input  = new FileInputStream(file);
                output  = response.getOutputStream();
                int copy = IOUtils.copy(input, output);
            }finally {
                input.close();
                output.close();
            }
    }
}
