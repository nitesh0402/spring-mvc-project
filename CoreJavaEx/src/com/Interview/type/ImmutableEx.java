package com.Interview.type;

public final class ImmutableEx {

	

	final String panNumber;
	
	public String getPanNumber() {
		return panNumber;
	}
	public ImmutableEx(String panNumber) {
		this.panNumber = panNumber;

	}

	/*
	 * public ImmutableEx myConcat(String str) {
	 * 
	 * return new ImmutableEx("verma"); }
	 */

	public static void main(String[] args) {
	
		ImmutableEx i = new ImmutableEx("abc123");
		
		System.out.println(i.getPanNumber());

	}

}
