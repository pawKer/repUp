package com.cfg.repup.dao;

import com.cfg.repup.domain.Job;

import java.util.List;

public interface JobDao {

    Job getJob(int jobId);

    List<Job> getJobs();

    void createJob(Job newJob, int userId);

    void assignJob(int jobId, int userId);
}
