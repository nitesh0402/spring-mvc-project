package com.Interview.type;

public class amstrongNumber {
public static void main(String[] args) {
	

	int num = 153;
	int temp=num;
	
	int rem=0;
	int remSum=1;
	int remSum1=1;
	 int sum=0;
	 Integer number = new Integer(num);
		String s = number.toString();
		int length = s.length();
		
		
		
for(int i = 0;i<length;i++)
	{

		rem = num % 10;
		for (int j = 1; j <=length; j++) {

			remSum=remSum*rem;
			
		}
		System.out.println("rem is "+remSum);
		remSum1=remSum;
		
		remSum=1;
		sum=sum+remSum1;

num=num/10;
	}
System.out.println( "check number is "+sum);

if(num==sum) 
{
System.out.println("num is amstrong number");


}else 
{
	
System.out.println("number is not amstrong number");

}
}
}

