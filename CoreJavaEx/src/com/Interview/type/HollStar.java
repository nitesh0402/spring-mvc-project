package com.Interview.type;

public class HollStar {

	public static void main(String[] args) {

		/*
		 * for(int i=1;i<=5;i++) {
		 * 
		 * for(int j=1;j<=i;j++) {
		 * 
		 * System.out.print("*");
		 * 
		 * }
		 * 
		 * System.out.println(); }
		 */

		int space = 5;

		for (int i = 1; i <6; i++) {

			for (int j = space; j >= 1; j--) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print(" *");

			}
			System.out.println();	space--;
		}
		
		
		

		int space1 = 5;

		for (int i = 6; i >=1; i--) {

			for (int j =1 ; j <= space; j++) {

				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {

				System.out.print(" *");

			}
			System.out.println();	space++;
		}
	
	}

}