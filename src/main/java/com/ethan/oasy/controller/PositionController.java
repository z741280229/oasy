package com.ethan.oasy.controller;

import com.ethan.oasy.pojo.Position;
import com.ethan.oasy.service.PositionService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: oasy
 * @description:职位
 * @author:
 * @create: 2019-04-02 21:59
 */
@Controller
@RequestMapping("/position")
public class PositionController {

    @Autowired
    private PositionService positionService;

    /**
     * 获取职位所有信息
     * @param model
     * @return
     */
    @RequestMapping(value = "list")
    public String findAll(Model model){
        try{
            //查询所有职位信息
            List<Position> all = positionService.findAll();
            model.addAttribute("list",all);
            return "position/list";
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
    }


    /**
     * 添加
     * @param position
     * @return
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public String addPosition(Position position){
        try {
            position.setPosiId(BaseUtils.getUUID());
            position.setCreateTime(BaseUtils.getDate());
            positionService.addPosition(position);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }




    /**
     * 回显职位信息
     * @param posiId
     * @return
     */
    @RequestMapping(value = "/edit",method = RequestMethod.POST)
    @ResponseBody
    public Position single(String posiId) throws Exception{
        return positionService.findPositionById(posiId);
    }

    /**
     * 删除
     * @param posiId
     * @return
     */
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    @ResponseBody
    public String deletePosition(String posiId){
        try {
            positionService.deletePosition(posiId);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }


    /**
     * 修改职位信息
     * @param position
     * @return
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public String updatePosition(Position position){
        try {
            positionService.updatePosition(position);
            return "1";
        }catch (Exception e){
            e.printStackTrace();
            return "0";
        }
    }

}
