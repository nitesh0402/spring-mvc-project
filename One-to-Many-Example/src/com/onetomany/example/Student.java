package com.onetomany.example;

import java.util.List;
import java.util.Set;

public class Student {

	private int stuRoll;
	private String name;

	List<Course> course;

	public int getStuRoll() {
		return stuRoll;
	}

	public void setStuRoll(int stuRoll) {
		this.stuRoll = stuRoll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Course> getCourse() {
		return course;
	}

	public void setCourse(List<Course> course) {
		this.course = course;
	}

	
	

}
