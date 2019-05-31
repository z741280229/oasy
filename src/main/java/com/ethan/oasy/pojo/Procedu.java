package com.ethan.oasy.pojo;

public class Procedu {
    private Integer prId;

    private Integer prTypeId;

    private String prName;

    private String prStaffId;

    private Integer prNumber;

    private Integer prStatus;

    private Integer dataStatus;

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

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName == null ? null : prName.trim();
    }

    public String getPrStaffId() {
        return prStaffId;
    }

    public void setPrStaffId(String prStaffId) {
        this.prStaffId = prStaffId == null ? null : prStaffId.trim();
    }

    public Integer getPrNumber() {
        return prNumber;
    }

    public void setPrNumber(Integer prNumber) {
        this.prNumber = prNumber;
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
}