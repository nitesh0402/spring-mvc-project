package OverRiding;

public class PMethodOverRiding {

	int a, b, c;

	/*
	 * void add(int a,int b)
	 * 
	 * { int c=a+b;
	 * 
	 * 
	 * System.out.println(c);
	 * 
	 * 
	 * }
	 */
	void multiple(int a, int b) {

		int c = a * b;
		System.out.println("I Am Prarent CLass " + c);

		// System.out.println("I Am Multiplye Methord");

		// System.out.println();
	}

}
