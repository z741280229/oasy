package com.ethan.oasy.pojo;

public class OfficeSuppliesCheckLog {
    private Integer osCheckId;

    private String osId;

    private Integer osNowNum;

    private Integer osNowCheckNum;

    private String checkTime;

    private String checkStaff;

    private String checkStaffName;

    private Integer datatstatus;

    public Integer getOsCheckId() {
        return osCheckId;
    }

    public void setOsCheckId(Integer osCheckId) {
        this.osCheckId = osCheckId;
    }

    public String getOsId() {
        return osId;
    }

    public void setOsId(String osId) {
        this.osId = osId == null ? null : osId.trim();
    }

    public Integer getOsNowNum() {
        return osNowNum;
    }

    public void setOsNowNum(Integer osNowNum) {
        this.osNowNum = osNowNum;
    }

    public Integer getOsNowCheckNum() {
        return osNowCheckNum;
    }

    public void setOsNowCheckNum(Integer osNowCheckNum) {
        this.osNowCheckNum = osNowCheckNum;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }

    public String getCheckStaff() {
        return checkStaff;
    }

    public void setCheckStaff(String checkStaff) {
        this.checkStaff = checkStaff == null ? null : checkStaff.trim();
    }

    public String getCheckStaffName() {
        return checkStaffName;
    }

    public void setCheckStaffName(String checkStaffName) {
        this.checkStaffName = checkStaffName == null ? null : checkStaffName.trim();
    }

    public Integer getDatatstatus() {
        return datatstatus;
    }

    public void setDatatstatus(Integer datatstatus) {
        this.datatstatus = datatstatus;
    }
}