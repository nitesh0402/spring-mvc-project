package com.collectionExample;

import java.util.HashMap;

public class StringEc {
	public static void main(String[] args) {
		String s = "nnggss";
	
		char chArray[] = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();

		for (char ch : chArray) {

			if (hm.containsKey(ch)) {

				hm.put(ch, hm.get(ch)+1);

			} else {

		hm.put(ch, 1);	}
			
			
			
		}
		System.out.println(hm);

		// p-2 , a-2

		// char c= s.charAt(2);
		int i = s.indexOf('I');

		int j = s.lastIndexOf("I");

		//System.out.println(i);
		//System.out.println(j);
		// System.out.println(s.length());
		// String s1=s.concat("verma");
//String s2=s1.concat("Good");
// String s1=s.concat("Nitesh");

//System.out.println(s.equalsIgnoreCase("nitesh"));

//System.out.println(s.toLowerCase());
//System.out.println(s.toUpperCase());
//s=s.trim();

//System.out.println(s);
//System.out.println(s.length());

		// s = s.substring(2, 3);
		// System.out.println(s);

		// i/p String date= 2025-08-30
		// o/p 30-AUG-2025

	}
}
