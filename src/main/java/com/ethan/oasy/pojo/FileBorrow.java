package com.ethan.oasy.pojo;

public class FileBorrow {
    private String fileBorrowId;

    private String fileId;

    private String fileNum;

    private String fileName;

    private String borrowerName;

    private String borrowerNum;

    private String borrowerId;

    private String fileBorrowDate;

    private String fileReturnDate;

    private String filePreReturnDate;

    private Integer fileBorrowStatus;

    private String dealBorrowId;

    private String dealBorrowName;

    private String dealReturnId;

    private String dealReturnName;

    private Integer dataStatus;

    private String fileBorrowReason;

    public String getFileBorrowId() {
        return fileBorrowId;
    }

    public void setFileBorrowId(String fileBorrowId) {
        this.fileBorrowId = fileBorrowId == null ? null : fileBorrowId.trim();
    }

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

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName == null ? null : borrowerName.trim();
    }

    public String getBorrowerNum() {
        return borrowerNum;
    }

    public void setBorrowerNum(String borrowerNum) {
        this.borrowerNum = borrowerNum == null ? null : borrowerNum.trim();
    }

    public String getBorrowerId() {
        return borrowerId;
    }

    public void setBorrowerId(String borrowerId) {
        this.borrowerId = borrowerId == null ? null : borrowerId.trim();
    }

    public String getFileBorrowDate() {
        return fileBorrowDate;
    }

    public void setFileBorrowDate(String fileBorrowDate) {
        this.fileBorrowDate = fileBorrowDate == null ? null : fileBorrowDate.trim();
    }

    public String getFileReturnDate() {
        return fileReturnDate;
    }

    public void setFileReturnDate(String fileReturnDate) {
        this.fileReturnDate = fileReturnDate == null ? null : fileReturnDate.trim();
    }

    public String getFilePreReturnDate() {
        return filePreReturnDate;
    }

    public void setFilePreReturnDate(String filePreReturnDate) {
        this.filePreReturnDate = filePreReturnDate == null ? null : filePreReturnDate.trim();
    }

    public Integer getFileBorrowStatus() {
        return fileBorrowStatus;
    }

    public void setFileBorrowStatus(Integer fileBorrowStatus) {
        this.fileBorrowStatus = fileBorrowStatus;
    }

    public String getDealBorrowId() {
        return dealBorrowId;
    }

    public void setDealBorrowId(String dealBorrowId) {
        this.dealBorrowId = dealBorrowId == null ? null : dealBorrowId.trim();
    }

    public String getDealBorrowName() {
        return dealBorrowName;
    }

    public void setDealBorrowName(String dealBorrowName) {
        this.dealBorrowName = dealBorrowName == null ? null : dealBorrowName.trim();
    }

    public String getDealReturnId() {
        return dealReturnId;
    }

    public void setDealReturnId(String dealReturnId) {
        this.dealReturnId = dealReturnId == null ? null : dealReturnId.trim();
    }

    public String getDealReturnName() {
        return dealReturnName;
    }

    public void setDealReturnName(String dealReturnName) {
        this.dealReturnName = dealReturnName == null ? null : dealReturnName.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getFileBorrowReason() {
        return fileBorrowReason;
    }

    public void setFileBorrowReason(String fileBorrowReason) {
        this.fileBorrowReason = fileBorrowReason == null ? null : fileBorrowReason.trim();
    }

    @Override
    public String toString() {
        return "FileBorrow{" +
                "fileBorrowId='" + fileBorrowId + '\'' +
                ", fileId='" + fileId + '\'' +
                ", fileNum='" + fileNum + '\'' +
                ", fileName='" + fileName + '\'' +
                ", borrowerName='" + borrowerName + '\'' +
                ", borrowerNum='" + borrowerNum + '\'' +
                ", borrowerId='" + borrowerId + '\'' +
                ", fileBorrowDate='" + fileBorrowDate + '\'' +
                ", fileReturnDate='" + fileReturnDate + '\'' +
                ", filePreReturnDate='" + filePreReturnDate + '\'' +
                ", fileBorrowStatus=" + fileBorrowStatus +
                ", dealBorrowId='" + dealBorrowId + '\'' +
                ", dealBorrowName='" + dealBorrowName + '\'' +
                ", dealReturnId='" + dealReturnId + '\'' +
                ", dealReturnName='" + dealReturnName + '\'' +
                ", dataStatus=" + dataStatus +
                ", fileBorrowReason='" + fileBorrowReason + '\'' +
                '}';
    }
}