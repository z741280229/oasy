package com.ethan.oasy.pojo;

import java.util.List;

public class Job {
    private String jobId;

    private String jobLeader;

    private String jobLeaderName;

    private String jobTitle;

    private Integer jobGrade;

    private String jobGradeName;

    private Integer jobType;

    private String jobTypeName;

    private String jobKeyWord;

    private Integer schedule;

    private String scheduleName;

    private Integer jobAroundTime;

    private String jobStartTime;

    private String jobEndTime;

    private String jobFileNumberName;

    private String jobFileRealName;

    private String jobFileType;

    private Byte dataStatus;

    private List<Staff> staffs;

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobLeader() {
        return jobLeader;
    }

    public void setJobLeader(String jobLeader) {
        this.jobLeader = jobLeader;
    }

    public String getJobLeaderName() {
        return jobLeaderName;
    }

    public void setJobLeaderName(String jobLeaderName) {
        this.jobLeaderName = jobLeaderName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Integer getJobGrade() {
        return jobGrade;
    }

    public void setJobGrade(Integer jobGrade) {
        this.jobGrade = jobGrade;
    }

    public String getJobGradeName() {
        return jobGradeName;
    }

    public void setJobGradeName(String jobGradeName) {
        this.jobGradeName = jobGradeName;
    }

    public Integer getJobType() {
        return jobType;
    }

    public void setJobType(Integer jobType) {
        this.jobType = jobType;
    }

    public String getJobTypeName() {
        return jobTypeName;
    }

    public void setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
    }

    public String getJobKeyWord() {
        return jobKeyWord;
    }

    public void setJobKeyWord(String jobKeyWord) {
        this.jobKeyWord = jobKeyWord;
    }

    public Integer getSchedule() {
        return schedule;
    }

    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public Integer getJobAroundTime() {
        return jobAroundTime;
    }

    public void setJobAroundTime(Integer jobAroundTime) {
        this.jobAroundTime = jobAroundTime;
    }

    public String getJobStartTime() {
        return jobStartTime;
    }

    public void setJobStartTime(String jobStartTime) {
        this.jobStartTime = jobStartTime;
    }

    public String getJobEndTime() {
        return jobEndTime;
    }

    public void setJobEndTime(String jobEndTime) {
        this.jobEndTime = jobEndTime;
    }

    public String getJobFileNumberName() {
        return jobFileNumberName;
    }

    public void setJobFileNumberName(String jobFileNumberName) {
        this.jobFileNumberName = jobFileNumberName;
    }

    public String getJobFileRealName() {
        return jobFileRealName;
    }

    public void setJobFileRealName(String jobFileRealName) {
        this.jobFileRealName = jobFileRealName;
    }

    public Byte getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(Byte dataStatus) {
        this.dataStatus = dataStatus;
    }

    public List<Staff> getStaffs() {
        return staffs;
    }

    public void setStaffs(List<Staff> staffs) {
        this.staffs = staffs;
    }

    public String getJobFileType() {
        return jobFileType;
    }

    public void setJobFileType(String jobFileType) {
        this.jobFileType = jobFileType;
    }


}