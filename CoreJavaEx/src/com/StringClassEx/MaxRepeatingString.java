package com.StringClassEx;

public class MaxRepeatingString {

	public static int maxRepeating(String sequence, String word) {
//ababc  ba
		int count = 0;
		char ch[] = word.toCharArray();
		int fIndex = word.indexOf(ch[0]);
		int lIndex = word.indexOf(ch[ch.length - 1]);
		System.out.println("fIndex " + fIndex + "  lIndex  " + lIndex);
		while (sequence.length() > word.length()) {
			char seq[] = sequence.toCharArray();

			if (sequence.indexOf(ch[0]) > sequence.indexOf(ch[ch.length - 1])) {
				sequence = sequence.substring(ch.length - 1);
				String newWord = sequence.substring(fIndex, lIndex + 1);
				if (newWord.equals(word)) {
					count++;
				}
				sequence = sequence.substring(lIndex + 1);
			} else {
				
				String newWord = sequence.substring(fIndex, lIndex + 1);
				if (newWord.equals(word)) {
					count++;
				}
				sequence = sequence.substring(lIndex + 1);
			}
		}

		return count;

	}

	public static void main(String[] args) {
		System.out.println("output ->  " + maxRepeating("ababcbaa", "bab"));
	}
}
