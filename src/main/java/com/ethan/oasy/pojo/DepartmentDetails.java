package com.ethan.oasy.pojo;


/**
 * @program: oasy
 * @description: 部门详情
 * @author: sam
 * @create: 2019-04-01 22:17
 */
public class DepartmentDetails {

    private String departId;

    private String departNum;

    private String departName;

    private String parentId;

    private String parentName;

    private String createTime;

    private Integer dapartTypeId;

    private String dapartType;

    private String departDuty;

    public String getDepartId() {
        return departId;
    }

    public void setDepartId(String departId) {
        this.departId = departId;
    }

    public String getDepartNum() {
        return departNum;
    }

    public void setDepartNum(String departNum) {
        this.departNum = departNum;
    }

    public String getDepartName() {
        return departName;
    }

    public void setDepartName(String departName) {
        this.departName = departName;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getDapartTypeId() {
        return dapartTypeId;
    }

    public void setDapartTypeId(Integer dapartTypeId) {
        this.dapartTypeId = dapartTypeId;
    }

    public String getDapartType() {
        return dapartType;
    }

    public void setDapartType(String dapartType) {
        this.dapartType = dapartType;
    }

    public String getDepartDuty() {
        return departDuty;
    }

    public void setDepartDuty(String departDuty) {
        this.departDuty = departDuty;
    }

    @Override
    public String toString() {
        return "DepartmentDetails{" +
                "departId='" + departId + '\'' +
                ", departNum='" + departNum + '\'' +
                ", departName='" + departName + '\'' +
                ", parentId='" + parentId + '\'' +
                ", parentName='" + parentName + '\'' +
                ", createTime='" + createTime + '\'' +
                ", dapartTypeId=" + dapartTypeId +
                ", dapartType='" + dapartType + '\'' +
                ", departDuty='" + departDuty + '\'' +
                '}';
    }
}
