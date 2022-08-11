package com.StringClassEx;

public class CheckAnogram {

	static char temp = 0;
	static String s = "";
	static String t = "";

	public static void main(String[] args) {

		String name = "tinhes";
		String name1 = "ineths";
		char arr[] = name.toCharArray();

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;

				}

			}

			t = t + arr[i];
			// System.out.print(arr[i]);
			
		}

		// ---------------------------------------------------------------


		char arr1[] = name1.toCharArray();

		for (int k = 0; k < arr1.length - 1; k++) {

			for (int l = k + 1; l < arr1.length; l++) {

				if (arr1[k] > arr1[l]) {

					temp = arr1[l];
					arr1[l] = arr1[k];
					arr1[k] = temp;

				}

			}
			s = s + arr1[k];

		}
		System.out.println(t);
		System.out.println(s);
		if(t.equals(s))
		{
		System.out.println("String is anagram");
		}
	}
}
