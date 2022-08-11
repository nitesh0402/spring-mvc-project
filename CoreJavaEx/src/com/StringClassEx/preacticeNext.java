package com.StringClassEx;

public class preacticeNext {
	static String store2 = "";

	public static void main(String[] args)

	{
		String name = "nitesh verma how are you";
		String store = "";
		String vowell = "";
		String constant = "";
		int spaceCount = 0;
		System.out.println(name.length());
		String arr[] = name.split(" ");

		for (int k = 0; k < arr.length; k++) {

			store = arr[k] + " ";

			char array[] = store.toCharArray();

			for (int j = 0; j < array.length; j++) {
//
				if (array[j] == 'a' || array[j] == 'e' || array[j] == 'i' || array[j] == 'o' || array[j] == 'u') {

					vowell = vowell + array[j];

				} else if (array[j] == ' ') {
					spaceCount++;

				}

				else {

					constant = constant + array[j];

				}
			}

		}

		System.out.println(vowell);
		System.out.println(constant);
		System.out.println("space count is " + spaceCount);
		System.out.println("vowell length is   " + vowell.length());
		System.out.println("constant length is  " + constant.length());
	}
}
