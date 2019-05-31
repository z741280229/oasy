package com.ethan.oasy.service.impl;

import com.ethan.oasy.mapper.BoardroomMapper;
import com.ethan.oasy.mapper.ConferenceMapper;
import com.ethan.oasy.mapper.ConferencePartMapper;
import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.ConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 会议业务层实现类
 * @author: sam
 * @create: 2019-04-22 18:03
 */
@Service
@Transactional
public class ConferenceServiceImpl implements ConferenceService {

    @Autowired
    private ConferenceMapper conferenceMapper;

    @Autowired
    private BoardroomMapper boardroomMapper;

    @Autowired
    private ConferencePartMapper conferencePartMapper;

    @Override
    public int insertConference(ConferenceWithBLOBs conference) {
        return conferenceMapper.insertSelective(conference);
    }

    @Override
    public int deleteConference(String conId) {
        ConferenceWithBLOBs conferenceWithBLOBs = new ConferenceWithBLOBs();
        conferenceWithBLOBs.setConId(conId);
        conferenceWithBLOBs.setDataStatus(0);
        return conferenceMapper.updateByPrimaryKeySelective(conferenceWithBLOBs);
    }

    @Override
    public int updateConference(ConferenceWithBLOBs conference) {
        return conferenceMapper.updateByPrimaryKeySelective(conference);
    }

    @Override
    public ConferenceWithBLOBs getConferenceById(String conId) {
        return conferenceMapper.selectByPrimaryKey(conId);
    }

    @Override
    public List<ConferenceWithBLOBs> getAll() {
        ConferenceExample conferenceExample = new ConferenceExample();
        ConferenceExample.Criteria criteria = conferenceExample.createCriteria();
        criteria.andDataStatusEqualTo(1);
        criteria.andConIdIsNull();
        return conferenceMapper.selectByExampleWithBLOBs(conferenceExample);
    }

    @Override
    public List<ConferenceWithBLOBs> getMyAll(String staffId) {
        return conferenceMapper.getMyAll(staffId);
    }

    @Override
    public List<ConferenceWithBLOBs> getMyDealConference(String staffId, Integer status) {
        return conferenceMapper.getMyDealConference(staffId,status);
    }

    @Override
    public List<Boardroom> findAllBoardroom() {
        BoardroomExample example = new BoardroomExample();
        BoardroomExample.Criteria criteria = example.createCriteria();
        criteria.andBdIdIsNotNull();
        return boardroomMapper.selectByExample(example);
    }

    @Override
    public Boardroom getBoardroomById(Integer id) {
        return boardroomMapper.selectByPrimaryKey(id);
    }

    @Override
    public int insertToConList(ConferencePart conferencePart) {
        return conferencePartMapper.insertSelective(conferencePart);
    }

    @Override
    public List<ConferencePart> getConPart(String conId) {
        ConferencePartExample example = new ConferencePartExample();
        ConferencePartExample.Criteria criteria = example.createCriteria();
        criteria.andConferenceIdEqualTo(conId);
        criteria.andPartIdIsNotNull();
        return conferencePartMapper.selectByExample(example);
    }

    @Override
    public List<ConferenceWithBLOBs> getNotRecord() {
        ConferenceExample example = new ConferenceExample();
        ConferenceExample.Criteria criteria = example.createCriteria();
        criteria.andConRecorderIsNull();
        criteria.andDataStatusEqualTo(1);
        return conferenceMapper.selectByExampleWithBLOBs(example);
    }
}
