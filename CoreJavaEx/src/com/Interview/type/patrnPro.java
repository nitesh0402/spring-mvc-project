package com.Interview.type;

public class patrnPro {

public static void main(String[] args) {
	
/*
   int space=1;
	for( int i=1;i<=6;i++) 
	{
		
		for(int k=5;k>=space;k--) 
		{
			
			System.out.print(" ");
		}space++;
		
			for(int j=1;j<=i;j++) 
		{
			
			System.out.print(" *");
		}
		
			
			System.out.println();
	}
	*/


/*
 * for(int i=1;i<=6;i++) {
 * 
 * for(int j=1;j<=i;j++) {
 * 
 * System.out.print("*");
 * 
 * } System.out.println();
 * 
 * 
 * }
 */



	

  for(int i=1;i<=6;i++) {
  
  for(int j=1;j<=i;j++) {
  
  System.out.print("*");
  
  } if(i==1) { System.out.print("*"); break; } else if(i==6)
  {System.out.print("*");
  
  } else if(i==1||i==6 ) { System.out.println("*"); }
 
 System.out.println(); }
 	
	}
	
	
	
	
}


