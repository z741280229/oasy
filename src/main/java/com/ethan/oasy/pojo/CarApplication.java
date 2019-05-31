package com.ethan.oasy.pojo;

public class CarApplication {
    private String carAppId;

    private String carAppUserId;

    private String carAppUserName;

    private String carAppUserTel;

    private String carId;

    private String carName;

    private String carNum;

    private String driverId;

    private String driverName;

    private String driverTel;

    private Integer nature;

    private String startTime;

    private String endTime;

    private Integer preRun;

    private Integer factRun;

    private String startPart;

    private String endPart;

    private Integer carAppStatus;

    private String toStaff;

    private String returnDate;

    private String appCarTime;

    private Integer dataStatus;

    private String useReason;

    public String getCarAppId() {
        return carAppId;
    }

    public void setCarAppId(String carAppId) {
        this.carAppId = carAppId == null ? null : carAppId.trim();
    }

    public String getCarAppUserId() {
        return carAppUserId;
    }

    public void setCarAppUserId(String carAppUserId) {
        this.carAppUserId = carAppUserId == null ? null : carAppUserId.trim();
    }

    public String getCarAppUserName() {
        return carAppUserName;
    }

    public void setCarAppUserName(String carAppUserName) {
        this.carAppUserName = carAppUserName == null ? null : carAppUserName.trim();
    }

    public String getCarAppUserTel() {
        return carAppUserTel;
    }

    public void setCarAppUserTel(String carAppUserTel) {
        this.carAppUserTel = carAppUserTel == null ? null : carAppUserTel.trim();
    }

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName == null ? null : carName.trim();
    }

    public String getCarNum() {
        return carNum;
    }

    public void setCarNum(String carNum) {
        this.carNum = carNum == null ? null : carNum.trim();
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId == null ? null : driverId.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getDriverTel() {
        return driverTel;
    }

    public void setDriverTel(String driverTel) {
        this.driverTel = driverTel == null ? null : driverTel.trim();
    }

    public Integer getNature() {
        return nature;
    }

    public void setNature(Integer nature) {
        this.nature = nature;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public Integer getPreRun() {
        return preRun;
    }

    public void setPreRun(Integer preRun) {
        this.preRun = preRun;
    }

    public Integer getFactRun() {
        return factRun;
    }

    public void setFactRun(Integer factRun) {
        this.factRun = factRun;
    }

    public String getStartPart() {
        return startPart;
    }

    public void setStartPart(String startPart) {
        this.startPart = startPart == null ? null : startPart.trim();
    }

    public String getEndPart() {
        return endPart;
    }

    public void setEndPart(String endPart) {
        this.endPart = endPart == null ? null : endPart.trim();
    }

    public Integer getCarAppStatus() {
        return carAppStatus;
    }

    public void setCarAppStatus(Integer carAppStatus) {
        this.carAppStatus = carAppStatus;
    }

    public String getToStaff() {
        return toStaff;
    }

    public void setToStaff(String toStaff) {
        this.toStaff = toStaff == null ? null : toStaff.trim();
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate == null ? null : returnDate.trim();
    }

    public String getAppCarTime() {
        return appCarTime;
    }

    public void setAppCarTime(String appCarTime) {
        this.appCarTime = appCarTime == null ? null : appCarTime.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    public String getUseReason() {
        return useReason;
    }

    public void setUseReason(String useReason) {
        this.useReason = useReason == null ? null : useReason.trim();
    }

    @Override
    public String toString() {
        return "CarApplication{" +
                "carAppId='" + carAppId + '\'' +
                ", carAppUserId='" + carAppUserId + '\'' +
                ", carAppUserName='" + carAppUserName + '\'' +
                ", carAppUserTel='" + carAppUserTel + '\'' +
                ", carId='" + carId + '\'' +
                ", carName='" + carName + '\'' +
                ", carNum='" + carNum + '\'' +
                ", driverId='" + driverId + '\'' +
                ", driverName='" + driverName + '\'' +
                ", driverTel='" + driverTel + '\'' +
                ", nature=" + nature +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", preRun=" + preRun +
                ", factRun=" + factRun +
                ", startPart='" + startPart + '\'' +
                ", endPart='" + endPart + '\'' +
                ", carAppStatus=" + carAppStatus +
                ", toStaff='" + toStaff + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", appCarTime='" + appCarTime + '\'' +
                ", dataStatus=" + dataStatus +
                ", useReason='" + useReason + '\'' +
                '}';
    }
}