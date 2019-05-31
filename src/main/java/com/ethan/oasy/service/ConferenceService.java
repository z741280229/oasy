package com.ethan.oasy.service;

import com.ethan.oasy.pojo.Boardroom;
import com.ethan.oasy.pojo.Conference;
import com.ethan.oasy.pojo.ConferencePart;
import com.ethan.oasy.pojo.ConferenceWithBLOBs;

import java.util.List;

/**
 * 会议业务层接口
 */
public interface ConferenceService {
    /**
     * 申请会议
     * @param conference
     * @return
     */
    int insertConference(ConferenceWithBLOBs conference);

    /**
     * 删除会议
     * @param conId
     * @return
     */
    int deleteConference(String conId);

    /**
     * 修改会议
     * @param conference
     * @return
     */
    int updateConference(ConferenceWithBLOBs conference);

    /**
     * 获取会议详情
     * @param conId
     * @return
     */
    ConferenceWithBLOBs getConferenceById(String conId);

    /**
     * 回去所有会议
     * @return
     */
    List<ConferenceWithBLOBs> getAll();

    /**
     * 获取个人所有会议
     * @param staffId
     * @return
     */
    List<ConferenceWithBLOBs> getMyAll(String staffId);

    /**
     * 获取我需要处理的会议
     * @param staffId
     * @param status
     * @return
     */
    List<ConferenceWithBLOBs> getMyDealConference(String staffId,Integer status);

    /**
     * 获取所有会议室
     * @return
     */
    List<Boardroom> findAllBoardroom();

    /**
     * 获取会议室信息
     * @param id
     * @return
     */
    Boardroom getBoardroomById(Integer id);

    /**
     * 插入到会议表中
     * @param conferencePart
     * @return
     */
    int insertToConList(ConferencePart conferencePart);

    /**
     * 获取会议人员
     * @param conId
     * @return
     */
    List<ConferencePart> getConPart(String conId);

    /**
     * 获取未做记录会议
     * @return
     */
    List<ConferenceWithBLOBs> getNotRecord();
}
