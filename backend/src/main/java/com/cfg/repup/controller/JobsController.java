package com.cfg.repup.controller;

import com.cfg.repup.dao.JobDao;
import com.cfg.repup.dao.JobDaoImpl;
import com.cfg.repup.domain.Job;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Amine on 28/07/2017.
 */
@RestController
@RequestMapping("/jobs")
public class JobsController {

    private final JobDao jobDao;

    public JobsController(JobDaoImpl jobDaoImpl) {
        this.jobDao = jobDaoImpl;
    }

    @GetMapping("/{jobId}")
    public Job getJob(@PathVariable final int jobId) {
        return jobDao.getJob(jobId);
    }

    @GetMapping
    public List<Job> getJobs() {
        return jobDao.getJobs();
    }
}
