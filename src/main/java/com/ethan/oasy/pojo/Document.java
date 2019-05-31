package com.ethan.oasy.pojo;

import java.math.BigDecimal;

public class Document {
    private String docuId;

    private String docuName;

    private BigDecimal docuSize;

    private Integer docuDownloadNum;

    private String uploaderName;

    private String uploader;

    private String docuRealName;

    private String docuNumName;

    private String docuType;

    private String docuPath;

    private Integer catalog;

    private Integer dataStatus;

    private String url;

    public String getDocuId() {
        return docuId;
    }

    public void setDocuId(String docuId) {
        this.docuId = docuId == null ? null : docuId.trim();
    }

    public String getDocuName() {
        return docuName;
    }

    public void setDocuName(String docuName) {
        this.docuName = docuName == null ? null : docuName.trim();
    }

    public BigDecimal getDocuSize() {
        return docuSize;
    }

    public void setDocuSize(BigDecimal docuSize) {
        this.docuSize = docuSize;
    }

    public Integer getDocuDownloadNum() {
        return docuDownloadNum;
    }

    public void setDocuDownloadNum(Integer docuDownloadNum) {
        this.docuDownloadNum = docuDownloadNum;
    }

    public String getUploaderName() {
        return uploaderName;
    }

    public void setUploaderName(String uploaderName) {
        this.uploaderName = uploaderName == null ? null : uploaderName.trim();
    }

    public String getUploader() {
        return uploader;
    }

    public void setUploader(String uploader) {
        this.uploader = uploader == null ? null : uploader.trim();
    }

    public String getDocuRealName() {
        return docuRealName;
    }

    public void setDocuRealName(String docuRealName) {
        this.docuRealName = docuRealName == null ? null : docuRealName.trim();
    }

    public String getDocuNumName() {
        return docuNumName;
    }

    public void setDocuNumName(String docuNumName) {
        this.docuNumName = docuNumName == null ? null : docuNumName.trim();
    }

    public String getDocuType() {
        return docuType;
    }

    public void setDocuType(String docuType) {
        this.docuType = docuType == null ? null : docuType.trim();
    }

    public String getDocuPath() {
        return docuPath;
    }

    public void setDocuPath(String docuPath) {
        this.docuPath = docuPath == null ? null : docuPath.trim();
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }


    @Override
    public String toString() {
        return "Document{" +
                "docuId='" + docuId + '\'' +
                ", docuName='" + docuName + '\'' +
                ", docuSize=" + docuSize +
                ", docuDownloadNum=" + docuDownloadNum +
                ", uploaderName='" + uploaderName + '\'' +
                ", uploader='" + uploader + '\'' +
                ", docuRealName='" + docuRealName + '\'' +
                ", docuNumName='" + docuNumName + '\'' +
                ", docuType='" + docuType + '\'' +
                ", docuPath='" + docuPath + '\'' +
                ", catalog=" + catalog +
                ", dataStatus=" + dataStatus +
                ", url='" + url + '\'' +
                '}';
    }
}