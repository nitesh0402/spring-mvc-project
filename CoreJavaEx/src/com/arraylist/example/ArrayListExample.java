package com.arraylist.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class ArrayListExample {

	public static void main(String[] args) {


		ArrayList<Employee> al=new ArrayList<Employee>();
		
		
		
		Employee e1=new Employee();
	
	e1.setEmpId(10);
	e1.setEname("yogesh");
	e1.setSalary("1000");
		
		
		
		Employee e2=new Employee();
		e2.setEmpId(120);
		e2.setEname("nitesh");
		e2.setSalary("20000");
		
		
		al.add(e1);
		al.add(e2);
		
		
		System.out.println(al.toString());
		
		
		
		
		
		
		
	}

}
