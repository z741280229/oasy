package com.ethan.oasy.pojo;

public class NoticeAndNews {
    private String nId;

    private String nTitle;

    private Integer nType;

    private String nTypeName;

    private String nSender;

    private String nSenderName;

    private String nSendTime;

    private String nFilePath;

    private String nFileType;

    private String nFileNumName;

    private String nFileRealName;

    private Byte nGrade;

    private Byte dataStatus;

    private Byte nDistinguish;

    private String nSendContent;

    public String getnId() {
        return nId;
    }

    public void setnId(String nId) {
        this.nId = nId == null ? null : nId.trim();
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle == null ? null : nTitle.trim();
    }

    public Integer getnType() {
        return nType;
    }

    public void setnType(Integer nType) {
        this.nType = nType;
    }

    public String getnSender() {
        return nSender;
    }

    public void setnSender(String nSender) {
        this.nSender = nSender == null ? null : nSender.trim();
    }

    public String getnSenderName() {
        return nSenderName;
    }

    public void setnSenderName(String nSenderName) {
        this.nSenderName = nSenderName == null ? null : nSenderName.trim();
    }

    public String getnSendTime() {
        return nSendTime;
    }

    public void setnSendTime(String nSendTime) {
        this.nSendTime = nSendTime == null ? null : nSendTime.trim();
    }

    public String getnFilePath() {
        return nFilePath;
    }

    public void setnFilePath(String nFilePath) {
        this.nFilePath = nFilePath == null ? null : nFilePath.trim();
    }

    public String getnFileType() {
        return nFileType;
    }

    public void setnFileType(String nFileType) {
        this.nFileType = nFileType == null ? null : nFileType.trim();
    }

    public String getnFileNumName() {
        return nFileNumName;
    }

    public void setnFileNumName(String nFileNumName) {
        this.nFileNumName = nFileNumName == null ? null : nFileNumName.trim();
    }

    public String getnFileRealName() {
        return nFileRealName;
    }

    public void setnFileRealName(String nFileRealName) {
        this.nFileRealName = nFileRealName == null ? null : nFileRealName.trim();
    }

    public Byte getnGrade() {
        return nGrade;
    }

    public void setnGrade(Byte nGrade) {
        this.nGrade = nGrade;
    }

    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }

    public Byte getnDistinguish() {
        return nDistinguish;
    }

    public void setnDistinguish(Byte nDistinguish) {
        this.nDistinguish = nDistinguish;
    }

    public String getnSendContent() {
        return nSendContent;
    }

    public void setnSendContent(String nSendContent) {
        this.nSendContent = nSendContent == null ? null : nSendContent.trim();
    }

    public String getnTypeName() {
        return nTypeName;
    }

    public void setnTypeName(String nTypeName) {
        this.nTypeName = nTypeName;
    }

    @Override
    public String toString() {
        return "NoticeAndNews{" +
                "nId='" + nId + '\'' +
                ", nTitle='" + nTitle + '\'' +
                ", nType=" + nType +
                ", nTypeName='" + nTypeName + '\'' +
                ", nSender='" + nSender + '\'' +
                ", nSenderName='" + nSenderName + '\'' +
                ", nSendTime='" + nSendTime + '\'' +
                ", nFilePath='" + nFilePath + '\'' +
                ", nFileType='" + nFileType + '\'' +
                ", nFileNumName='" + nFileNumName + '\'' +
                ", nFileRealName='" + nFileRealName + '\'' +
                ", nGrade=" + nGrade +
                ", dataStatus=" + dataStatus +
                ", nDistinguish=" + nDistinguish +
                ", nSendContent='" + nSendContent + '\'' +
                '}';
    }
}