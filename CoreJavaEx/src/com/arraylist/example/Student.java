package com.arraylist.example;

public class Student {

	private int num;
	private String name;
	private String sname;
	private int rno;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "ArrayListEx [num=" + num + ", name=" + name + ", sname=" + sname + ", rno=" + rno + "]";
	}
	
}
