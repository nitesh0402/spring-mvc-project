package com.Interview.type;

import java.util.Scanner;

public class GetDizit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
int count=0;

		int num;
		System.out.println("Enter any number");
				
			
		num=sc.nextInt();
		
		
	while(num>0) {

		num=num/10;	
			
		count++;
		}	
	
		

		System.out.println(count);
		
	}
	}

