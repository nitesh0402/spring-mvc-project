package com.StringClassEx;

public class Test {
	public static void main(String[] args) {
		String[] str = { "yogesh", "java", "developer", "yogeshdeveloper","javadeveloper"};
		String s = "";
		boolean b = false;

		boolean b1 = true;
		for (int i = 0; i < str.length - 1; i++) {
			if (b1) {
				s = str[i] + str[i+1];
				b1 = false;
			}
			if (b) {
				s = s + str[i];
			}
			for (int j = i; j < str.length; j++) {

				if (s.equals(str[j])) {
					s = str[j];

					b = true;

					break;
				}

			}
		}
		System.out.println(s);
	}
}
