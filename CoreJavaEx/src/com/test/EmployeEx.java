package com.test;

public class EmployeEx {

	int id=101;
	String  name ="nitesh";
	int sallary=2500;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getSallary() {
		return sallary;
	
	
	}
	
	@Override
	public String toString() {
		return "EmployeEx [id=" + id + ", name=" + name + ", sallary=" + sallary + "]";
	}
	public static void main(String[] args) {
	
	EmployeEx obj=new EmployeEx();
	
	obj.getId();
	obj.getName();
	obj.getSallary();
	
		System.out.println(obj);
	}
	
}
