package com.forLoopEx;

import java.util.ArrayList;

public class Palindrome {

	public static void main(String[] args) {
		int arr[] = { 121, 548, 1235, 1441 };

		int temp[] = new int[arr.length];
ArrayList<Integer> li=new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

		//	int actualValue = arr[i];
			int rev = 0;
			while (arr[i] > 0) {

				int rem = arr[i] % 10;
				rev = rev * 10 + rem;
				arr[i] = arr[i] / 10;

			}
		//	System.out.println("reverse  " + rev);
		//	if (rev == actualValue)
		//	{
			//	li.add(rev);
		
				System.out.println(rev);
				}
		
		
int max=0;
		
		for(int i=0;i<li.size();i++)
		{
		if(li.get(i)>max)
		{
			max=li.get(i);
		
		
			//}
			//else
		/*	{

				//System.out.println(actualValue + "  This number is not palindrome");
			}

		}
		
		System.out.println(li);
		int max=0;
		
		for(int i=0;i<li.size();i++)
		{
		if(li.get(i)>max)
		{
			max=li.get(i);
		}
		}
		System.out.println("Biggest palindrom in given array is  "+max);
		*/
	}

}
}}