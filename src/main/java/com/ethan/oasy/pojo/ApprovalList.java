package com.ethan.oasy.pojo;

import java.util.List;

public class ApprovalList {
    private Integer alId;

    private String alTitle;

    private String alImg;

    private String alLink;

    private Integer alType;

    private Integer alParent;

    private Integer dataStatus;

    private List<ApprovalList> subs;

    public Integer getAlId() {
        return alId;
    }

    public void setAlId(Integer alId) {
        this.alId = alId;
    }

    public String getAlTitle() {
        return alTitle;
    }

    public void setAlTitle(String alTitle) {
        this.alTitle = alTitle == null ? null : alTitle.trim();
    }

    public String getAlImg() {
        return alImg;
    }

    public void setAlImg(String alImg) {
        this.alImg = alImg == null ? null : alImg.trim();
    }

    public String getAlLink() {
        return alLink;
    }

    public void setAlLink(String alLink) {
        this.alLink = alLink == null ? null : alLink.trim();
    }

    public Integer getAlType() {
        return alType;
    }

    public void setAlType(Integer alType) {
        this.alType = alType;
    }

    public Integer getAlParent() {
        return alParent;
    }

    public void setAlParent(Integer alParent) {
        this.alParent = alParent;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public List<ApprovalList> getSubs() {
        return subs;
    }

    public void setSubs(List<ApprovalList> subs) {
        this.subs = subs;
    }
}