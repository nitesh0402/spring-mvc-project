package com.forLoopEx;
import java.util.Arrays;
public class GetSMax {
 static int temp;
public static int Smax(int[]arr,int total) 
	{
		for(int i=0;i<total;i++) 
		{
			for(int j=0;j<total;j++) 
			{
				
			if(arr[i]<arr[j]) 
			{
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
				
			
	
			}	
				
			}
			
		}
		return  arr[arr.length-2];
		//Arrays.sort(a);
		
		
	//	return arr[total-2];
	}
	public static void main(String[]args) 
	{
		int arr[]= {1,5,6,7,8,4,9,1,88,78,65,32,87,224,35,3,5};
		System.out.println("Scond largest num is "+Smax(arr,arr.length));
	}
	
	
}
