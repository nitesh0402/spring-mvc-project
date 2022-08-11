package com.Interview.type;

public class ArrayEx {

	public static void main(String []args) 
	{

		int arr1[]= {5,2,7,3,9};
		int arr2[]= {55,45,35,25,15};
		int lengthofarr2=arr2.length-1;
		for(int i=0;i<arr1.length;i++) 
		{
			
			for(int j=lengthofarr2;arr2.length>i;j--) 
			{
				
				System.out.print(arr1[i]+",");
				

				System.out.print(arr2[j]+",");
				
				lengthofarr2--;
				break;
		
			
		}
		
		
	}
	
	
		
	
		

	
	}
	}
