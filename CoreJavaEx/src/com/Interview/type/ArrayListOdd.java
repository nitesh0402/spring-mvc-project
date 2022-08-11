package com.Interview.type;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOdd {

	public static void main(String[] args) {
	//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter num");
	//	int num = sc.nextInt();
	//	int num=80;
		ArrayList<Integer> al = new ArrayList<Integer>();

	//	while (num <= 100)
		for(int num=1;num<=100;num++)
		{
			al.add(num);
		}

		for (Integer a : al) {

			if (a % 2 == 0) {

				System.out.println("Even " + "=" + a);
			} else {
				System.out.println("odd " + "=" + a);
			}

		}

	}

}
