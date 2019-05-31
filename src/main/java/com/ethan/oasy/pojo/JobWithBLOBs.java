package com.ethan.oasy.pojo;

public class JobWithBLOBs extends Job {
    private String jobContent;

    private String jobFile;

    private String jobMenber;

    public String getJobContent() {
        return jobContent;
    }

    public void setJobContent(String jobContent) {
        this.jobContent = jobContent == null ? null : jobContent.trim();
    }

    public String getJobFile() {
        return jobFile;
    }

    public void setJobFile(String jobFile) {
        this.jobFile = jobFile == null ? null : jobFile.trim();
    }

    public String getJobMenber() {
        return jobMenber;
    }

    public void setJobMenber(String jobMenber) {
        this.jobMenber = jobMenber == null ? null : jobMenber.trim();
    }
}