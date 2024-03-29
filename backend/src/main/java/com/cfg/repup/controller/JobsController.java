package com.cfg.repup.controller;

import com.cfg.repup.dao.JobDao;
import com.cfg.repup.dao.JobDaoImpl;
import com.cfg.repup.domain.Job;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
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
    public void addJob(
            @RequestBody Job job,
            @RequestHeader(value="userId") @NotNull final int userId) {
        LOGGER.info("Received post of {}", job.getJob_owner());
        jobDao.createJob(job, userId);

    }

    //TODO:like job
    @PostMapping("/{jobId}/like")
    public void likeJob(
            @PathVariable final int jobId,
            @RequestHeader(value="userId") @NotNull final int userId){

    }

    @PostMapping("/{jobId}/apply")
    public void applyForJob(
            @PathVariable final int jobId,
            @RequestHeader(value="userId") @NotNull final int userId) {
        jobDao.assignJob(jobId, userId);
    }

    //TODO:complete job
    @PostMapping("/{jobId}/complete")
    public void completeJob(
            @PathVariable final int jobId,
            @RequestHeader(value="userId") @NotNull final int userId){
        System.out.println("Success! " + Integer.toString(jobId));
    }

}
