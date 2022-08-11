package com.Interview.type;

public class HollowPyramid {

	public static void main(String[] args) {

		int space = 1;
		for (int i = 1; i <= 6; i++) {
			
			for (int j = 5; j >= space; j--) {
				System.out.print(" ");
			}
			space++;

			for (int k = 1; k <= i; k++) {
				if (i == 1) {
					System.out.print("* ");
					break;
				} else if (i == 6) {
					System.out.print("* ");
				} else {
					if (k == 1 || k == i) {
						System.out.print("* ");
					} else {
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}

	}

}
