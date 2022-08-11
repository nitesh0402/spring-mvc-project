package com.Interview.type;
import java.util.Arrays;

public class SecondLargest {

	
	public static void main(String[] args) {
		
		
		int arr[]= {1,5,6,4,8,7,2,3};
		
		
Arrays.sort(arr);

for(int i=arr.length-1;i>=0;i--) 
{
	
if(arr[i]!=arr[arr.length-1]) 
{
	
System.out.println(arr[i]);
break;
}
	
	System.out.println(arr.length-1);
}


	}
	
	
}
