package com.Interview.type;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employe {
	private int empId;
	private String empName;
	private int sall;
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
	public int getSall() {
		return sall;
	}
	public void setSall(int sall) {
		this.sall = sall;
	}
	
	
@Override
public int hashCode() {
	return Objects.hash(empId);
}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employe other = (Employe) obj;
		return empId == other.empId;
	}
public static void main(String[] args) {

	Employe em=new Employe();
	em.setEmpId(1122);
	em.setEmpName("nitesh");
	em.setSall(150000);

	Employe em1=new Employe();
	em1.setEmpId(1123);
	em1.setEmpName("yogesh");
	em1.setSall(1500000);
	
	Employe em2=new Employe();
	em2.setEmpId(1124);
	em2.setEmpName("dishu");
	em2.setSall(250000);
	
	Employe em3=new Employe();
	em3.setEmpId(1125);
	em3.setEmpName("chitransh");
	em3.setSall(350000);

	Employe em4=new Employe();
	em4.setEmpId(1126);
	em4.setEmpName("yashika");
	em4.setSall(450000);
	
	Set st=new  HashSet<Employe> ();	

	
	st.add(em);
	st.add(em1);
	st.add(em2);
	st.add(em3);
	st.add(em4);

	System.out.println(st);
	
}
@Override
public String toString() {
	return "Employe [empId=" + empId + ", empName=" + empName + ", sall=" + sall + "]";
}
	
	
}
