package com.victor.controllers;

import java.util.Hashtable;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.victor.models.JobApplicant;
import com.victor.service.JobApplicantService;

@RestController
@RequestMapping("/jobapplicants")
public class JobApplicantController {
	
	@Autowired
	JobApplicantService applicantService;
	
	@RequestMapping("/all")
	public Hashtable<String, JobApplicant> getall(){
		return applicantService.getAll();
	}
	
	@RequestMapping("{id}")
	public JobApplicant getJobApplicant(@PathVariable("id") String id) {
		return  applicantService.getJobApplicant(id);
	}
}
