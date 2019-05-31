package com.ethan.oasy.service;

import com.ethan.oasy.pojo.NoticeAndNews;
import com.ethan.oasy.pojo.NoticeStaff;
import com.ethan.oasy.pojo.StaffNoticeAndNews;

import java.util.List;

/**
 * 通知公告业务层接口
 */
public interface NoticeNewsService {
    /**
     * 插入公告或新闻
     * @param noticeAndNews
     * @return
     */
    int insertNoticeOrNews(NoticeAndNews noticeAndNews) throws Exception;

    /**
     * 将公告或写新闻写入到个人
     * @param noticeStaff
     * @return
     */
    int insertStaffNoticeOrNewsToStaff(NoticeStaff noticeStaff);

    /**
     * 删除公告或新闻
     * @param nId
     * @return
     */
    int deleteNoticeOrNewsById(String nId);

    /**
     * 更新公告或新闻
     * @param notice
     * @return
     */
    int updateNoticeOrNews(NoticeAndNews notice);

    /**
     * 查询公告和新闻
     * @param nId
     * @return
     */
    NoticeAndNews findNoticeOrNewsById(String nId);

    /**
     * 获取所有新闻或公告
     * @param type
     * @return
     */
    List<NoticeAndNews> findAllNoticeAndNews(Byte type);

    /**
     * 获取个人的工资和公告
     * @param staffId
     * @param
     * @return
     */
    List<StaffNoticeAndNews> findAllNoticeAndNewsByStaffId(String staffId, Byte distinguish);




}
