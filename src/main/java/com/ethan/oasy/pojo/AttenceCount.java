package com.ethan.oasy.pojo;

/**
 * @program: oasy
 * @description: 出勤统计
 * @author: sam
 * @create: 2019-05-01 16:01
 */
public class AttenceCount {
    private String staffId;

    private String staffName;

    private String staffNum;

    private String staffDepart;

    private Integer needAttence;

    private Integer factCheckIn;

    private Integer notCheckIn;

    private Integer factSigning;

    private Integer notSigning;

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(String staffNum) {
        this.staffNum = staffNum;
    }

    public String getStaffDepart() {
        return staffDepart;
    }

    public void setStaffDepart(String staffDepart) {
        this.staffDepart = staffDepart;
    }

    public Integer getNeedAttence() {
        return needAttence;
    }

    public void setNeedAttence(Integer needAttence) {
        this.needAttence = needAttence;
    }

    public Integer getFactCheckIn() {
        return factCheckIn;
    }

    public void setFactCheckIn(Integer factCheckIn) {
        this.factCheckIn = factCheckIn;
    }

    public Integer getNotCheckIn() {
        return notCheckIn;
    }

    public void setNotCheckIn(Integer notCheckIn) {
        this.notCheckIn = notCheckIn;
    }

    public Integer getFactSigning() {
        return factSigning;
    }

    public void setFactSigning(Integer factSigning) {
        this.factSigning = factSigning;
    }

    public Integer getNotSigning() {
        return notSigning;
    }

    public void setNotSigning(Integer notSigning) {
        this.notSigning = notSigning;
    }
}
