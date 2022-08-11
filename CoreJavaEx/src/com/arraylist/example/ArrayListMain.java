package com.arraylist.example;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {

		ArrayList<Student> al = new ArrayList<Student>();

		Student s = new Student();

		s.setNum(123);
		s.setName("nitesh");
		s.setSname("verma");
		s.setRno(123);
		al.add(s);

		/*
		 * for (Object o:a1) { System.out.println(o); }
		 */
		System.out.println(al);

	}
}
