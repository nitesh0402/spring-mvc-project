package com.exception;

import java.util.Scanner;

public class throwex extends RuntimeException {

	static int num;
	static int c = 0;

	public throwex(String msg) {

		super(msg);
	}

	public   void getPrime() {
// System.out.println("num "+num );
		for (int i = 2; i <= num; i++) {

			if (num % i == 0) {
				c++;
			}

			
			
		}
		if (c == 1) {
			
			System.out.println("number is Prime " + num);
		} else
		{

//			System.out.println("number is not prime" + num);

			throwex tx = new throwex(" try again");

			throw tx;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");

	try {	num = sc.nextInt();
	}catch (Exception e) {
e.printStackTrace();
	}
		throwex tx1 = new throwex("");

		tx1.getPrime();
	}

}