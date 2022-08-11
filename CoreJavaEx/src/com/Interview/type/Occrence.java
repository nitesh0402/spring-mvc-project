package com.Interview.type;

public class Occrence {

	
	public static void main(String[] args) {
		
		
		int arr[]= {10,20,30,40,20,40,20,40};
		
		for(int i=0;i<arr.length;i++) 
		{
			int count=0;
			for(int j=i+1;j<arr.length;j++) 
			{
				
				if(arr[i]==arr[j]) 
				{
					
			count++;		
					
					
				}
				
				
			}
			
	if(count==2) 
	{
		
		System.out.println(arr[i]);
		
	}
		
		}
	 
		
		
		
	}
	
}
