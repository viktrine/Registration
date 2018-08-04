package com.victor.service;

import java.util.Hashtable;

import org.springframework.stereotype.Service;

import com.victor.exception.JobhasMaximumParticipantsException;
import com.victor.models.JobApplicant;

@Service
public class JobApplicantService {
	Hashtable<String, JobApplicant> applicants = new Hashtable<String,JobApplicant>();
	
	public JobApplicantService() {
		JobApplicant applicant  = new JobApplicant();
		applicant.setFirst_name("Tom");
		applicant.setLast_name("Kamau");
		applicant.setPhone("0712345555");
		applicant.setEmail("tom@gmail.com");
		applicant.setEducation_level("Graduate");
		applicant.setYears_of_experience(3);
		applicants.put("1", applicant);
		
		applicant = new JobApplicant();
		applicant.setFirst_name("Mary");
		applicant.setLast_name("Kajwang");
		applicant.setPhone("0773888288");
		applicant.setEmail("mary@gmail.com");
		applicant.setEducation_level("Post Graduate");
		applicant.setYears_of_experience(3);
		applicants.put("2", applicant);
		
	}
	
	public void JobApplicantService(String id, String fname, String lname, String phone, String email, String education, int experience) {
		JobApplicant applicant  = new JobApplicant();
		applicant.setFirst_name(fname);
		applicant.setLast_name(lname);
		applicant.setPhone(phone);
		applicant.setEmail(email);
		applicant.setEducation_level(education);
		applicant.setYears_of_experience(experience);
		applicants.put(String.valueOf(applicants.get(id)), applicant);
	}
	
	public void JobApplicantService(String fname, String lname, String phone, String email, String education, int experience) {
		JobApplicant applicant  = new JobApplicant();
		applicant.setFirst_name(fname);
		applicant.setLast_name(lname);
		applicant.setPhone(phone);
		applicant.setEmail(email);
		applicant.setEducation_level(education);
		applicant.setYears_of_experience(experience);
		applicants.put(String.valueOf(applicants.size() + 1), applicant);
	}
	
	public JobApplicant getJobApplicant(String id) {
		if(applicants.containsKey(id)) {
			return applicants.get(id);
		}
		return null;
	}
	
	public Hashtable<String, JobApplicant> getAll(){
		return applicants;
	}
	
	public JobApplicant deleteJobApplicant(String id) {
		if(applicants.containsKey(id)) {
			return applicants.remove(id);
		}
		return null;
	}
	
	public void updateJobApplicant(String id, String fname, String lname, String phone, String email, String education, int experience) {
		if (applicants.containsKey(id)) {
			JobApplicantService(id, fname,lname, phone, email,education,experience);
		}
	}
	
	public void addJobApplicant(String fname, String lname, String phone, String email, String education, int experience) throws JobhasMaximumParticipantsException {
		
		if(applicants.size() > 20) {
			throw new JobhasMaximumParticipantsException("You have applied maximum number of interviews");
		}
		JobApplicantService(fname,lname, phone, email,education,experience);
		
		
	}
}
