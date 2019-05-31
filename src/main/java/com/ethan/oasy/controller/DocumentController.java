package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Catalog;
import com.ethan.oasy.pojo.Document;
import com.ethan.oasy.pojo.OtherFile;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.CatalogService;
import com.ethan.oasy.service.DocumentService;
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
import java.math.BigDecimal;
import java.util.List;

/**
 * @program: oasy
 * @description: 知识管理中心
 * @author: sam
 * @create: 2019-04-10 20:21
 */
@Controller
@RequestMapping(value = "/document")
public class DocumentController {

    @Autowired
    private CatalogService catalogService;

    @Autowired
    private DocumentService documentService;

    @Value("${file_upload_path}")
    private String file_upload_path;

    /**
     * 获取目录详情
     * @param model
     * @param distinguish
     * @return
     */
    @RequestMapping("list")
    public String Resource(Model model,Integer distinguish){
        try{
            model.addAttribute("distinguish",distinguish);
            return "document/list";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     * 获取某一个类型的所有下载文件
     * @param model
     * @param distinguish
     * @return
     */
    @RequestMapping("singlelist")
    public String singleList(Model model,Integer distinguish){
        try{
            model.addAttribute("documents",documentService.findDocuByDistinguish(distinguish));
            model.addAttribute("distinguish",distinguish);
            model.addAttribute("isSelect",0);
            return "document/detailsList";
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
            return "document/catalog";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }


    /**
     * 获取文件列表
     * @param model
     * @param catalogId
     * @return
     */
    @RequestMapping("getList")
    public String getDetails(Model model,Integer catalogId){
        try{
            List<Document> documents = documentService.findDocumentByCatalogId(catalogId);
            model.addAttribute("documents",documents);
            model.addAttribute("catalogId",catalogId);
            return "document/detailsList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 删除目录
     * @param catId
     * @return
     */
    @RequestMapping(value = "deleteCat",method = RequestMethod.POST)
    @ResponseBody
    public String deleteCat(Integer catId){
        try{
            catalogService.deleteCatalog(catId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 回显姓名
     * @param catId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "editCatName",method = RequestMethod.POST)
    @ResponseBody
    public Catalog editCatName(Integer catId) throws Exception{
        return catalogService.findCatById(catId);
    }

    /**
     * 重新命名
     * @return
     */
    @RequestMapping(value = "reNameCat",method = RequestMethod.POST)
    @ResponseBody
    public String reNameCat(Catalog catalog){
        try {
            System.out.println(catalog);
            catalogService.updateCatalog(catalog);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 添加目录
     * @param catalog
     * @return
     */
    @RequestMapping(value = "addCat",method = RequestMethod.POST)
    @ResponseBody
    public String addCat(Catalog catalog){
        try {
            catalogService.insertCatalog(catalog);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 上传文件
     * @param request
     * @param catalogId
     * @return
     */
    @RequestMapping(value = "uploadDocu",method = RequestMethod.POST)
    @ResponseBody
    public String uploadDocu(HttpServletRequest request, Integer catalogId, HttpSession session){
        try {
            Document document = new Document();
            document.setDocuId(BaseUtils.getUUID());
            document.setCatalog(catalogId);
            Staff staff = (Staff) session.getAttribute("staff");
            document.setUploader(staff.getStaffId());
            document.setUploaderName(staff.getStaffName());
            CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            if (resolver.isMultipart(request)){
                //OtherFile otherFile = BaseUtils.uploadFile(request, "upload\\record\\");
                System.out.println(file_upload_path+"=============================");
                OtherFile otherFile = BaseUtils.uploadFile(request, file_upload_path);
                document.setDocuRealName(otherFile.getFileRealName());
                document.setDocuNumName(otherFile.getFileNumName());
                BigDecimal bigDecimal = new BigDecimal(((double)otherFile.getLength()) / 1024);
                System.out.println(bigDecimal);
                document.setDocuSize(bigDecimal);
                document.setDocuPath(otherFile.getPath());
                document.setDocuType(otherFile.getType());
            }
            documentService.insertDocument(document);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 下载文件
     * @param request
     * @param response
     * @param fileName
     * @param fileType
     * @param fileRealName
     * @throws Exception
     */
    /*@RequestMapping(value = "download")
    public void downFile(HttpServletRequest request, HttpServletResponse response, String fileName, String fileType, String fileRealName,String docuId) throws Exception{
        BaseUtils.fileDownload(request,response,fileName,fileType,fileRealName,"upload\\record\\");
        Document document = documentService.findDocumentById(docuId);
        document.setDocuDownloadNum(document.getDocuDownloadNum() + 1);
        documentService.updateDocument(document);
    }*/

    @RequestMapping(value = "download")
    public void downFile(HttpServletRequest request, HttpServletResponse response, String fileName, String fileType, String fileRealName,String docuId) throws Exception{
        BaseUtils.fileDownload(request,response,fileName,fileType,fileRealName,file_upload_path);
        Document document = documentService.findDocumentById(docuId);
        document.setDocuDownloadNum(document.getDocuDownloadNum() + 1);
        documentService.updateDocument(document);
    }


    /**
     * 下架文件
     * @param docuId
     * @return
     */
    @RequestMapping(value = "deteleDocu")
    @ResponseBody
    public String deteleDocu(String docuId){
        try{
            documentService.deleteDocument(docuId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 回显文件
     * @param docuId
     * @return
     */
    @RequestMapping(value = "editDocu")
    @ResponseBody
    public Document editDocument(String docuId){
        return documentService.findDocumentById(docuId);
    }

    /**
     * 重命名文件
     * @param document
     * @return
     */
    @RequestMapping(value = "reNameDocu")
    @ResponseBody
    public String reNameDocu(Document document){
        try{
            System.out.println(document);
            documentService.updateDocument(document);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

}
