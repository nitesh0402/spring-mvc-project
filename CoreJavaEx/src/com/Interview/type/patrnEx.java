package com.Interview.type;

public class patrnEx {

	public static void main(String[] args) {
		int space = 1;
		for (int i = 1;i<=6; i++)
		{
			for(int k=5;k>=space;k--) 
			{
				System.out.print(" ");
		}
			for(int j=1;j<=i;j++) 
			{
				
				System.out.print("* ");
			}
			System.out.println();	space++;
				
		}

		}
	
	}

