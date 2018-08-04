package com.victor.controllers;

import java.util.Date;
import java.util.Hashtable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.exception.MaximumJobsApplied;
import com.victor.models.Job;
import com.victor.models.JobApplicant;
import com.victor.service.JobApplicantService;
import com.victor.service.JobService;

@RestController
@RequestMapping("/jobs")
public class JobController {
	
	@Autowired
	JobService jobService ;
	
	@RequestMapping("/all")
	public Hashtable<String, Job> getall(){
		return jobService.getAll();
	}
	
	@RequestMapping("{name}")
	public Job getJob(@PathVariable("id") String name) {
		return  jobService.getJob(name);
	}
	
	@PostMapping("/jobs")
	public Job addJob(String name) throws MaximumJobsApplied
	{
		return jobService.addJob("Coder", "Performimng Backend Coding", "Backend", "2018", "2019", 3);
		
	}
	@GetMapping
	public Job searchJob(@PathVariable("name") String name) {
		return jobService.searchJob(name);
	}

}
