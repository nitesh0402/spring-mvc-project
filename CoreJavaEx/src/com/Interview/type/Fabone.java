package com.Interview.type;

public class Fabone {
//0 1 1 2 3 5 8  13
	public static void main(String[] args) {
		int f = 0;
		int s = 1;

		System.out.println(f);

		int newNum;
		for (int i = 0; i < 5; i++) {

			newNum = f + s;

			s = f;
			f = newNum;
			System.out.println(newNum);
		}

	}

}
