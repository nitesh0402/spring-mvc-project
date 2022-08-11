package com.map.example;

public class Student {

	
	
	
	String name;
	
	String stnd;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStnd() {
		return stnd;
	}

	public void setStnd(String stnd) {
		this.stnd = stnd;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", stnd=" + stnd + "]";
	}
	
}
