package com.ethan.oasy.pojo;

public class Catalog {
    private Integer catId;

    private Integer parentId;

    private String catalogName;

    private String catalogUrl;

    private Integer isShow;

    private Integer distinguish;

    private Integer dataStatus;

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName == null ? null : catalogName.trim();
    }

    public String getCatalogUrl() {
        return catalogUrl;
    }

    public void setCatalogUrl(String catalogUrl) {
        this.catalogUrl = catalogUrl == null ? null : catalogUrl.trim();
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getDistinguish() {
        return distinguish;
    }

    public void setDistinguish(Integer distinguish) {
        this.distinguish = distinguish;
    }

    public Integer getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Integer dataStatus) {
        this.dataStatus = dataStatus;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "catId=" + catId +
                ", parentId=" + parentId +
                ", catalogName='" + catalogName + '\'' +
                ", catalogUrl='" + catalogUrl + '\'' +
                ", isShow=" + isShow +
                ", distinguish=" + distinguish +
                ", dataStatus=" + dataStatus +
                '}';
    }
}