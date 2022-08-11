package com.Interview.type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> arrObj = new ArrayList<String>();
		Collections.synchronizedList(arrObj);

		Set obj = new HashSet();

		int sum = 0;
		String storeString = "";
		obj.add("nitesh");
		obj.add("nitesh");
		arrObj.add("verma");
		System.out.println(obj);
		for (String s : arrObj) {

			// String arr[]=s.split(" ");

			// System.out.println(s.length());
			sum = sum + s.length();

			/*
			 * for(int i=0;i<arr.length;i++) {
			 * 
			 * 
			 * storeString =arr[i]; } System.out.println(storeString.length());
			 */ }

		System.out.println(sum);

	}

}
