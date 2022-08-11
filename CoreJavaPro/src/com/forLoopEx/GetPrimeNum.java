//date 19/03/2022

package com.forLoopEx;

import java.util.Scanner;

public class GetPrimeNum {
	static int c;
	static int num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		num = sc.nextInt();
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				c++;
			}
		}
		if (c == 0) {
			System.out.println("Number is prime " + num);
		} else {
			System.out.println("Number is not prime " + num);
		}
	}
}
