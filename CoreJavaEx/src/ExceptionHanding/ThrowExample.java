package ExceptionHanding;

import java.util.Scanner;

public class ThrowExample extends RuntimeException {


	public	ThrowExample(String msg)
	{
		super(msg);
		
	}
 static	int age;
	void  checkEligblity()
	{
	
	 
		
	if(age>18) 
	{
	System.out.println("Your Eligble For Volting");	
	
	}
	else	{
	
	//System.out.println("your not Eliglbe for voting");	
		
		
	ThrowExample obj1=new ThrowExample("plz Enter vailid age");
	throw obj1;
	}
	
 
	
}
	void add(int a,int b) 
{
	
	
	int c=a+b;
System.out.println(c);
}
	
	public static void main(String[] args)
	
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter your age");
		age=sc.nextInt();
		ThrowExample obj=new ThrowExample("");
		obj.checkEligblity();
		obj.add(10, 4);
	}

	
	
	
	}
	

