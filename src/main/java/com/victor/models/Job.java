package com.victor.models;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)

public class Job {
	private String name;
	private String description;
	private String type;
	private int years_of_experience;
	private String education_level;
	private String status;
	private Date interview_date;
	
	public Job() {
		super();
	}
	
	public Job(String name, String description, String type, int years_of_experience, String education_level,
			String status, Date interview_date) {
		super();
		this.name = name;
		this.description = description;
		this.type = type;
		this.years_of_experience = years_of_experience;
		this.education_level = education_level;
		this.status = status;
		this.interview_date = interview_date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getYears_of_experience() {
		return years_of_experience;
	}
	public void setYears_of_experience(int years_of_experience) {
		this.years_of_experience = years_of_experience;
	}
	public String getEducation_level() {
		return education_level;
	}
	public void setEducation_level(String education_level) {
		this.education_level = education_level;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getInterview_date() {
		return interview_date;
	}
	public void setInterview_date(Date l) {
		this.interview_date = l;
	}
}
