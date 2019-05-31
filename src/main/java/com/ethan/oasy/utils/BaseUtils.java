package com.ethan.oasy.utils;

import com.ethan.oasy.pojo.OtherFile;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.UUID;

/**
 * @program: oasy
 * @description: 创建UUID
 * @author: sam
 * @create: 2019-03-20 20:45
 */

public class BaseUtils {
    /**
     * 创建UUID
     * @return
     */
    public static String getUUID() throws Exception{
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * 获取当前系统当前时间
     * @return
     */
    public static String getDate() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        return df.format(new Date());
    }

    public static String getDateTime() throws Exception {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        return df.format(new Date());
    }


    /**
     * 比较时间
     * @param DATE1
     * @param DATE2
     * @return
     */
    public static int compareDate(String DATE1, String DATE2) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        try {
            Date dt1 = df.parse(DATE1);
            Date dt2 = df.parse(DATE2);
            if (dt1.getTime() >= dt2.getTime()) {
                System.out.println("dt1 在dt2前");
                return 1;
            } else if (dt1.getTime() < dt2.getTime()) {
                System.out.println("dt1在dt2后");
                return -1;
            } else {
                return 0;
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return 0;
    }


    /**
     * 上传文件
     * @param request
     * @return
     */
    public static OtherFile uploadFile(HttpServletRequest request,String apath) throws Exception {
        OtherFile otherFile = new OtherFile();
        //获取服务器中保存文件的路径
        String path = request.getSession().getServletContext().getRealPath("")+apath;
        //获取解析器
        CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        //判断是否是文件
        if(resolver.isMultipart(request)) {
            //进行转换
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) (request);
            //获取所有文件名称
            Iterator<String> it = multiRequest.getFileNames();
            while (it.hasNext()) {
                //根据文件名称取文件
                MultipartFile file = multiRequest.getFile(it.next());

                //设置文件类型
                if (file.getSize()>0){
                    //将文件真实名称进行保存
                    otherFile.setFileRealName(file.getOriginalFilename());
                    System.out.println(file.getOriginalFilename());
                    //获取文件后缀
                    String suffix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));

                    //重新定义新文件名  避免文件名冲突
                    String fileName = BaseUtils.getUUID()+suffix;

                    otherFile.setFileNumName(fileName);
                    otherFile.setType(file.getContentType());
                    otherFile.setLength((int)file.getSize());

                    File fi = new File(path);
                    if (!fi.exists()){
                        fi.mkdirs();
                    }
                    File saveFile = new File(fi,fileName);
                    otherFile.setPath(apath);
                    //上传的文件写入到指定的文件中
                    file.transferTo(saveFile);
                }
            }
        }
        return otherFile;
    }

    /**
     * 下载文件
     * @param request
     * @param response
     * @param fileName
     * @param fileType
     * @param fileRealName
     * @param apath
     * @throws Exception
     */
    public static void fileDownload(HttpServletRequest request, HttpServletResponse response, String fileName, String fileType, String fileRealName,String apath) throws Exception{
        FileInputStream input = null;
        OutputStream output = null;
        try{
            String path = request.getSession().getServletContext().getRealPath("")+ apath;
            File file = new File(path+"/"+fileName);
            response.setContentLength((int)file.length());
            response.setContentType(fileType);
            response.setHeader("Content-Disposition","attachment;filename="+fileRealName);
            input  = new FileInputStream(file);
            output  = response.getOutputStream();
            IOUtils.copy(input, output);
        }finally {
            input.close();
            output.close();
        }
    }

    /**
     * 生产编号
     * @return
     */
    public static String createNum(){
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
        String uid_pfix = "NO" + format.format(new Date());
        return uid_pfix;
    }

}
