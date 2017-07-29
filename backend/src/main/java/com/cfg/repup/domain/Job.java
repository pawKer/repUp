package com.cfg.repup.domain;

import java.util.Date;

public class Job {

    private String title;
    private String description;
    private Date datePosted;
    private String remuneration;
    private int job_owner;
    private int number_of_pending_applications;
    private int expected_duration;

    private Job(){};

    public Job(String title, String description, Date datePosted, String remuneration, int job_owner, int number_of_pending_applications, int expected_duration) {
        this.title = title;
        this.description = description;
        this.datePosted = datePosted;
        this.remuneration = remuneration;
        this.job_owner = job_owner;
        this.number_of_pending_applications = number_of_pending_applications;
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

    public int getNumber_of_pending_applications() {
        return number_of_pending_applications;
    }

    public void setNumber_of_pending_applications(int number_of_pending_applications) {
        this.number_of_pending_applications = number_of_pending_applications;
    }

    public int getExpected_duration() {
        return expected_duration;
    }

    public void setExpected_duration(int expected_duration) {
        this.expected_duration = expected_duration;
    }
}
