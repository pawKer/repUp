package com.cfg.repup.controller;

import com.cfg.repup.dao.JobDao;
import com.cfg.repup.dao.JobDaoImpl;
import com.cfg.repup.domain.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Amine on 28/07/2017.
 */
@RestController
@RequestMapping("/jobs")
public class JobsController {

    private final JobDao jobDao;
    private static final Logger LOGGER = LoggerFactory.getLogger(JobsController.class);

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

    @PostMapping
    public void addJob(@RequestBody Job job) {
        LOGGER.info("Received post of {}", job.getJob_owner());
        jobDao.createJob(job);
    }
}
