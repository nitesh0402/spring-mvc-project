package ExceptionHanding;

import java.util.Scanner;

public class ExceptionDemo {

	static int a;
	static int b;
	static int c;

	void divide() {
try {
		c = a / b;
}
catch (Exception e) {
	c = a / 2;	
}
finally 
{
	
System.out.println(" add and divide mathrod");

}
	}
	void add() 
	{
	int a=10;
	int b=4;
	 c=a+b;
		
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter frist number");
			a = sc.nextInt();
			System.out.println("Enter second number");
			b = sc.nextInt();
		}
		catch (Exception e) {
	//		System.out.println();
			e.printStackTrace();
		}

		
		ExceptionDemo obj=new ExceptionDemo();
		obj.divide();
		System.out.println("divide number is " + c);

	obj.add();
	System.out.println(c);
	
	}
}
