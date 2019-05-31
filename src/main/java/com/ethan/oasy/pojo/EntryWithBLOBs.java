package com.ethan.oasy.pojo;

public class EntryWithBLOBs extends Entry {
    private String personalProfile;

    private String enOpinion;

    public String getPersonalProfile() {
        return personalProfile;
    }

    public void setPersonalProfile(String personalProfile) {
        this.personalProfile = personalProfile == null ? null : personalProfile.trim();
    }

    public String getEnOpinion() {
        return enOpinion;
    }

    public void setEnOpinion(String enOpinion) {
        this.enOpinion = enOpinion == null ? null : enOpinion.trim();
    }
}