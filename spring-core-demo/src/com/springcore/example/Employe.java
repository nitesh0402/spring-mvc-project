package com.springcore.example;

public class Employe {

	private int empID;
	private String empName;
	private int empSall;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
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
	void Display(int empId,String empName,int empSall) 
	{
	this.empID=empId;
	this.empName=empName;
	this.empSall=empSall;
	
	System.out.println("Employe Id is "+empId);
	System.out.println("Employe name is "+empName);
	System.out.println("Employe Sallary "+empSall);
	
		
	}
	
	
	
	
}
