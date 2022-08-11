package com.StringClassEx;

public class GetVowell {

	public static void main(String[] args) {

		String name = "you are verry honest i am big fan ";
		String store = "";
		String nam[] = name.split(" ");

		String vowel = "";
		String constent = "";
		for (int k = 0; k < nam.length; k++) {
			store = nam[k];

			char s[] = store.toCharArray();

			for (int j = 0; j < s.length; j++) {

				if (store.charAt(j) == 'a' || store.charAt(j) == 'e' || store.charAt(j) == 'i' || store.charAt(j) == 'o'
						|| store.charAt(j) == 'u') {

					vowel = vowel + store + " ";
					break;
				}

				else {
					constent = constent + store + " ";

					break;
				}
			}
		}
		System.out.println("vewel is ----->   " + vowel);
		System.out.println("constent is  ----->  " + constent);

	}

}
