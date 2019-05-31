package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Dictionary;
import com.ethan.oasy.pojo.OfficeSupplies;
import com.ethan.oasy.pojo.OfficeSuppliesPurchase;
import com.ethan.oasy.pojo.Staff;
import com.ethan.oasy.service.BaseDictService;
import com.ethan.oasy.service.OfficeSuppliesPurchaseService;
import com.ethan.oasy.service.OfficeSuppliesService;
import com.ethan.oasy.service.StaffService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @program: oasy
 * @description: 物品购买
 * @author: sam
 * @create: 2019-04-20 18:37
 */
@Controller
@RequestMapping("/osBuy")
public class OfficeSuppliesBuyController {

    @Autowired
    private OfficeSuppliesPurchaseService officeSuppliesPurchaseService;

    @Autowired
    private OfficeSuppliesService officeSuppliesService;

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private StaffService staffService;

    @Value("${os_type}")
    private String os_type;

    @Value("${os_unit}")
    private String os_unit;


    @Value("${os_buy_status}")
    private String os_buy_status;

    /**
     * 查询物品购买列表
     * @param model
     * @return
     */
    @RequestMapping(value = "list")
    public String getOsBuyList(Model model){
        try {
            List<OfficeSuppliesPurchase> all = officeSuppliesPurchaseService.findAll();
            List<OfficeSupplies> oslist = officeSuppliesService.findAll();
            List<Dictionary> osTypes = baseDictService.findTypes(os_type);
            List<Dictionary> osUnits = baseDictService.findTypes(os_unit);
            List<Dictionary> osBuyStatus = baseDictService.findTypes(os_buy_status);

            model.addAttribute("oslist",oslist);
            model.addAttribute("osTypes",osTypes);
            model.addAttribute("osUnits",osUnits);
            model.addAttribute("list",all);
            model.addAttribute("osBuyStatus",osBuyStatus);
            return "os/osBuyList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }

    /**
     * 采购入库列表
     * @param model
     * @return
     */
    @RequestMapping(value = "input")
    public String getInputList(Model model){
        try {
            List<OfficeSuppliesPurchase> all = officeSuppliesPurchaseService.findAll();
            List<Dictionary> osTypes = baseDictService.findTypes(os_type);
            List<Dictionary> osUnits = baseDictService.findTypes(os_unit);
            List<Dictionary> osBuyStatus = baseDictService.findTypes(os_buy_status);
            List<Staff> staffs = staffService.findAllStaffInfo();
            List<OfficeSuppliesPurchase> newAll = new ArrayList<>();
            for (OfficeSuppliesPurchase osp:all) {
               if (osp.getPurchaseStatus()>=61){
                   newAll.add(osp);
               }
            }
            for (OfficeSuppliesPurchase osp:newAll) {
                for (Staff staff:staffs){
                    if (osp.getInputerId()!=null && staff.getStaffId().equals(osp.getInputerId())){
                        osp.setInputerName(staff.getStaffName());
                    }
                }
            }
            model.addAttribute("osTypes",osTypes);
            model.addAttribute("osUnits",osUnits);
            model.addAttribute("list",newAll);
            model.addAttribute("osBuyStatus",osBuyStatus);
            return "os/osBuyInputList";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    /**
     * 提交购买申请
     * @param officeSuppliesPurchase
     * @param session
     * @return
     */
    @RequestMapping(value = "applyOsBuy",method = RequestMethod.POST)
    @ResponseBody
    public String applyOsBuy(OfficeSuppliesPurchase officeSuppliesPurchase, HttpSession session){
        try{
            officeSuppliesPurchase.setOsbId(BaseUtils.getUUID()); //设置ID
            officeSuppliesPurchase.setApplyDate(BaseUtils.getDate()); //设置申请日期
            //Staff staff = (Staff)session.getAttribute("staff");
            Staff staff = staffService.findStaffById(officeSuppliesPurchase.getPurchaserId());
            officeSuppliesPurchase.setPurchaserId(staff.getStaffId()); //设置购买者ID
            officeSuppliesPurchase.setPurchaserName(staff.getStaffName()); //设置购买者姓名
            Staff staffById = staffService.findStaffById(officeSuppliesPurchase.getAgreePurchaserId());//查询同意申请者信息
            officeSuppliesPurchase.setAgreePurchaserName(staffById.getStaffName());//设置同意申请者姓名
            //设置预算金额
            officeSuppliesPurchase.setEstimatedAmount(officeSuppliesPurchase.getOsPrice().multiply(new BigDecimal(officeSuppliesPurchase.getAppPurchaseNum())));
            officeSuppliesPurchaseService.insertOfficeSuppliesPurchase(officeSuppliesPurchase); //插入数据库中
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


    /**
     * 实际购买数量
     * @param osbId
     * @return
     */
    @RequestMapping(value = "updateNum",method = RequestMethod.POST)
    @ResponseBody
    public String updateNum(String osbId,Integer purchaseNum,Integer purchaseStatus,BigDecimal useMoney,String purchaseDate){
        try {
            OfficeSuppliesPurchase officeSuppliesPurchase = new OfficeSuppliesPurchase();
            officeSuppliesPurchase.setOsbId(osbId);
            officeSuppliesPurchase.setPurchaseNum(purchaseNum);
            if (purchaseStatus == 61){ //第n次确认购买量
                //将更新过后的购买数量传入
                officeSuppliesPurchase.setPurchaseNum(purchaseNum);
                //获取本次购买清单详情
                OfficeSuppliesPurchase details = officeSuppliesPurchaseService.findById(osbId);
                //计算两次差值
                int change = purchaseNum - details.getPurchaseNum();
                //对未入库量做出改变
                officeSuppliesPurchase.setNotInputNum(details.getNotInputNum()+change);
                //实际花费
                officeSuppliesPurchase.setUseMoney(useMoney);
                //购买时间
                officeSuppliesPurchase.setPurchaseDate(purchaseDate);

                officeSuppliesPurchase.setPurchaseStatus(purchaseStatus); //维持待入库状态

            }
            if (purchaseStatus == 60){//第一次确认购买量
                //初始化本次购买量
                officeSuppliesPurchase.setPurchaseNum(purchaseNum);
                //需入库量等于购买量
                officeSuppliesPurchase.setNotInputNum(purchaseNum);
                //实际花费
                officeSuppliesPurchase.setUseMoney(useMoney);
                //进入下一步 待入库
                officeSuppliesPurchase.setPurchaseStatus(purchaseStatus+1);
                //购买时间
                officeSuppliesPurchase.setPurchaseDate(purchaseDate);
            }
            officeSuppliesPurchaseService.updateOfficeSuppliesPurchase(officeSuppliesPurchase);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


    /**
     * 更新入库数量
     * @param osbId
     * @param inputNum
     * @return
     */
    @RequestMapping(value = "updateInputNum",method = RequestMethod.POST)
    @ResponseBody
    public String updateInputNum(String osbId,Integer inputNum,Integer purchaseStatus,String osId,HttpSession session){
        try {
            OfficeSuppliesPurchase officeSuppliesPurchase = new OfficeSuppliesPurchase();

            //查询本条购买记录
            OfficeSuppliesPurchase details = officeSuppliesPurchaseService.findById(osbId);
            //查询入库清单放入列表中
            OfficeSupplies officeSupplies = officeSuppliesService.findOfficeSuppliesById(details.getOsId());
            //设置入库时间
            officeSuppliesPurchase.setInputDate(BaseUtils.getDate());
            //设置入库人
            Staff staff = (Staff) session.getAttribute("staff");
            officeSuppliesPurchase.setInputerId(staff.getStaffId());
            //确认id
            officeSuppliesPurchase.setOsbId(osbId);

            if (purchaseStatus == 62){ //以入库重新更新数量
                officeSuppliesPurchase.setPurchaseStatus(purchaseStatus);
                Integer change = details.getNotInputNum() - inputNum; //得到剩余未入库量
                officeSuppliesPurchase.setNotInputNum(change);//重新写入未入库

                //将入库数量追加到清单中
                officeSupplies.setOsTotal(officeSupplies.getOsTotal()+inputNum);
                officeSuppliesService.updateOfficeSupplies(officeSupplies);
            }
            if (purchaseStatus == 61){ //未入库，更新数量
                Integer change = details.getNotInputNum() - inputNum; //得到剩余未入库量
                officeSuppliesPurchase.setNotInputNum(change);//重新写入未入库

                //将入库数量追加到清单中
                officeSupplies.setOsTotal(officeSupplies.getOsTotal()+inputNum);
                officeSuppliesService.updateOfficeSupplies(officeSupplies);

                officeSuppliesPurchase.setPurchaseStatus(purchaseStatus+1);
            }
            officeSuppliesPurchaseService.updateOfficeSuppliesPurchase(officeSuppliesPurchase);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 获取物品详情
     * @param osId
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "getDetails")
    @ResponseBody
    public OfficeSupplies getDetails(String osId) throws Exception{
        return officeSuppliesService.findOfficeSuppliesById(osId);
    }

}
