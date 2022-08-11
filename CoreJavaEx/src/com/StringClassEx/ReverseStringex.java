package com.StringClassEx;

public class ReverseStringex {

	public static void main(String[] args) {

		String name = "how are you";
		String s = " ";
		String[] nam = name.split(" ");
		String rev = " ";
		for (int i = 0; i < nam.length; i++) {

			s = nam[i]+" ";

		

		char a[] = s.toCharArray();

		for (int j = a.length - 1; j >= 0; j--)
		{
			rev = rev + a[j];
			
		//	System.out.println(a[j] + " ");
		}}
		System.out.print(rev);
	}

}
