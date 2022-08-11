package com.crudExample;

public class Employe {

	
	private int empId;
	private String empName;
	private int empSall;
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
	public int getEmpSall() {
		return empSall;
	}
	public void setEmpSall(int empSall) {
		this.empSall = empSall;
	}
	@Override
	public String toString() {
		return "Employe [empId=" + empId + ", empName=" + empName + ", empSall=" + empSall + "]";
	}
	
	
}
