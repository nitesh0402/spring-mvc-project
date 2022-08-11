package com.employeshorting;

public class Employe {

	int id;
	String name;
	String dpt;
	int sallary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	public int getSallary() {
		return sallary;
	}
	public void setSallary(int sallary) {
		this.sallary = sallary;
	}
	@Override
	public String toString() {
		return "Employe [id=" + id + ", name=" + name + ", dpt=" + dpt + ", sallary=" + sallary + "]";
	}
	
	
	
	
}
