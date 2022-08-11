package ExceptionHanding;
import java.util.Scanner;

public class ExceptionHanEx {
static	int num ;
public static void main(String []args) {
	Scanner sc=new Scanner(System.in);


 
{

	System.out.println("Enter any number");
try 
{
	num=sc.nextInt();
}
catch(Exception ex) 
{
System.out.println("Enter  only numeric  ");	
}
if(num%2==0) 
	{
		System.out.println("Number is Prime "+num);
	}
else 
	{
				System.out.println("Number is Notprime "+num);
	}
	



	
}
}
}
