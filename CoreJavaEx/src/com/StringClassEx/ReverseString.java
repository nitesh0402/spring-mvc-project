package com.StringClassEx;

import java.util.HashSet;

public class ReverseString {

	public static void main(String[] args) {

		String name = "pap, sdfgpap, vddvbub";

		String s[] = name.split(" ");

		HashSet hs = new HashSet<>();

		for (int i = 0; i < s.length; i++) {

			for (int j = i + 1; j < s.length; j++) {

				if (s[i].equals(s[j])) {
					continue;
				}
				hs.add(s[j]);
			}
			

		}

		System.out.println(hs);

		char ch[] = name.toCharArray();

		String rev = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		if (name.equals(rev)) {

			// System.out.println(name+" String is palindrome");
		} else {
			// System.out.println(name+" String is not palindrome");
		}

	}
}
