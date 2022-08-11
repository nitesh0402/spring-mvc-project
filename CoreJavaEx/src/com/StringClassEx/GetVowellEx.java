package com.StringClassEx;

public class GetVowellEx {

	public static void main(String[] args) {
	/*	
		String name="nitesh";
		String constent="";
		String vowell="";
		char arr[]=name.toCharArray();
		
		for(int i=0;i<arr.length;i++) 
		{
			
			if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u') 
			{
				
		vowell=vowell+arr[i];		
				
			}else 
			{
				
		constent=constent+arr[i];		
				
			}
			
			
		}
		System.out.println(vowell);
		System.out.println(constent);
*/	
//	String store="";
//String vowell="";
//String constent="";
//
//	String name="nitesh  kumar verma";
//	
//	String arr[]=name.split(" ");
//	
//	for(int i=0;i<arr.length;i++) 
//	{
//	store=arr[i];	
//		
//		
//char arr2[]=	store.toCharArray();
//
//for(int j=0;j<arr2.length;j++) 
//{
//	
//if(arr2[j]=='a'||arr2[j]=='e'||arr2[j]=='i'||arr2[j]=='o'||arr2[j]=='u') 
//{
//	
//vowell=vowell+arr2[j];
//}
//
//else 
//{
//	
//constent=constent+arr2[j];
//}
//}
//
//	
//		
//	}
//	
//	
//	System.out.println(vowell);	
//	System.out.println(constent);
//	
	
	
	
	String name="niteshverma@gmail.com";
	
	String store="";
	String arr[]=name.split("@");
	
	for(int i=0;i<arr.length;i++) 
	{
		store=arr[i];
	//	System.out.println(arr[i]);
		
		
	}
	
	
	
	
	System.out.println(store);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
