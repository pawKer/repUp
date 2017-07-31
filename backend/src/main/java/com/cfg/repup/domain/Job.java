package com.cfg.repup.domain;

import java.util.Date;
import java.util.List;

public class Job {

    private String title;
    private String description;
    private Date datePosted;
    private String remuneration;
    private int job_owner;
    private int likes;
    private int expected_duration;
    private List category;
    private List charity;

    private Job(){};

    public Job(String title, String description, Date datePosted, String remuneration, int job_owner, int likes, int expected_duration) {
        this.title = title;
        this.description = description;
        this.datePosted = datePosted;
        this.remuneration = remuneration;
        this.job_owner = job_owner;
        this.likes = likes;
        this.expected_duration = expected_duration;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(String remuneration) {
        this.remuneration = remuneration;
    }

    public int getJob_owner() {
        return job_owner;
    }

    public void setJob_owner(int job_owner) {
        this.job_owner = job_owner;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public int getlikes() {
        return likes;
    }

    public void setlikes(int likes) {
        this.likes = likes;
    }

    public int getExpected_duration() {
        return expected_duration;
    }

    public void setExpected_duration(int expected_duration) {
        this.expected_duration = expected_duration;
    }
}
