package ExceptionHandling;
import java.util.Scanner;
public class GetPrime {
	public static void main (String []args) {
		
		int num;	
	    int c=0;

	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Any Number");
	 
    try {
    	num=sc.nextInt();
	for (int i=2;i<num;i++) 
	{
	  if(num%i==0) {
		  c++; 
	  }		
	}
		if(c==0) 
			{
				System.out.println("  Prime Number");	
			  }
			else
			{
				System.out.println("  Not Prime number");
				}
		}
			catch(Exception ex) {System.out.println("Enter only Integer  Numeric"); System.out.println(ex);}

	       
	        
		}
	}
	