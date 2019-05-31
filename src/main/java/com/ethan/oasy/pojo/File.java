package com.ethan.oasy.pojo;

public class File {
    private String fileId;

    private String fileNum;

    private String fileName;

    private Integer fileParent;

    private Integer fileGrade;

    private Integer fileDeadline;

    private Integer fileSaveWay;

    private String fileSavePersonName;

    private String fileSavePerson;

    private String fileSaveDate;

    private Integer fileStatus;

    private String fileBelongName;

    private Integer fileBelong;

    private String fileSavePlace;

    private Integer dataStatus;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFileNum() {
        return fileNum;
    }

    public void setFileNum(String fileNum) {
        this.fileNum = fileNum == null ? null : fileNum.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Integer getFileParent() {
        return fileParent;
    }

    public void setFileParent(Integer fileParent) {
        this.fileParent = fileParent;
    }

    public Integer getFileGrade() {
        return fileGrade;
    }

    public void setFileGrade(Integer fileGrade) {
        this.fileGrade = fileGrade;
    }

    public Integer getFileDeadline() {
        return fileDeadline;
    }

    public void setFileDeadline(Integer fileDeadline) {
        this.fileDeadline = fileDeadline;
    }

    public Integer getFileSaveWay() {
        return fileSaveWay;
    }

    public void setFileSaveWay(Integer fileSaveWay) {
        this.fileSaveWay = fileSaveWay;
    }

    public String getFileSavePersonName() {
        return fileSavePersonName;
    }

    public void setFileSavePersonName(String fileSavePersonName) {
        this.fileSavePersonName = fileSavePersonName == null ? null : fileSavePersonName.trim();
    }

    public String getFileSavePerson() {
        return fileSavePerson;
    }

    public void setFileSavePerson(String fileSavePerson) {
        this.fileSavePerson = fileSavePerson == null ? null : fileSavePerson.trim();
    }

    public String getFileSaveDate() {
        return fileSaveDate;
    }

    public void setFileSaveDate(String fileSaveDate) {
        this.fileSaveDate = fileSaveDate == null ? null : fileSaveDate.trim();
    }

    public Integer getFileStatus() {
        return fileStatus;
    }

    public void setFileStatus(Integer fileStatus) {
        this.fileStatus = fileStatus;
    }

    public String getFileBelongName() {
        return fileBelongName;
    }

    public void setFileBelongName(String fileBelongName) {
        this.fileBelongName = fileBelongName == null ? null : fileBelongName.trim();
    }

    public Integer getFileBelong() {
        return fileBelong;
    }

    public void setFileBelong(Integer fileBelong) {
        this.fileBelong = fileBelong;
    }

    public String getFileSavePlace() {
        return fileSavePlace;
    }

    public void setFileSavePlace(String fileSavePlace) {
        this.fileSavePlace = fileSavePlace == null ? null : fileSavePlace.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public String toString() {
        return "File{" +
                "fileId='" + fileId + '\'' +
                ", fileNum='" + fileNum + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileParent=" + fileParent +
                ", fileGrade=" + fileGrade +
                ", fileDeadline=" + fileDeadline +
                ", fileSaveWay=" + fileSaveWay +
                ", fileSavePersonName='" + fileSavePersonName + '\'' +
                ", fileSavePerson='" + fileSavePerson + '\'' +
                ", fileSaveDate='" + fileSaveDate + '\'' +
                ", fileStatus=" + fileStatus +
                ", fileBelongName='" + fileBelongName + '\'' +
                ", fileBelong=" + fileBelong +
                ", fileSavePlace='" + fileSavePlace + '\'' +
                ", dataStatus=" + dataStatus +
                '}';
    }
}