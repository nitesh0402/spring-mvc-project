package com.Interview.type;

import java.util.ArrayList;
import java.util.Scanner;

public class GetFactorial {

	
	public static void main(String[] args) {
		 int fact=1;
			/* ArrayList<Integer> al=new ArrayList<>(); */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter AnyNumber");
		int num=sc.nextInt();
		for(int i=1;i<=num;i++) 
		{
		 fact=fact*i;
		}
		System.out.println(fact);
	}
}
