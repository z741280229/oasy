package com.ethan.oasy.pojo;

import java.math.BigDecimal;

public class Staff {
    private String staffId;

    private String staffName;

    private String staffAccNum;

    private Integer staffGender;

    private String staffBirthday;

    private String staffAddress;

    private Integer staffAge;

    private String staffDepart;

    private String departName;

    private String staffPosi;

    private BigDecimal staffSal;

    private Integer staffStatus;

    private String staffHiredate;

    private String staffLeavedate;

    private String staffTel;

    private String stmail;

    private Integer staffGrade;

    private String staffPass;

    private Byte dataStatus;

    private String createDate;

    private String staffOther;

    private Integer markPower;  //主菜单管理

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId == null ? null : staffId.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public String getStaffAccNum() {
        return staffAccNum;
    }

    public void setStaffAccNum(String staffAccNum) {
        this.staffAccNum = staffAccNum == null ? null : staffAccNum.trim();
    }

    public Integer getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(Integer staffGender) {
        this.staffGender = staffGender;
    }

    public String getStaffBirthday() {
        return staffBirthday;
    }

    public void setStaffBirthday(String staffBirthday) {
        this.staffBirthday = staffBirthday == null ? null : staffBirthday.trim();
    }

    public String getStaffAddress() {
        return staffAddress;
    }

    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress == null ? null : staffAddress.trim();
    }

    public Integer getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(Integer staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffDepart() {
        return staffDepart;
    }

    public void setStaffDepart(String staffDepart) {
        this.staffDepart = staffDepart == null ? null : staffDepart.trim();
    }

    public String getStaffPosi() {
        return staffPosi;
    }

    public void setStaffPosi(String staffPosi) {
        this.staffPosi = staffPosi == null ? null : staffPosi.trim();
    }

    public BigDecimal getStaffSal() {
        return staffSal;
    }

    public void setStaffSal(BigDecimal staffSal) {
        this.staffSal = staffSal;
    }

    public Integer getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(Integer staffStatus) {
        this.staffStatus = staffStatus;
    }

    public String getStaffHiredate() {
        return staffHiredate;
    }

    public void setStaffHiredate(String staffHiredate) {
        this.staffHiredate = staffHiredate == null ? null : staffHiredate.trim();
    }

    public String getStaffLeavedate() {
        return staffLeavedate;
    }

    public void setStaffLeavedate(String staffLeavedate) {
        this.staffLeavedate = staffLeavedate == null ? null : staffLeavedate.trim();
    }

    public String getStaffTel() {
        return staffTel;
    }

    public void setStaffTel(String staffTel) {
        this.staffTel = staffTel == null ? null : staffTel.trim();
    }

    public String getStmail() {
        return stmail;
    }

    public void setStmail(String stmail) {
        this.stmail = stmail == null ? null : stmail.trim();
    }

    public Integer getStaffGrade() {
        return staffGrade;
    }

    public void setStaffGrade(Integer staffGrade) {
        this.staffGrade = staffGrade;
    }

    public String getStaffPass() {
        return staffPass;
    }

    public void setStaffPass(String staffPass) {
        this.staffPass = staffPass == null ? null : staffPass.trim();
    }

    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getStaffOther() {
        return staffOther;
    }

    public void setStaffOther(String staffOther) {
        this.staffOther = staffOther == null ? null : staffOther.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public Integer getMarkPower() {
        return markPower;
    }

    public void setMarkPower(Integer markPower) {
        this.markPower = markPower;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffId='" + staffId + '\'' +
                ", staffName='" + staffName + '\'' +
                ", staffAccNum='" + staffAccNum + '\'' +
                ", staffGender=" + staffGender +
                ", staffBirthday='" + staffBirthday + '\'' +
                ", staffAddress='" + staffAddress + '\'' +
                ", staffAge=" + staffAge +
                ", staffDepart='" + staffDepart + '\'' +
                ", departName='" + departName + '\'' +
                ", staffPosi='" + staffPosi + '\'' +
                ", staffSal=" + staffSal +
                ", staffStatus=" + staffStatus +
                ", staffHiredate='" + staffHiredate + '\'' +
                ", staffLeavedate='" + staffLeavedate + '\'' +
                ", staffTel='" + staffTel + '\'' +
                ", stmail='" + stmail + '\'' +
                ", staffGrade=" + staffGrade +
                ", staffPass='" + staffPass + '\'' +
                ", dataStatus=" + dataStatus +
                ", createDate='" + createDate + '\'' +
                ", staffOther='" + staffOther + '\'' +
                '}';
    }
}