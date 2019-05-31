package com.ethan.oasy.pojo;

import java.util.List;

public class Conference {
    private String conId;

    private String conTheme;

    private Integer conType;

    private String conCompereName;

    private String conCompere;

    private String conSponsorDapartName;

    private String conSponsorDapart;

    private String conLinkman;

    private String conLinkmanName;

    private String conLinkmanTel;

    private Integer conPlaceId;

    private String conPlaceName;

    private Integer conModel;

    private String conRecorder;

    private String conRecorderName;

    private String conEndDate;

    private String conStartDate;

    private Integer conStatus;

    private String conOkTime;

    private String conAppTime;

    private String toStaff;

    private List<Staff>  needReachedStaffs;

    private List<Staff>  factReachedStaffs;

    private String members;

    private Integer dataStatus;

    public String getConId() {
        return conId;
    }

    public void setConId(String conId) {
        this.conId = conId == null ? null : conId.trim();
    }

    public String getConTheme() {
        return conTheme;
    }

    public void setConTheme(String conTheme) {
        this.conTheme = conTheme == null ? null : conTheme.trim();
    }

    public Integer getConType() {
        return conType;
    }

    public void setConType(Integer conType) {
        this.conType = conType;
    }

    public String getConCompereName() {
        return conCompereName;
    }

    public void setConCompereName(String conCompereName) {
        this.conCompereName = conCompereName == null ? null : conCompereName.trim();
    }

    public String getConCompere() {
        return conCompere;
    }

    public void setConCompere(String conCompere) {
        this.conCompere = conCompere == null ? null : conCompere.trim();
    }

    public String getConSponsorDapartName() {
        return conSponsorDapartName;
    }

    public void setConSponsorDapartName(String conSponsorDapartName) {
        this.conSponsorDapartName = conSponsorDapartName == null ? null : conSponsorDapartName.trim();
    }

    public String getConSponsorDapart() {
        return conSponsorDapart;
    }

    public void setConSponsorDapart(String conSponsorDapart) {
        this.conSponsorDapart = conSponsorDapart == null ? null : conSponsorDapart.trim();
    }

    public String getConLinkman() {
        return conLinkman;
    }

    public void setConLinkman(String conLinkman) {
        this.conLinkman = conLinkman == null ? null : conLinkman.trim();
    }

    public String getConLinkmanName() {
        return conLinkmanName;
    }

    public void setConLinkmanName(String conLinkmanName) {
        this.conLinkmanName = conLinkmanName == null ? null : conLinkmanName.trim();
    }

    public String getConLinkmanTel() {
        return conLinkmanTel;
    }

    public void setConLinkmanTel(String conLinkmanTel) {
        this.conLinkmanTel = conLinkmanTel == null ? null : conLinkmanTel.trim();
    }

    public Integer getConPlaceId() {
        return conPlaceId;
    }

    public void setConPlaceId(Integer conPlaceId) {
        this.conPlaceId = conPlaceId;
    }

    public String getConPlaceName() {
        return conPlaceName;
    }

    public void setConPlaceName(String conPlaceName) {
        this.conPlaceName = conPlaceName == null ? null : conPlaceName.trim();
    }

    public Integer getConModel() {
        return conModel;
    }

    public void setConModel(Integer conModel) {
        this.conModel = conModel;
    }

    public String getConRecorder() {
        return conRecorder;
    }

    public void setConRecorder(String conRecorder) {
        this.conRecorder = conRecorder == null ? null : conRecorder.trim();
    }

    public String getConRecorderName() {
        return conRecorderName;
    }

    public void setConRecorderName(String conRecorderName) {
        this.conRecorderName = conRecorderName == null ? null : conRecorderName.trim();
    }

    public String getConEndDate() {
        return conEndDate;
    }

    public void setConEndDate(String conEndDate) {
        this.conEndDate = conEndDate == null ? null : conEndDate.trim();
    }

    public String getConStartDate() {
        return conStartDate;
    }

    public void setConStartDate(String conStartDate) {
        this.conStartDate = conStartDate == null ? null : conStartDate.trim();
    }

    public Integer getConStatus() {
        return conStatus;
    }

    public void setConStatus(Integer conStatus) {
        this.conStatus = conStatus;
    }

    public String getConOkTime() {
        return conOkTime;
    }

    public void setConOkTime(String conOkTime) {
        this.conOkTime = conOkTime == null ? null : conOkTime.trim();
    }

    public String getConAppTime() {
        return conAppTime;
    }

    public void setConAppTime(String conAppTime) {
        this.conAppTime = conAppTime == null ? null : conAppTime.trim();
    }

    public String getToStaff() {
        return toStaff;
    }

    public void setToStaff(String toStaff) {
        this.toStaff = toStaff == null ? null : toStaff.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public List<Staff> getNeedReachedStaffs() {
        return needReachedStaffs;
    }

    public void setNeedReachedStaffs(List<Staff> needReachedStaffs) {
        this.needReachedStaffs = needReachedStaffs;
    }

    public List<Staff> getFactReachedStaffs() {
        return factReachedStaffs;
    }

    public void setFactReachedStaffs(List<Staff> factReachedStaffs) {
        this.factReachedStaffs = factReachedStaffs;
    }

    public String getMembers() {
        return members;
    }

    public void setMembers(String members) {
        this.members = members;
    }
}