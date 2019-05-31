package com.ethan.oasy.pojo;

/**
 * @program: oasy
 * @description: 员工个人消息记录
 * @author: sam
 * @create: 2019-04-10 11:54
 */
public class StaffNoticeAndNews extends NoticeAndNews {
    private String ncId;

    private String staffId;

    private String noticeId;

    private Byte isRead;

    private Byte mark;

    private Byte dataStatus;

    public String getNcId() {
        return ncId;
    }

    public void setNcId(String ncId) {
        this.ncId = ncId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(String noticeId) {
        this.noticeId = noticeId;
    }

    public Byte getIsRead() {
        return isRead;
    }

    public void setIsRead(Byte isRead) {
        this.isRead = isRead;
    }

    public Byte getMark() {
        return mark;
    }

    public void setMark(Byte mark) {
        this.mark = mark;
    }

    @Override
    public Byte getDataStatus() {
        return dataStatus;
    }

    @Override
    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }
}
