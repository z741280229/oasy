package com.ethan.oasy.pojo;

public class MyApproval {
    private Integer myapId;

    private String apId;

    private Integer prId;

    private Integer prTypeId;

    private String prTypeName;

    private Integer prNumber;

    private String prStaffId;

    private String prDealTime;

    private Integer prStatus;

    private Integer dataStatus;

    private EntryWithBLOBs entryWithBLOBs;

    public Integer getMyapId() {
        return myapId;
    }

    public void setMyapId(Integer myapId) {
        this.myapId = myapId;
    }

    public String getApId() {
        return apId;
    }

    public void setApId(String apId) {
        this.apId = apId == null ? null : apId.trim();
    }

    public Integer getPrId() {
        return prId;
    }

    public void setPrId(Integer prId) {
        this.prId = prId;
    }

    public Integer getPrTypeId() {
        return prTypeId;
    }

    public void setPrTypeId(Integer prTypeId) {
        this.prTypeId = prTypeId;
    }

    public String getPrTypeName() {
        return prTypeName;
    }

    public void setPrTypeName(String prTypeName) {
        this.prTypeName = prTypeName == null ? null : prTypeName.trim();
    }

    public Integer getPrNumber() {
        return prNumber;
    }

    public void setPrNumber(Integer prNumber) {
        this.prNumber = prNumber;
    }

    public String getPrStaffId() {
        return prStaffId;
    }

    public void setPrStaffId(String prStaffId) {
        this.prStaffId = prStaffId == null ? null : prStaffId.trim();
    }

    public String getPrDealTime() {
        return prDealTime;
    }

    public void setPrDealTime(String prDealTime) {
        this.prDealTime = prDealTime == null ? null : prDealTime.trim();
    }

    public Integer getPrStatus() {
        return prStatus;
    }

    public void setPrStatus(Integer prStatus) {
        this.prStatus = prStatus;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public EntryWithBLOBs getEntryWithBLOBs() {
        return entryWithBLOBs;
    }

    public void setEntryWithBLOBs(EntryWithBLOBs entryWithBLOBs) {
        this.entryWithBLOBs = entryWithBLOBs;
    }
}