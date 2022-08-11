
package com.StringClassEx;

public class CountVowell {

	public static void main(String[] args) {
		String s = "";

		String name = "i am nitesh and i am good";

		System.out.println("String length is " + name.length());

		int vowellCount = 0;
		int constentCOunt = 0;
		int spaceCount = 0;
		// String nam[]=name.split(" ");
		char nam[] = name.toCharArray();
		for (int j = 0; j < nam.length; j++) {

//	s=nam[i];

			// char arr1 [] =s.toCharArray();

			if (name.charAt(j) == 'a' || name.charAt(j) == 'i' || name.charAt(j) == 'o' || name.charAt(j) == 'u'
					|| name.charAt(j) == 'e') {

				// vowell=vowell+arr1[j];
				vowellCount++;
			} else if (name.charAt(j) == ' ') {

				spaceCount++;
				// constent=constent+arr1[j];
			} else {

				constentCOunt++;
				// constent=constent+arr1[j];
			}
		}

		System.out.println("vowell " + vowellCount);

		System.out.println("constent " + constentCOunt);
		System.out.println("space " + spaceCount);

//System.out.println(vowell+"total vowell is  "+vowell.length());
//System.out.println( constent +"total constent is  "+constent.length());

	}

}
