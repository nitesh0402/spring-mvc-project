package com.StringClassEx;

public class vowellChar {

	
	public static void main(String[] args) {
		
		String name=" i am nitesh verma";
	
		String vovel="";	
	
		char nam[]=name.toCharArray();
	
	for(int i=0;i<nam.length;i++)
	
	if(nam[i]=='a'||nam[i]=='e'||nam[i]=='i'||nam[i]=='o'||nam[i]=='u') 
	{
	

	vovel=vovel+nam[i]+",";
	

	}
		
System.out.println(vovel+" ");		
	}
	
}
