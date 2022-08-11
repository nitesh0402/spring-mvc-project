package com.StringClassEx;

public class GetDuplicateChar {

	public static void main(String[] args) {
		String name = "anmafnfstt";
		char t;
		char nam[] = name.toCharArray();

		for (int i = 0; i < nam.length; i++) {// int c=0;

			for (int j = i + 1; j < nam.length; j++) {

				if (nam[i] == nam[j])
				// c++;

				{

					t = nam[i];

					System.out.print(t+",");

				}

			}

		}

	}

}
