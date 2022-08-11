package com.throwEx;
import java.util.Scanner;

public class TestThrowsDemo extends RuntimeException {
Scanner sc=new Scanner (System.in);

public TestThrowsDemo(String msg)
{
	super(msg);
	}


static int num;

	
	void add() {

	if(num>18) 
	{
		System.out.println("Eligible");
	}
	else
	{
		 TestThrowsDemo obj1=new TestThrowsDemo("given age is less than 18");
		 throw obj1;
		
	}
	
	//System.out.println(c);
	

}
public static void main(String []args) 
{
	Scanner sc=new Scanner (System.in);
   System.out.println("Enter Your Age");
  
     num=sc.nextInt();
     
    TestThrowsDemo obj=new TestThrowsDemo("");
obj.add();

}
}
