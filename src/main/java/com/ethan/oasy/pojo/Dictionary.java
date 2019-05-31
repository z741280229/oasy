package com.ethan.oasy.pojo;

public class Dictionary {
    private Integer dictId;

    private String dictTypeId;

    private String dictTypeNum;

    private String dictTypeDetails;

    public Integer getDictId() {
        return dictId;
    }

    public void setDictId(Integer dictId) {
        this.dictId = dictId;
    }

    public String getDictTypeId() {
        return dictTypeId;
    }

    public void setDictTypeId(String dictTypeId) {
        this.dictTypeId = dictTypeId == null ? null : dictTypeId.trim();
    }

    public String getDictTypeNum() {
        return dictTypeNum;
    }

    public void setDictTypeNum(String dictTypeNum) {
        this.dictTypeNum = dictTypeNum == null ? null : dictTypeNum.trim();
    }

    public String getDictTypeDetails() {
        return dictTypeDetails;
    }

    public void setDictTypeDetails(String dictTypeDetails) {
        this.dictTypeDetails = dictTypeDetails == null ? null : dictTypeDetails.trim();
    }

    @Override
    public String toString() {
        return "Dictionary{" +
                "dictId=" + dictId +
                ", dictTypeId='" + dictTypeId + '\'' +
                ", dictTypeNum='" + dictTypeNum + '\'' +
                ", dictTypeDetails='" + dictTypeDetails + '\'' +
                '}';
    }
}