package com.StringClassEx;

public class HollStringReverse {

public static void main(String []args) {
	String name ="my name is maam or nitin";
	
	//o/p ym eman si naam ro nitin;
	
	//String a="";

	String	nam []=name.split(" ");
	String rev="";
	for(int i=0;i<nam.length;i++) 
	{
	String s=nam[i];
	char arr[]=s.toCharArray();
	for (int j=arr.length-1;j>=0;j--) 
	{
		rev=rev+arr[j];
		
	
	}
	rev=rev+" ";
		

	}
	System.out.println(rev);
	/*
	 * * String ab =nam[i]; System.out.println( ab.charAt(0));
	 * 
	 * // for(int j=ab.length()-1;j<=0;i--)
	 * 
	 * {
	 * 
	 * 
	 * }
	 * 
	 * }
	 */
//	System.out.println(rev);
}}	