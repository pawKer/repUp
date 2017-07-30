package com.cfg.repup.domain;

public class UserRating {

    private String userName;
    private float userRating;
    private int numberOfJobs;

    public UserRating(String userName, float userRating, int numberOfJobs) {
        this.userName = userName;
        this.userRating = userRating;
        this.numberOfJobs = numberOfJobs;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public float getUserRating() {
        return userRating;
    }

    public void setUserRating(float userRating) {
        this.userRating = userRating;
    }

    public int getNumberOfJobs() {
        return numberOfJobs;
    }

    public void setNumberOfJobs(int numberOfJobs) {
        this.numberOfJobs = numberOfJobs;
    }

}
