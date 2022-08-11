package com.Interview.type;

public class GetMax {

	public static void main(String[] args) {
		int temp = 0;
		int num[] = { 1, 4, 8, 9, 4, 7, 5, 6, 14, 8, 14 };

		for (int i = 0; i < num.length; i++) {
			// System.out.println("num "+num[i]);
			for (int j = i + 1; j < num.length; j++) {

				if (num[i]<num[j]) {

					// temp=num[j];
					// num[j]=num[i];
					// num[i]=temp;

					num[i] = num[i] + num[j];
					num[j] = num[i] - num[j];
					num[i] = num[i] - num[j];

					// temp=num[i];

				}

			}

			System.out.println(num[i]);
			/* System.out.println(num[i]); */
		}

		System.out.println("gretest num " + num[num.length - 2]);
	}

}
