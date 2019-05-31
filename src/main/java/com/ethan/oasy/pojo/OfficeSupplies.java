package com.ethan.oasy.pojo;

import java.math.BigDecimal;

public class OfficeSupplies {
    private String osId;

    private String osName;

    private String osOrdNum;

    private Integer osCategory;

    private String osSpecification;

    private Integer osUnit;

    private BigDecimal osPrice;

    private Integer osTotal;

    private Integer osNotInput;

    private String osStatisticalDate;

    private Integer dataStatus;

    public String getOsId() {
        return osId;
    }

    public void setOsId(String osId) {
        this.osId = osId == null ? null : osId.trim();
    }

    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName == null ? null : osName.trim();
    }

    public String getOsOrdNum() {
        return osOrdNum;
    }

    public void setOsOrdNum(String osOrdNum) {
        this.osOrdNum = osOrdNum == null ? null : osOrdNum.trim();
    }

    public Integer getOsCategory() {
        return osCategory;
    }

    public void setOsCategory(Integer osCategory) {
        this.osCategory = osCategory;
    }

    public String getOsSpecification() {
        return osSpecification;
    }

    public void setOsSpecification(String osSpecification) {
        this.osSpecification = osSpecification == null ? null : osSpecification.trim();
    }

    public Integer getOsUnit() {
        return osUnit;
    }

    public void setOsUnit(Integer osUnit) {
        this.osUnit = osUnit;
    }

    public BigDecimal getOsPrice() {
        return osPrice;
    }

    public void setOsPrice(BigDecimal osPrice) {
        this.osPrice = osPrice;
    }

    public Integer getOsTotal() {
        return osTotal;
    }

    public void setOsTotal(Integer osTotal) {
        this.osTotal = osTotal;
    }

    public Integer getOsNotInput() {
        return osNotInput;
    }

    public void setOsNotInput(Integer osNotInput) {
        this.osNotInput = osNotInput;
    }

    public String getOsStatisticalDate() {
        return osStatisticalDate;
    }

    public void setOsStatisticalDate(String osStatisticalDate) {
        this.osStatisticalDate = osStatisticalDate == null ? null : osStatisticalDate.trim();
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
}