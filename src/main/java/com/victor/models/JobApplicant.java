package com.victor.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class JobApplicant {
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone;
	private String education_level;
	private int years_of_experience;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public JobApplicant() {
		super();
	}
	public JobApplicant(String first_name, String last_name, String email, String phone, String education_level,
			int years_of_experience) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone = phone;
		this.education_level = education_level;
		this.years_of_experience = years_of_experience;
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEducation_level() {
		return education_level;
	}
	public void setEducation_level(String education_level) {
		this.education_level = education_level;
	}
	public int getYears_of_experience() {
		return years_of_experience;
	}
	public void setYears_of_experience(int years_of_experience) {
		this.years_of_experience = years_of_experience;
	}
}
