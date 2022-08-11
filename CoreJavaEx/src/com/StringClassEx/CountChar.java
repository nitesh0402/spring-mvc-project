package com.StringClassEx;

public class CountChar {
static	String  duplicate="";
static	String unique="";
	public static void main(String[] args) {

		String name = "ttamanwspsn";
	
	/*
		 * 
		 * 
		 * String unique = ""; char arr[] = name.toCharArray();
		 * 
		 * for (int i = 0; i < name.length(); i++) {
		 * 
		 * for (int j = i + 1; j < name.length(); j++) {
		 * 
		 * if (arr[i] == arr[j]) { duplicate=arr[i]; System.out.print(duplicate+",");
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * } }
		 * 
		 * // System.out.println(duplicate); // System.out.println(unique);
		 */ 
		
	
	char arr[]=name.toCharArray();
	
	for(int i=0;i<arr.length;i++) 
	{
		
		if(name.indexOf(arr[i])==name.lastIndexOf(arr[i])) 
		{
			
			unique=unique+arr[i];
	
	
	
			
			
		}
		else  if(duplicate.indexOf(arr[i])==-1) 
		{
			
			duplicate=duplicate+arr[i];
		}
//		{
//			
//	unique=arr[i];		
//			
//		}	
	}

	System.out.println( "unique is ---->  "+unique);
	
	System.out.println("duplicate is ----->   "+duplicate);
	System.out.println("unique length is "+unique.length());
	System.out.println("duplicate length is "+duplicate.length());
	
	}

}
