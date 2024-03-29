package com.cfg.repup.models;

public class Tracking {

    private String userName;
    private String profilePhoto;
    private boolean complete;
    private int rating;
    private String jobName;

    public Tracking(String userName, String profilePhoto, boolean complete, int rating, String jobName) {
        this.userName = userName;
        this.profilePhoto = profilePhoto;
        this.complete = complete;
        this.rating = rating;
        this.jobName = jobName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getJobName(){ return jobName;}

    public void setJobName(String jobName){ this.jobName=jobName;}




}
