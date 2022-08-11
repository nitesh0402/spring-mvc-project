package com.employedatail;

public class EmployePojo {

	private int empId;
	private String empName;
	private int empSall;
	private String empAdd;
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
	public String getEmpAdd() {
		return empAdd;
	}
	@Override
	public String toString() {
		return "EmployePojo [empId=" + empId + ", empName=" + empName + ", empSall=" + empSall + ", empAdd=" + empAdd
				+ "]";
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	
	
	
	
	
}
