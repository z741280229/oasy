package com.ethan.oasy.service;

import com.ethan.oasy.pojo.EntryWithBLOBs;
import com.ethan.oasy.pojo.MyApproval;

import java.util.List;

/**
 * 用户审批流程流转业务层接口
 */
public interface MyApprovalService {
    /**
     * 添加我的审批流程
     * @param myApproval
     * @return
     */
    int addMyApproval(MyApproval myApproval);

    /**
     * 获取我的申请
     * @param staffId
     * @return
     */
    List<EntryWithBLOBs> getMylist(String staffId);

    /**
     * 获取具体的流程
     * @param myPrId
     * @return
     */
    List<MyApproval> getMyLIstById(String myPrId);


    /**
     * 获取待我审批
     * @param staffId
     * @return
     */
    List<MyApproval> getMydealById(String staffId);

    /**
     * 更新审批流程
     * @param myApproval
     * @return
     */
    int updateApproval(MyApproval myApproval);
}
