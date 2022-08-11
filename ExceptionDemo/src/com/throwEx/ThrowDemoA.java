package com.throwEx;
import java.util.Scanner;
public class ThrowDemoA extends RuntimeException {
 static  int num;
 String msg;
 
boolean GetEligble () 
{
if (num>18) 
{
return true;
}
else 
{
	return false;	
}
}
public ThrowDemoA(String msg) {
	super();
	this.msg = msg;
}
public static void main(String []args) 
{
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter your age");
	num=sc.nextInt();
ThrowDemoA obj= new ThrowDemoA ("are is lessthen 18");
//ThrowDemo obj=new ThrowDemo(" your is age lethen 18");

boolean result=obj.GetEligble();
if (result) 
{
	
System.out.println("your are eligble");
}
else
{
throw obj;	
}
}



}

	

