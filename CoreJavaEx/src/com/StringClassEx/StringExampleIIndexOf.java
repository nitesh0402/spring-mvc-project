package com.StringClassEx;

public class StringExampleIIndexOf {

	
	public static void main(String[] args) {
		String email="niteshverma0204@tcs.com";
		
		
		int index=email.indexOf('@');
		String companyName=email.substring(index, email.length());
		System.out.println(companyName);
	}
	
}
