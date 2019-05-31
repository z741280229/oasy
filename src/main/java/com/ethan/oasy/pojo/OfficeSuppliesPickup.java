package com.ethan.oasy.pojo;

public class OfficeSuppliesPickup  extends OfficeSupplies{
    private String ospId;

    private String osId;

    private String pickupStaffId;

    private String pickupStaffName;

    private String pickupStaffDepart;

    private Integer pickupNum;

    private String pickupDate;

    private String appDate;

    private String toAppId;

    private Integer appStatus;

    private Integer dataStatus;

    private String others;

    public String getOspId() {
        return ospId;
    }

    public void setOspId(String ospId) {
        this.ospId = ospId == null ? null : ospId.trim();
    }

    public String getOsId() {
        return osId;
    }

    public void setOsId(String osId) {
        this.osId = osId == null ? null : osId.trim();
    }

    public String getPickupStaffId() {
        return pickupStaffId;
    }

    public void setPickupStaffId(String pickupStaffId) {
        this.pickupStaffId = pickupStaffId == null ? null : pickupStaffId.trim();
    }

    public String getPickupStaffName() {
        return pickupStaffName;
    }

    public void setPickupStaffName(String pickupStaffName) {
        this.pickupStaffName = pickupStaffName == null ? null : pickupStaffName.trim();
    }

    public String getPickupStaffDepart() {
        return pickupStaffDepart;
    }

    public void setPickupStaffDepart(String pickupStaffDepart) {
        this.pickupStaffDepart = pickupStaffDepart == null ? null : pickupStaffDepart.trim();
    }

    public Integer getPickupNum() {
        return pickupNum;
    }

    public void setPickupNum(Integer pickupNum) {
        this.pickupNum = pickupNum;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate == null ? null : pickupDate.trim();
    }

    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate == null ? null : appDate.trim();
    }

    public String getToAppId() {
        return toAppId;
    }

    public void setToAppId(String toAppId) {
        this.toAppId = toAppId == null ? null : toAppId.trim();
    }

    public Integer getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(Integer appStatus) {
        this.appStatus = appStatus;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }
}