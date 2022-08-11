package com.collectionExample;

public class StringBuilderEx {
	public static void main(String []args) {
	StringBuilder obj=new StringBuilder("Nitesh");
	StringBuilder obj1=new StringBuilder("Nitesh");
	StringBuilder obj2=new StringBuilder("Nitesh");
	
	
	obj.append("verma");
	obj.charAt(5);
	obj.substring(1);
	
	if(obj.equals(obj2))
	//if(obj1.equals(obj2))
	
	//if(obj2.toString().equals(obj1.toString()))
	
	{
		System.out.println("equal");
	}
	else 
	{
		System.out.println("not equals");
	}
	

	//System.out.println(obj);
	
	}
}
