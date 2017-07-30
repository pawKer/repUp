package com.cfg.repup.dao;

import java.util.List;

import com.cfg.repup.domain.Job;
import com.cfg.repup.domain.JobAssignment;

public interface JobAssignmentDao {

    List<JobAssignment> getData();
    String getFactotum(Integer id);
    String getJobTitle(Integer id);
}
