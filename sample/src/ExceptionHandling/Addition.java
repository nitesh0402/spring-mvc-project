package ExceptionHandling;
import java.util.Scanner;
public class Addition {
	public static void main(String []args) 
	{
		int num1,num2,num3;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Frist Number");
		num1=sc.nextInt();
		System.out.println("Enter Secand Number");
		num2=sc.nextInt();
		
	try{	num3=num1+num2;
	System.out.println(num3);}
	catch(Exception ex) {}
		
	}
	
}
