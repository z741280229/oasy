package com.ethan.oasy.pojo;

public class Boardroom {
    private Integer bdId;

    private String bdName;

    private Integer bdSpace;

    private String bdPlace;

    private String createTime;

    private String closeTime;

    private String createPel;

    private Byte dataStatus;

    public Integer getBdId() {
        return bdId;
    }

    public void setBdId(Integer bdId) {
        this.bdId = bdId;
    }

    public String getBdName() {
        return bdName;
    }

    public void setBdName(String bdName) {
        this.bdName = bdName == null ? null : bdName.trim();
    }

    public Integer getBdSpace() {
        return bdSpace;
    }

    public void setBdSpace(Integer bdSpace) {
        this.bdSpace = bdSpace;
    }

    public String getBdPlace() {
        return bdPlace;
    }

    public void setBdPlace(String bdPlace) {
        this.bdPlace = bdPlace == null ? null : bdPlace.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(String closeTime) {
        this.closeTime = closeTime == null ? null : closeTime.trim();
    }

    public String getCreatePel() {
        return createPel;
    }

    public void setCreatePel(String createPel) {
        this.createPel = createPel == null ? null : createPel.trim();
    }

    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }
}