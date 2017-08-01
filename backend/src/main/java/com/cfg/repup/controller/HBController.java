package com.cfg.repup.controller;

import com.cfg.repup.dao.JobAssignmentDao;
import com.cfg.repup.dao.JobDao;
import com.cfg.repup.dao.UserDao;
import com.cfg.repup.domain.JobAssignment;
import com.cfg.repup.domain.UserRating;
import com.cfg.repup.models.Tracking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HBController {

	@Autowired
	private UserDao userDao;

	@Autowired
	private JobAssignmentDao jobAssignmentDao;

	@Autowired
	private JobDao jobDao;

	public HBController() {
	}


	@RequestMapping("/applications")
	public String getApplications(Model model){

		//TODO: returns applications that have been submitted

		return "applications";
	}



	@RequestMapping("/tracking")
	public String getTracking(Model model)
	{
		List<JobAssignment> jobList = jobAssignmentDao.getData();

		List<Tracking> trackingList = new ArrayList<Tracking>();
		for (JobAssignment job : jobList)
		{
			Tracking trackingObject = new Tracking(
					userDao.getUser(job.getFactotum()).getUser_name(),
					userDao.getUserProfilePhoto(job.getFactotum()),
					jobAssignmentDao.getJobComplete(job.getJob_id(), job.getFactotum()),
					jobAssignmentDao.getJobRating(job.getJob_id(), job.getFactotum()),
					jobDao.getJob(job.getJob_id()).getTitle());

			trackingList.add(trackingObject);
			System.out.println(userDao.getUserProfilePhoto(job.getFactotum()));
		}


		model.addAttribute("jobs",trackingList);

		return "tracking";
	}

	@RequestMapping("/leaderboard")
	public String getRankings(Model model)
	{
		List<UserRating> userList = userDao.getHighestRated();

		model.addAttribute("users",userList);

		return "leaderboard";
	}



}
