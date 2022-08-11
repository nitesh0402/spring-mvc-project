package com.example;

public class Student {

	String name;
	int rollnum=2;

	public Student(String name, int rollnum) {
		super();
		this.name = name;
		this.rollnum = rollnum;
	}

	
	public static void main(String[] args) {
		int rollnum=1;
		
	System.out.println(rollnum);
		Student s1=new Student("durga",101);
		Student s2=new Student("ravi",102);
		Student s3=new Student("durga",101);
		
		Student s4=s1;
		
		
		
		//System.out.println(s1.equals(s2));
		
		
		System.out.println(s1.toString().equals(s3.toString()));
		
		
		
	}
	
}
