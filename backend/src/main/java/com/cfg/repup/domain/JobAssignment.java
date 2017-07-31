package com.cfg.repup.domain;

/**
 * Created by Amine on 28/07/2017.
 */
public class JobAssignment {

    private int job_id;
    private int jobOwner;
    private int factotum;
    private boolean complete;
    private int rating;

    public JobAssignment(int job_id, int factotum, boolean complete, int rating) {
        this.job_id = job_id;
        this.factotum = factotum;
        this.complete = complete;
        this.rating = rating;
    }

    public int getJob_id() {
        return job_id;
    }

    public void setJob_id(int job_id) {
        this.job_id = job_id;
    }

    public int getFactotum() {
        return factotum;
    }

    public void setFactotum(int factotum) {
        this.factotum = factotum;
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
}
