package com.cfg.repup.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cfg.repup.dao.JobAssignmentDao;
import com.cfg.repup.domain.Employee;
import com.cfg.repup.domain.JobAssignment;

@Controller
@RequestMapping("/generic")
public class HBController {
	
	
	private final JobAssignmentDao jobAs;
	
	
	public HBController(JobAssignmentDao jobAs) {
		super();
		this.jobAs = jobAs;
	}


	@GetMapping
	public String getWorker(Model model)
	{
		List<JobAssignment> jobList = jobAs.getData();
		List<Employee> jobDoers = new ArrayList<Employee>();
		for (JobAssignment job : jobList)
		{
			jobDoers.add(new Employee(jobAs.getFactotum(job.getFactotum()), jobAs.getJobTitle(job.getJob_id())));
		}
		
		
		model.addAttribute("jobs",jobDoers);
		
		return "generic";
	}

}
