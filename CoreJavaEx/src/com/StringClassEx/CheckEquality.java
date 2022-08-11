package com.StringClassEx;

public class CheckEquality {

	
	public static void main(String []args) 
	{
		
		/*
		 * String name="nitesh"; String name1="nitesh";
		 */
		
		
		String name="nitesh";
		String name1="nitesh";
		String name2=new String("nitesh");
		String name3=new String ("nitesh");
		
		
		
		
		//String name=new String ("nitesh");
	//	String name1=new String ("nitesh");
	//	if(name==name1) 
		
	
	 if(name==(name)) {
	  
	  System.out.println("equals");
	  
	  } else {
	  
	  System.out.println("not equals");
	  
	  }
	 
		
		if(name.equals(name1))
		{
			
			System.out.println("equals");
			
		}
		else 
		{
			
		System.out.println("not equals");	
			
		}
		
	}
	
}
