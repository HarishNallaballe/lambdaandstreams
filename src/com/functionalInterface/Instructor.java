package com.functionalInterface;

import java.util.List;

public class Instructor {
	
	String name;
	Integer yearsOfExp;
	String title;
	String gender;
	boolean onlineCourses;
	List<String> courses;
	
	public Instructor(String name, Integer yearsOfExp, String title, String gender, boolean onlineCourses,
			List<String> courses) {
		super();
		this.name = name;
		this.yearsOfExp = yearsOfExp;
		this.title = title;
		this.gender = gender;
		this.onlineCourses = onlineCourses;
		this.courses = courses;
	}
	
	public Instructor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYearsOfExp() {
		return yearsOfExp;
	}
	public void setYearsOfExp(Integer yearsOfExp) {
		this.yearsOfExp = yearsOfExp;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public boolean isOnlineCourses() {
		return onlineCourses;
	}
	public void setOnlineCourses(boolean onlineCourses) {
		this.onlineCourses = onlineCourses;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Instructor [name=" + name + ", yearsOfExp=" + yearsOfExp + ", title=" + title + ", gender=" + gender
				+ ", onlineCourses=" + onlineCourses + ", courses=" + courses + "]";
	}

}
