package com.StringClassEx;

public class StringOcureence {

	public static void main(String[] args) {
		String name = "amann";

		char ch[] = name.toCharArray();
		String s = "";

		for (int i = 0; i < ch.length; i++) {

			int count = 1;

			for (int j = i + 1; j < ch.length; j++)

			{
				if (ch[i] == ch[j]) {
					count++;
				}
				if (s.indexOf(ch[i]) > -1) {
					count = 0;
				}
			}
//			System.out.println(b+"  "+ch[i]);
			
			if (i == ch.length - 1) {
				if (s.indexOf(ch[i]) > -1) {
					count = 0;
				} else {
					count = 1;
				}
			}
			s = s + ch[i];
			if (s.indexOf(ch[i]) > -1 && count != 0) {
				System.out.println(ch[i] + "   count is  " + count);
			}

		}

	}

}
