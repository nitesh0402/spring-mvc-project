package com.map.example;

public class Employe {

	private int empId;
	private String empName;
	private int  salay;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalay() {
		return salay;
	}
	public void setSalay(int salay) {
		this.salay = salay;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", salay=" + salay + "]";
	}
	
	
}
