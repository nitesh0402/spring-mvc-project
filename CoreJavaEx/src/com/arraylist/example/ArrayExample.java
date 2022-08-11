package com.arraylist.example;

public class ArrayExample {

	public static void main(String[] args) {
		int even = 0;
		int odd = 0;
		int max = 0;
		int fact = 1;
		int arr[] = { 1, 2, 4, 3, 5};

		for (int i = 0; i <arr.length; i++) {
			if (arr[i] > max) {

				max = arr[i];

			}
			
		}
		System.out.println(max);
	for (int j = 1; j <max; j++) {

			fact = fact * arr[j];

		}
		System.out.println( "max number factorial is "+fact);

	}

}
