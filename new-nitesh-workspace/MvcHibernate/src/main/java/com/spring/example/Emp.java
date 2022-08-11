package com.spring.example;
	
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="Emp_tbl")
public class Emp {
    @Id
	private int empId;
	@Column
    private String empName;
	@Column
	private int empSallary;
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
	public int getEmpSallary() {
		return empSallary;
	}
	public void setEmpSallary(int empSallary) {
		this.empSallary = empSallary;
	}
	
	
}

	
	
	
	
	
	
	
	

