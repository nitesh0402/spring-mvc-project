package com.Interview.type;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayPrimeNum{




		
	
	


public static void main(String[] args) {
	



	int num;
int c=0;
Scanner sc=new Scanner(System.in);	
System.out.println("Enter any  number ");
num =sc.nextInt();

		

for (int i=2;i<10;i++) 
{
	
	if(num%i==0) 
	{	
		c++;
	}
}	
if(c==1) 
		{
	System.out.println("Not Prime");		
			}
		else 
		{
			
			System.out.println("prime");
		}
		
	
	





	
}
}