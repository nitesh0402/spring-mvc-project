package com.StringClassEx;

public class DemoEx {

 static String store="";
	
	public static void main(String[] args) {
	
	String s="Kangaroo soft private Limited";
	String []s1=s.split(" ");
	//System.out.println(s1.length);
	
	for(int i=0;i<s1.length;i++) 
	{
		
	store=store+s1[i];	
		
		
	}
	
System.out.println(store.length());

	
	
	
	
	
	
	
	
}
}

