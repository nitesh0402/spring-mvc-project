package com.throwEx;
import java. util.Scanner;
public class ThrowDemo extends RuntimeException {
	 static int num;
	String msg;
	
	public ThrowDemo(String msg)
	{
		super(msg);
	}

	boolean GetEligiblity() 
			{
	if(num>18) 
	{
      return true; 
	}
	else {	
		
		
	return false;
	}
		
	}
	
public static void main(String []args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your age");	
     num=sc.nextInt();	
ThrowDemo obj=new ThrowDemo(" your is age lethen 18");

 boolean result= obj.GetEligiblity();  


if (result) {
	System.out.println("you are eligible for voting");
} else {
	// throw t1;

	throw obj ;
	//System.out.println("youa age age is lessthen 18");
}


}
}
