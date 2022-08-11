package com.arraylist.example;

public class Employe {

	@Override
	public String toString() {
		return "Employe [cno=" + cno + ", id=" + id + ", empName=" + empName + ", sall=" + sall + ", cName=" + cName
				+ "]";
	}
	private int cno;
	private int id;
	private String  empName;
	private int sall;
	private String cName;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSall() {
		return sall;
	}
	public void setSall(int sall) {
		this.sall = sall;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	
}
