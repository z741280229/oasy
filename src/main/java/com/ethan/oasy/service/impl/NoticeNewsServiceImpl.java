package com.ethan.oasy.service.impl;


import com.ethan.oasy.mapper.NoticeAndNewsMapper;
import com.ethan.oasy.mapper.NoticeStaffMapper;
import com.ethan.oasy.mapper.StaffMapper;
import com.ethan.oasy.pojo.*;
import com.ethan.oasy.service.NoticeNewsService;
import com.ethan.oasy.service.StaffService;
import com.ethan.oasy.utils.BaseUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @program: oasy
 * @description: 通知公告业务层实现类
 * @author: sam
 * @create: 2019-04-08 22:11
 */
@Service
@Transactional
public class NoticeNewsServiceImpl implements NoticeNewsService {

    @Autowired
    private NoticeAndNewsMapper noticeAndNewsMapper;

    @Autowired
    private NoticeStaffMapper noticeStaffMapper;

    @Autowired
    private StaffMapper staffMapper;


    @Override
    public int insertNoticeOrNews(NoticeAndNews noticeAndNews) throws Exception{
       /* StaffExample example = new StaffExample();
        StaffExample.Criteria criteria = example.createCriteria();
        criteria.andDataStatusEqualTo(Byte.valueOf("1"));
        criteria.andStaffIdIsNotNull();
        List<Staff> staffs = staffMapper.selectByExample(example);
        for (Staff staff : staffs){
            NoticeStaff noticeStaff = new NoticeStaff();
            noticeStaff.setNcId(BaseUtils.getUUID());
            noticeStaff.setStaffId(staff.getStaffId());
            noticeStaff.setNoticeId(noticeAndNews.getnId());
            noticeStaffMapper.insertSelective(noticeStaff);
        }*/
        return noticeAndNewsMapper.insertSelective(noticeAndNews);
    }

    @Override
    public int insertStaffNoticeOrNewsToStaff(NoticeStaff noticeStaff) {
        return noticeStaffMapper.insert(noticeStaff);
    }

    @Override
    public int deleteNoticeOrNewsById(String nId) {
       NoticeAndNews noticeAndNews = new NoticeAndNews();
       noticeAndNews.setnId(nId);
       noticeAndNews.setDataStatus(Byte.valueOf("0"));
        return noticeAndNewsMapper.updateByPrimaryKeySelective(noticeAndNews);
    }

    @Override
    public int updateNoticeOrNews(NoticeAndNews notice) {
        return noticeAndNewsMapper.updateByPrimaryKeySelective(notice);
    }

    @Override
    public NoticeAndNews findNoticeOrNewsById(String nId) {
        return noticeAndNewsMapper.selectByPrimaryKey(nId);
    }

    @Override
    public List<NoticeAndNews> findAllNoticeAndNews(Byte type) {
        /*NoticeAndNewsExample example = new NoticeAndNewsExample();
        NoticeAndNewsExample.Criteria criteria = example.createCriteria();
        criteria.andNDistinguishEqualTo(type);
        criteria.andDataStatusEqualTo(Byte.valueOf("1"));

        return noticeAndNewsMapper.selectByExampleWithBLOBs(example);*/
        return noticeAndNewsMapper.findAllNoticeAndNews(type);
    }

    @Override
    public List<StaffNoticeAndNews> findAllNoticeAndNewsByStaffId(String staffId, Byte distinguish) {
        return noticeAndNewsMapper.findAllNoticeAndNewsByStaffId(staffId,distinguish);
    }
}
