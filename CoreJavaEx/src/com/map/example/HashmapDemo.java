package com.map.example;

import java.util.HashMap;

public class HashmapDemo {

	public static void main(String[] args) {

		HashMap<Integer, Student> hm = new HashMap<>();

		Student s1 = new Student();
		s1.setName("yoge");
		s1.setStnd("2nd");

		Student s2 = new Student();
		s2.setName("nite");
		s2.setStnd("4nd");

		Student s3 = new Student();
		s3.setName("yashu");
		s3.setStnd("5nd");

		hm.put(101, s1);

		hm.put(1001, s2);

		hm.put(1005, s3);

	
	System.out.println(hm.get(101));
	}

}
