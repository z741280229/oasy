package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.NoticeNewsService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @program: oasy
 * @description: 通知和新闻
 * @author: sam
 * @create: 2019-04-09 08:44
 */
@Controller
@RequestMapping("/nan")
public class NoticeAndNewsController {

    @Autowired
    private NoticeNewsService noticeNewsService;

    @Autowired
    private BaseDictService baseDictService;

    @Value("${news_type}")
    private String news_type;   //新闻类型

    @Value("${notice_type}")
    private String notice_type;  //通知类型

    @Value("${file_upload_path}")
    private String file_upload_path;


    /**
     * 添加新闻或者通知
     * @param request
     * @param session
     * @param nTitle
     * @param nType
     * @param nSendContent
     * @param distinguish
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String insertNaN(HttpServletRequest request, HttpSession session,String nTitle, Integer nType,String nSendContent, Byte distinguish){
       try{
           NoticeAndNews noticeAndNews = new NoticeAndNews();
           noticeAndNews.setnId(BaseUtils.getUUID());
           noticeAndNews.setnTitle(nTitle);
           noticeAndNews.setnType(nType);
           SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
           noticeAndNews.setnSendTime(df.format(new Date()));
           noticeAndNews.setnDistinguish(distinguish);//  1:表示通知公告 0:新闻
           noticeAndNews.setnSendContent(nSendContent);
           Staff staff = (Staff) session.getAttribute("staff");
           noticeAndNews.setnSenderName(staff.getStaffName());
           noticeAndNews.setnSender(staff.getStaffId());

           //获取解析器
           CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
           if (resolver.isMultipart(request)){
               //OtherFile otherFile = BaseUtils.uploadFile(request, "upload\\record\\");
               OtherFile otherFile = BaseUtils.uploadFile(request, file_upload_path);
               noticeAndNews.setnFileNumName(otherFile.getFileNumName());
               noticeAndNews.setnFileRealName(otherFile.getFileRealName());
               noticeAndNews.setnFileType(otherFile.getType());
               noticeAndNews.setnFilePath(otherFile.getPath());
           }

           noticeNewsService.insertNoticeOrNews(noticeAndNews);
           return "1";
       }catch (Exception e){
           e.printStackTrace();
            return "0";
       }
    }


    /**
     * 获取所有
     * @param model
     * @return
     */
    @RequestMapping(value = "getAll")
    public String getAllNaN(Model model,Byte distinguish,HttpSession session){ // distinguish 1:表示通知公告 0:新闻
        try {
            List<NoticeAndNews> allNoticeAndNews = noticeNewsService.findAllNoticeAndNews(distinguish);
            //Staff staff = (Staff) session.getAttribute("staff");
            //List<StaffNoticeAndNews> allNoticeAndNews = noticeNewsService.findAllNoticeAndNewsByStaffId(staff.getStaffId(), distinguish);
            if(distinguish == Byte.valueOf("1")){
                List<Dictionary> n_type = baseDictService.findTypes(notice_type);
                model.addAttribute("types",n_type);
            }

            if(distinguish == Byte.valueOf("0")){
                List<Dictionary> new_types = baseDictService.findTypes(news_type);
                model.addAttribute("types",new_types);
            }
            model.addAttribute("allNoticeAndNews",allNoticeAndNews);
            model.addAttribute("distinguish",distinguish);
            return "nan/list";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    @RequestMapping(value = "details")
    public String getDetails(Model model,String nId){
        try {
            NoticeAndNews noticeOrNewsById = noticeNewsService.findNoticeOrNewsById(nId);
            Dictionary byId = baseDictService.findById(noticeOrNewsById.getnType());
            noticeOrNewsById.setnTypeName(byId.getDictTypeDetails());
            model.addAttribute("details",noticeOrNewsById);
            return "nan/details";
        }catch (Exception e){
            return "error";
        }
    }

    /**
     * 下载附件
     * @param request
     * @param response
     * @param fileName
     * @param fileType
     * @param fileRealName
     * @throws Exception
     */
    @RequestMapping(value = "download")
    public void downFile(HttpServletRequest request, HttpServletResponse response, String fileName, String fileType, String fileRealName) throws Exception{
        BaseUtils.fileDownload(request,response,fileName,fileType,fileRealName,file_upload_path);
    }

    /*@RequestMapping(value = "download")
    public void downFile(HttpServletRequest request, HttpServletResponse response, String fileName, String fileType, String fileRealName) throws Exception{
        BaseUtils.fileDownload(request,response,fileName,fileType,fileRealName,"upload\\record\\");
    }*/

    /**
     * 删除新闻或者通知
     * @param nId
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public void deleteNaN(String nId) throws Exception{
       noticeNewsService.deleteNoticeOrNewsById(nId);
    }

    /**
     * 回显上传文件
     * @param nId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    @ResponseBody
    public NoticeAndNews editNaN(String nId) throws Exception{
        return noticeNewsService.findNoticeOrNewsById(nId);
    }


    /**
     * 更新消息
     * @param request
     * @param nTitle
     * @param nType
     * @param nSendContent
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    @ResponseBody
    public String updateNaN(HttpServletRequest request,String nTitle, Integer nType,String nSendContent,String nId){
        try{
            NoticeAndNews noticeAndNews = new NoticeAndNews();
            noticeAndNews.setnId(nId);
            noticeAndNews.setnTitle(nTitle);
            noticeAndNews.setnType(nType);
            noticeAndNews.setnSendContent(nSendContent);
            //获取解析器
            CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            if (resolver.isMultipart(request)){
                OtherFile otherFile = BaseUtils.uploadFile(request, "upload\\record\\");
                noticeAndNews.setnFileNumName(otherFile.getFileNumName());
                noticeAndNews.setnFileRealName(otherFile.getFileRealName());
                noticeAndNews.setnFileType(otherFile.getType());
                noticeAndNews.setnFilePath(otherFile.getPath());
            }
            noticeNewsService.updateNoticeOrNews(noticeAndNews);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }
}
