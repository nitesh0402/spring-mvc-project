package com.Interview.type;

public class PatrnNextPro {

	public static void main(String[] args) {
		int space = 6;

		for (int i = 1; i < 6; i++) {

			for (int j = space; j >= i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {

				if (i == 1) {
					System.out.print("*");
					break;
			
				} else 
					if (i == 5) {
					
						System.out.print(" *");
					}	
					}	System.out.println();
				}
		
			
		
			
		space--;

	}

}
