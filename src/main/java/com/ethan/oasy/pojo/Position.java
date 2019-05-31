package com.ethan.oasy.pojo;

public class Position {
    private String posiId;

    private String posiName;

    private String posiContent;

    private String createTime;

    private String closeTime;

    private String subPosi;

    private String parentPosi;

    private Byte dataStatus;

    public String getPosiId() {
        return posiId;
    }

    public void setPosiId(String posiId) {
        this.posiId = posiId == null ? null : posiId.trim();
    }

    public String getPosiName() {
        return posiName;
    }

    public void setPosiName(String posiName) {
        this.posiName = posiName == null ? null : posiName.trim();
    }

    public String getPosiContent() {
        return posiContent;
    }

    public void setPosiContent(String posiContent) {
        this.posiContent = posiContent == null ? null : posiContent.trim();
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

    public String getSubPosi() {
        return subPosi;
    }

    public void setSubPosi(String subPosi) {
        this.subPosi = subPosi == null ? null : subPosi.trim();
    }

    public String getParentPosi() {
        return parentPosi;
    }

    public void setParentPosi(String parentPosi) {
        this.parentPosi = parentPosi == null ? null : parentPosi.trim();
    }

    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }
}