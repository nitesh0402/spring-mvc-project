package com.StringClassEx;

public class StringReverse {

	public static void main(String[] args) {
		String name = "nitin noon";

		String rev = "";
		char arr[] = name.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {

			rev = rev+ arr[i];

		}	
		if (rev == name) {
			
			System.out.println("name is palindrome --> "  +  rev);
		}
		else
		{
			System.out.println("name is not palindrome -->  " + rev);
		}

		/* System.out.println(rev); */

		/*
		 * for(int i=arr.length;i>=0;i--) { if(char[i]==name)
		 */
		
	}
}