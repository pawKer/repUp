package com.cfg.repup.controller;

import com.cfg.repup.domain.Job;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Amine on 28/07/2017.
 */
@RestController
@RequestMapping("/jobs")
public class JobsController {

    @RequestMapping(method = RequestMethod.GET)
    public Job getJobs() {
        return null;
    }

    @GetMapping("/{username}")
    public Job getJob(@PathVariable final String userName) {
        return null;
    }

    // @RequestMapping(method = RequestMethod.POST)
}
