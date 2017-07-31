package com.cfg.repup.dao;

import java.util.List;

import com.cfg.repup.domain.JobAssignment;

public interface JobAssignmentDao {

    List<JobAssignment> getData();
    String getUsername(int id);
    String getJobTitle(int id);
    boolean getJobComplete(int job_id, int user_id);
    int getJobRating(int job_id, int user_id);
}
