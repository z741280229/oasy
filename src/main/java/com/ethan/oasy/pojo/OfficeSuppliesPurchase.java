package com.ethan.oasy.pojo;

import java.math.BigDecimal;

public class OfficeSuppliesPurchase extends OfficeSupplies{
    private String osbId;

    private String osId;

    private String purchaserId;

    private String purchaserName;

    private String agreePurchaserName;

    private String agreePurchaserId;

    private Integer appPurchaseNum;

    private String applyDate;

    private Integer purchaseNum;

    private BigDecimal estimatedAmount;

    private BigDecimal useMoney;

    private String purchaseDate;

    private String inputerName;

    private String inputerId;

    private String inputDate;

    private Integer notInputNum;

    private Integer purchaseStatus;

    private Integer dataStatus;

    public String getOsbId() {
        return osbId;
    }

    public void setOsbId(String osbId) {
        this.osbId = osbId == null ? null : osbId.trim();
    }

    public String getOsId() {
        return osId;
    }

    public void setOsId(String osId) {
        this.osId = osId == null ? null : osId.trim();
    }

    public String getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(String purchaserId) {
        this.purchaserId = purchaserId == null ? null : purchaserId.trim();
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName == null ? null : purchaserName.trim();
    }

    public String getAgreePurchaserName() {
        return agreePurchaserName;
    }

    public void setAgreePurchaserName(String agreePurchaserName) {
        this.agreePurchaserName = agreePurchaserName == null ? null : agreePurchaserName.trim();
    }

    public String getAgreePurchaserId() {
        return agreePurchaserId;
    }

    public void setAgreePurchaserId(String agreePurchaserId) {
        this.agreePurchaserId = agreePurchaserId == null ? null : agreePurchaserId.trim();
    }

    public Integer getAppPurchaseNum() {
        return appPurchaseNum;
    }

    public void setAppPurchaseNum(Integer appPurchaseNum) {
        this.appPurchaseNum = appPurchaseNum;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    public BigDecimal getEstimatedAmount() {
        return estimatedAmount;
    }

    public void setEstimatedAmount(BigDecimal estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }

    public BigDecimal getUseMoney() {
        return useMoney;
    }

    public void setUseMoney(BigDecimal useMoney) {
        this.useMoney = useMoney;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate == null ? null : purchaseDate.trim();
    }

    public String getInputerName() {
        return inputerName;
    }

    public void setInputerName(String inputerName) {
        this.inputerName = inputerName == null ? null : inputerName.trim();
    }

    public String getInputerId() {
        return inputerId;
    }

    public void setInputerId(String inputerId) {
        this.inputerId = inputerId == null ? null : inputerId.trim();
    }

    public String getInputDate() {
        return inputDate;
    }

    public void setInputDate(String inputDate) {
        this.inputDate = inputDate == null ? null : inputDate.trim();
    }

    public Integer getNotInputNum() {
        return notInputNum;
    }

    public void setNotInputNum(Integer notInputNum) {
        this.notInputNum = notInputNum;
    }

    public Integer getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(Integer purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }
}