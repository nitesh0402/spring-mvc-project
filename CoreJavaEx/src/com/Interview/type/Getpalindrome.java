package com.Interview.type;

public class Getpalindrome {

	public static void main(String[] args) {
		
		int num=121;
		int n=num;
		int rem=0;
		int sum=0;
		while(n>0) {
		rem=n%10;
		sum=sum*10+rem;
		n=n/10; 
		}
if(sum==num) 
{
System.out.println("palindrome ");	

}else 
{
	
System.out.println("not palindrome ");

}
	}	
		
	
	
}
