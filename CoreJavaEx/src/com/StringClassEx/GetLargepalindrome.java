package com.StringClassEx;

public class GetLargepalindrome {

	static String s1 = "";
	static String store = "";
	static String duplicate = "";

	public static void main(String[] args) {

		String name = "nitesh nitin malayalam vijay  fggff dfgf fgfgff fgfg maaaaaaaam";

		String[] nam = name.split(" ");

		for (int i = 0; i < nam.length; i++) {
			store = "";
			s1 = nam[i];

			// System.out.print(s1);

			char arr[] = s1.toCharArray();

			for (int j = arr.length - 1; j >= 0; j--) {

				store = store + arr[j];

			}
			// System.out.print(" store value " + store);
			if (s1.equals(store)) {

				duplicate = duplicate + " " + s1;

			}

		}

		String[] arr2 = duplicate.split(" ");
		int max = 0;
		String maxpalindrome = "";
		for (int k = 0; k < arr2.length; k++) {
			if (arr2[k].length() > max) {
				max = arr2[k].length();
				maxpalindrome = arr2[k];
			}

		}	System.out.println("palindrome is  " + duplicate);
		
		System.out.println("maxPalimdrome is   " + maxpalindrome );
		
		System.out.println("maxPalimdrome size is  " +max);
//System.out.println(duplicate.length());

	}
}
