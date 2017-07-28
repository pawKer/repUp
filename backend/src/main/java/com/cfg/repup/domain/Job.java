package com.cfg.repup.domain;

public class Job {

    private int job_id;
    private String title;
    private String description;
    private String remuneration;
    private int job_owner;

    public Job() {

    }

    public Job(int job_id, String title, String description, String remuneration, int job_owner) {
        this.job_id = job_id;
        this.title = title;
        this.description = description;
        this.remuneration = remuneration;
        this.job_owner = job_owner;
    }


    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
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
}
