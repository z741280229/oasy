package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Dictionary;
import com.ethan.oasy.pojo.OfficeSupplies;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.OfficeSuppliesService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: oasy
 * @description: 办公用品
 * @author: sam
 * @create: 2019-04-20 16:14
 */
@Controller
@RequestMapping("/osc")
public class OfficeSuppliesController {

    @Autowired
    private OfficeSuppliesService officeSuppliesService;

    @Autowired
    private BaseDictService baseDictService;

    @Value("${os_type}")
    private String os_type;

    @Value("${os_unit}")
    private String os_unit;






    /**
     * 查询所有的商品规格
     * @return
     */
    @RequestMapping(value = "getOas")
    public String findAllOs(Model model){
        try{
            List<OfficeSupplies> all = officeSuppliesService.findAll();
            List<Dictionary> osTypes = baseDictService.findTypes(os_type);
            List<Dictionary> osUnits = baseDictService.findTypes(os_unit);
            model.addAttribute("allOs",all);
            model.addAttribute("osTypes",osTypes);
            model.addAttribute("osUnits",osUnits);
            return "os/osStandard";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }

    }

    /**
     * 添加办公用品规格
     * @param officeSupplies
     * @return
     */
    @RequestMapping(value = "addOs",method = RequestMethod.POST)
    @ResponseBody
    public String addOs(OfficeSupplies officeSupplies){
        try {
            officeSupplies.setOsId(BaseUtils.getUUID());
            officeSuppliesService.insertOfficeSupplies(officeSupplies);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 删除办公用品规格
     * @param osId
     * @return
     */
    @RequestMapping(value = "deleteOs",method = RequestMethod.POST)
    @ResponseBody
    public String deleteOs(String osId){
        try {
            officeSuppliesService.deleteOfficeSupplies(osId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 回显办公用品规格
     * @param osId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "editOs",method = RequestMethod.POST)
    @ResponseBody
    public OfficeSupplies editOs(String osId) throws Exception{
       return officeSuppliesService.findOfficeSuppliesById(osId);
    }

    /**
     * 更新办公用品
     * @param officeSupplies
     * @return
     */
    @RequestMapping(value = "updateOs",method = RequestMethod.POST)
    @ResponseBody
    public String updateOs(OfficeSupplies officeSupplies){
        try {
            officeSuppliesService.updateOfficeSupplies(officeSupplies);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }



}
