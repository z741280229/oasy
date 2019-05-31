package com.ethan.oasy.pojo;

import java.math.BigDecimal;

public class Car {
    private String carId;

    private String carNumber;

    private String carBrand;

    private Integer carType;

    private Integer carSpace;

    private String carDriverId;

    private String carDriverName;

    private String carDriverTel;

    private Integer carLimits;

    private String carDateSafe;

    private Integer carStatus;

    private Integer carMileage;

    private BigDecimal cOilMass;

    private Integer dataStatus;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId == null ? null : carId.trim();
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber == null ? null : carNumber.trim();
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand == null ? null : carBrand.trim();
    }

    public Integer getCarType() {
        return carType;
    }

    public void setCarType(Integer carType) {
        this.carType = carType;
    }

    public Integer getCarSpace() {
        return carSpace;
    }

    public void setCarSpace(Integer carSpace) {
        this.carSpace = carSpace;
    }

    public String getCarDriverId() {
        return carDriverId;
    }

    public void setCarDriverId(String carDriverId) {
        this.carDriverId = carDriverId == null ? null : carDriverId.trim();
    }

    public String getCarDriverName() {
        return carDriverName;
    }

    public void setCarDriverName(String carDriverName) {
        this.carDriverName = carDriverName == null ? null : carDriverName.trim();
    }

    public String getCarDriverTel() {
        return carDriverTel;
    }

    public void setCarDriverTel(String carDriverTel) {
        this.carDriverTel = carDriverTel == null ? null : carDriverTel.trim();
    }

    public Integer getCarLimits() {
        return carLimits;
    }

    public void setCarLimits(Integer carLimits) {
        this.carLimits = carLimits;
    }

    public String getCarDateSafe() {
        return carDateSafe;
    }

    public void setCarDateSafe(String carDateSafe) {
        this.carDateSafe = carDateSafe == null ? null : carDateSafe.trim();
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public Integer getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Integer carMileage) {
        this.carMileage = carMileage;
    }

    public BigDecimal getcOilMass() {
        return cOilMass;
    }

    public void setcOilMass(BigDecimal cOilMass) {
        this.cOilMass = cOilMass;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
}