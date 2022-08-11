package com.StringClassEx;

public class Gmailcheckex {

	public static void main(String[] args) {
		
		
		String store="";
		String email="niteshverma0204@tcsyahoo.com";
		
		String arr[]=email.split("@");
		for(int i=0;i<arr.length;i++) 
		{
			
		store=arr[i];	
			
		}
		System.out.println(store);
	}
	
	
}
