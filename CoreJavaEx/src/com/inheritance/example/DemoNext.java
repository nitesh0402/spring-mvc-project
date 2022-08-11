package com.inheritance.example;

import java.util.jar.Attributes.Name;

public class DemoNext extends Demo  {
	
	
	void  add(int a,int b) 
	{
		
		int c=a+b;
		
		System.out.println(c);
		
	}

	public static void main(String[] args) {
		Demo obj=new Demo();
		
		obj.detail("nitesh");
		DemoNext obh1=new DemoNext();
		obh1.add(10, 04);
	}
	
	
	
}
