package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Catalog;
import com.ethan.oasy.pojo.Dictionary;
import com.ethan.oasy.pojo.File;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.CatalogService;
import com.ethan.oasy.service.FileService;
import com.ethan.oasy.service.StaffService;
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
import java.util.List;

/**
 * @program: oasy
 * @description: 档案
 * @author: sam
 * @create: 2019-04-23 15:48
 */
@Controller
@RequestMapping("/file")
public class FileController {

    @Value("${file_belong_to}")
    private String file_belong_to;

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private StaffService staffService;

    @Autowired
    private FileService fileService;

    @Autowired
    private CatalogService catalogService;


    /**
     * 保存文件
     * @param file
     * @param session
     * @return
     */
    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public String addFile(File file, HttpSession session){
        try {
            file.setFileId(BaseUtils.getUUID());//设置档案ID
            file.setFileSaveDate(BaseUtils.getDateTime()); //设置保存时间
            Staff staff = (Staff)session.getAttribute("staff");
            //保存着信息
            file.setFileSavePerson(staff.getStaffId());
            file.setFileSavePersonName(staff.getStaffName());
            fileService.addFile(file);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 档案列表
     * @param model
     * @param distinguish
     * @return
     */
    @RequestMapping(value = "list")
    public String toList(Model model,Integer distinguish){
        try {
            model.addAttribute("distinguish",distinguish);
            return "file/list";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 档案所有详情列表
     * @param model
     * @return
     */
    @RequestMapping("details")
    public String getList(Model model){
        try {
            List<File> allFile = fileService.getAllFile();
            model.addAttribute("list",allFile);
            model.addAttribute("isSelect",0);
            return "file/detailsList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 获取某一个类目的所有档案
     * @param model
     * @param parentId
     * @return
     */
    @RequestMapping(value = "single")
    public String getSingle(Model model,Integer parentId){
        try{
            System.out.println(parentId);
            List<File> filesByFileBelong = fileService.getFilesByFileBelong(parentId);
            System.out.println(filesByFileBelong);

            List<Dictionary> belong = baseDictService.findTypes(file_belong_to);
            model.addAttribute("list",filesByFileBelong);
            model.addAttribute("parentId",parentId);
            model.addAttribute("belong",belong);
            return "file/detailsList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 目录列表
     * @param model
     * @param distinguish
     * @return
     */
    @RequestMapping("catalog")
    public String catalogList(Model model,Integer distinguish){
        try{
            List<Catalog> allCatalog = catalogService.findAllCatalog(distinguish);
            model.addAttribute("catalog",allCatalog);
            model.addAttribute("distinguish",distinguish);
            return "file/catalog";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     * 回显文档
     * @param fId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "editFile")
    @ResponseBody
    public File editFile(String fId) throws Exception{
        return fileService.getFileById(fId);
    }

    /**
     * 更新档案
     * @param file
     * @return
     */
    @RequestMapping(value = "updateFile")
    @ResponseBody
    public String updateFile(File file){
        try{
            fileService.updateFile(file);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


    /**
     *
     * @param file
     * @return
     */
    @RequestMapping(value = "getFileDe")
    @ResponseBody
    public String getFileDetails(File file){
        try{
            fileService.updateFile(file);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 删除档案
     * @param fId
     * @return
     */
    @RequestMapping(value = "deteleFile")
    @ResponseBody
    public String deleteFile(String fId){
        try{
            fileService.deleteFile(fId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }
}
