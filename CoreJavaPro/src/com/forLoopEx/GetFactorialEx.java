package com.forLoopEx;
import java.util.Scanner;
public class GetFactorialEx {
	public static void main(String []args) { 
try {	
int num;
int fact=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Any Number");
num=sc.nextInt();
for(int i=1;i<=num;i++) 
{
	fact=fact*i;
}
System.out.println(fact);
}catch(Exception ex) {
	System.out.println(ex);
	System.out.println("Enter only Numeric Integer");
System.out.println(ex.getMessage());
}	
	
finally {
    
    System.out.println("Factorial");
    
}
	
	}}
		
		
	