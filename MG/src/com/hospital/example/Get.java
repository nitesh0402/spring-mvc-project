package com.hospital.example;

public class Get {
	public static void main(String []args) 
	{
		int tmp=0;
		
	int arr[]= {1,2,3,45,6,7,46};
	for(int i=0;i<arr.length;i++) 
	{
		for(int j=1;j<arr.length;j++) 
	{
	  if(arr[i]<arr[j]) 
	  {
		//arr[i]=arr[j];
		
		

	   arr[i]=arr[j];
	   tmp=arr[i];
	   arr[j]=tmp;
	   
	  }
	 
	  
	  }
	System.out.println(arr[i]);
	
	}}
}
