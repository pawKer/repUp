package com.cfg.repup.dao;

import java.util.List;

import com.cfg.repup.domain.JobAssignment;

public interface JobAssignmentDao {

    List<JobAssignment> getData();
    String getUsername(int id);
    String getJobTitle(int id);
    boolean getJobComplete(int id);
    int getJobRating(int id);
}
