package com.bao;




import javax.persistence.*;


	
	
	
	@Entity

	@Table(name="employee")

	public class Emp {

	@Id	

	private int empid;

	@Column

	private String empname;

	@Column

	private String job;

	public int getEmpid() {

		return empid;

	}

	public void setEmpid(int empid) {

		this.empid = empid;

	}

	public String getEmpname() {

		return empname;

	}

	public void setEmpname(String empname) {

		this.empname = empname;

	}

	public String getJob() {

		return job;

	}

	public void setJob(String job) {

		this.job = job;

	}






	
}
