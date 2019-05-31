package com.ethan.oasy.pojo;

public class ConferenceWithBLOBs extends Conference {
    private String conRecord;

    private String conResource;

    public String getConRecord() {
        return conRecord;
    }

    public void setConRecord(String conRecord) {
        this.conRecord = conRecord == null ? null : conRecord.trim();
    }

    public String getConResource() {
        return conResource;
    }

    public void setConResource(String conResource) {
        this.conResource = conResource == null ? null : conResource.trim();
    }
}