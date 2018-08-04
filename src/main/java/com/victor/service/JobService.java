package com.victor.service;

import java.util.Date;
import java.util.Hashtable;

import com.victor.exception.MaximumJobsApplied;
import com.victor.models.Job;
import com.victor.models.JobApplicant;

public class JobService {
	private static final Date Date = null;
	Hashtable<String, Job> jobs = new Hashtable<String,Job>();
	
	public void Job() {
		
		Job job = new Job();
		
		job.setName("Data Engineer");
		job.setDescription("Ui engineer");
		job.setEducation_level("Graduate");
		job.setInterview_date(Date);
		job.setStatus("Available");
		job.setType("Full Time");
		job.setYears_of_experience(3);
		jobs.put("Tom", job);
	}
	
	public Job getJob(String name) {
		if(jobs.containsKey(name)) {
			return jobs.get(name);
		}
		return null;
	}
	
	public Hashtable<String, Job> getAll(){
		return jobs;
	}
	
	public com.victor.models.Job deleteJob(String name) {
		if(jobs.containsKey(name)) {
			return jobs.remove(name);
		}
		return null;
	}
	
	public void updateJob(String name, String desc, String type, String intervieWStart, String intervieWend, int experience) {
		if (jobs.containsKey(name)) {
			JobService(name, desc, type, intervieWStart, intervieWend,experience);
		}
	}

	private com.victor.models.Job JobService(String name, String desc, String type, String intervieWStart, String intervieWend,
			int experience) {
Job job = new Job();
		
		job.setName("Data Engineer");
		job.setDescription("Ui engineer");
		job.setEducation_level("Graduate");
		job.setInterview_date(Date);
		job.setStatus("Available");
		job.setType("Full Time");
		job.setYears_of_experience(3);
		return jobs.put("Tom", job);
		
	}

	private JobService(String name, String desc, String type, String intervieWStart, String intervieWend,
			int experience) {
		Job job = new Job();
		job.setName("Data Engineer");
		job.setDescription("Ui engineer");
		job.setEducation_level("Graduate");
		job.setInterview_date(Date);
		job.setStatus("Available");
		job.setType("Full Time");
		job.setYears_of_experience(3);
		jobs.put("Tom", job);
		
	}

	public com.victor.models.Job addJob(String name, String desc, String type, String intervieWStart, String intervieWend,
			int experience) throws MaximumJobsApplied {
		if(jobs.size() > 3) {
			throw new MaximumJobsApplied("You have applied maximum number of jobs today");
		}
		return JobService(name, desc, type, intervieWStart, intervieWend,experience);
		
	}
	
	public com.victor.models.Job searchJob(String name) {
		if(jobs.containsKey(name)) {
			return jobs.get(name);
		}
		return null;
	}
}
