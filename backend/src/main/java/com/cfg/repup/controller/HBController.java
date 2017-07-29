package com.cfg.repup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cfg.repup.dao.JobAssignmentDao;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/generic")
//public class HBController {
//
//
//	private final JobAssignmentDao jobA;
//
//
//	public HBController(JobAssignmentDao jobA) {
//		super();
//		this.jobA = jobA;
//	}
//
//
//	@GetMapping
//	public String getWorker(Model model)
//	{
//
//		model.addAttribute("title","VALUE");
//
//		return "generic";
//	}
//
//}
