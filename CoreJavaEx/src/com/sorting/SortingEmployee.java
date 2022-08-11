package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingEmployee  {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		Employee e1 = new Employee(101, "ram", 1000);
		Employee e2 = new Employee(105, "shyam", 10000);
		Employee e3 = new Employee(102, "aman", 600);
		Employee e4 = new Employee(111, "sonu", 1500);
		Employee e5 = new Employee(108, "rahul", 900);
		Employee e6 = new Employee(112, "sita", 1200);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);

		//Collections.sort(empList, new SortingEmployee());
		
		Collections.sort(empList);
		
		System.out.println(empList);
		
		
		
	}


	/*
	 * //sort by name
	 * 
	 * @Override public int compare(Employee e1, Employee e2) { // TODO
	 * Auto-generated method stub return e1.getSalary() < e2.getSalary() ? 1 :
	 * e1.getSalary() > e2.getSalary() ? -1 : 0 ; }
	 */
}
