package com.Interview.type;

import java.util.ArrayList;
import java.util.Scanner;

public class GetPrime {

	public static void main(String[] args) {
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter any  number ");
		num = sc.nextInt();
*/
		ArrayList<Integer> al = new ArrayList<>();
		for (int j = 3; j <= 100; j++) {
		al.add(j);
		}
		
		for(Integer num:al)
		{
	//	int num=5;
		//	int num2=10;
			int c = 0;
			  for (int i =  2; i < num; i++) { 
			 
			if (num%i== 0) {
				c++;
			
			}

		}
		if (c >= 1) {
			System.out.println("not prime "+num);
		} else {
			System.out.println(" prime num "+num);
		}
		
		}
	}
}