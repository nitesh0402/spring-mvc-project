package com.Interview.type;


public class StringShortingEx {

	public static void main(String[] args) {

	
		String arr[]= {"nitesh","yogesh","Dishu","sumit","ntesh"};
		String temp="";	
		for(int i=0;i<arr.length;i++) 
		{
			
			for(int j=i+1;j<arr.length;j++ ) 
			{
				
				if(  arr[i].compareTo(arr[j])>0) 
				{
					
		temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp	;		
					
				}
				
				
				
			}
			
			System.out.println(arr[i]);		
			
		} 
		
	
	}
	
	
}
