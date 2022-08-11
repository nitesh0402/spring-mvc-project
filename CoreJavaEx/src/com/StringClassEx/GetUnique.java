package com.StringClassEx;

public class GetUnique {
	public static void main(String[] args) {
		String name = "aman";
		char s;
		String unique = "";
		String Duplicate = "";

		char nam[] = name.toCharArray();

		for (int i = 0; i < nam.length; i++) {

			if (name.indexOf(nam[i]) == name.lastIndexOf(nam[i])) {

				unique = unique + nam[i];

			} else {
				if (Duplicate.indexOf(nam[i]) == -1)
					Duplicate = Duplicate + nam[i];

			}

//unique=unique+nam	

		}
		System.out.println(unique);
		System.out.println(Duplicate);
//	System.out.println(unique);

	}
}