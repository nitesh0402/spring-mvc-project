package com.throwEx;
import java.util.Scanner;
public class StudentResult extends RuntimeException {

	StudentResult( String msg)
	{
	super(msg);
	
	
		
		
		
	}
	static int num;
	void Result() 
	{
	if(num>33) 
	{
		System.out.println("Result is pass");
		}	
	else 
	{
		//System.out.println("Result is fail");
		StudentResult obj1=new StudentResult("Your are fail & plz try next time");	
	throw obj1;
	}

	}
	
	
	
	public static void main(String []args) 
	{
		Scanner sc=new Scanner(System.in);
System.out.println("Enter student mark");
num=sc.nextInt();

StudentResult obj=new StudentResult("");
		obj.Result();
	
	
	
	}
	
	
	
}
