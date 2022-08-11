package com.StringClassEx;

public class GetPalingrome {
	public static void main(String[] args) {

		String name = "naana";
		String nam1 = "";

		char[] nam = name.toCharArray();

		for (int i = nam.length - 1; i >= 0; i--) {
			nam1 = nam1 + nam[i];

		}
		if (name.equals(nam1)) {
			System.out.println("palindrome is  --> " + nam1);
		} else

		{
			System.out.println("not a palindrome  --> " + nam1);
		}
	}

}
