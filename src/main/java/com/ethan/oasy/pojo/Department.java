package com.ethan.oasy.pojo;

public class Department {
    private String departId;

    private String departNum;

    private String departLeader;

    private String departName;

    private String parentId;

    private String subSd;

    private String createDate;

    private String closeDate;

    private Byte dataStatus;

    private Integer dapartType;

    private String departDuty;

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId == null ? null : departId.trim();
    }

    public String getDepartNum() {
        return departNum;
    }

    public void setDepartNum(String departNum) {
        this.departNum = departNum == null ? null : departNum.trim();
    }

    public String getDepartLeader() {
        return departLeader;
    }

    public void setDepartLeader(String departLeader) {
        this.departLeader = departLeader == null ? null : departLeader.trim();
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName == null ? null : departName.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public String getSubSd() {
        return subSd;
    }

    public void setSubSd(String subSd) {
        this.subSd = subSd == null ? null : subSd.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(String closeDate) {
        this.closeDate = closeDate == null ? null : closeDate.trim();
    }

    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Integer getDapartType() {
        return dapartType;
    }

    public void setDapartType(Integer dapartType) {
        this.dapartType = dapartType;
    }

    public String getDepartDuty() {
        return departDuty;
    }

    public void setDepartDuty(String departDuty) {
        this.departDuty = departDuty == null ? null : departDuty.trim();
    }

    @Override
    public String toString() {
        return "Department{" +
                "departId='" + departId + '\'' +
                ", departNum='" + departNum + '\'' +
                ", departLeader='" + departLeader + '\'' +
                ", departName='" + departName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", subSd='" + subSd + '\'' +
                ", createDate='" + createDate + '\'' +
                ", closeDate='" + closeDate + '\'' +
                ", dataStatus=" + dataStatus +
                ", dapartType=" + dapartType +
                ", departDuty='" + departDuty + '\'' +
                '}';
    }
}