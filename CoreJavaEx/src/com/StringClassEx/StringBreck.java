package com.StringClassEx;

public class StringBreck {

	public static void main(String [] args) 
	{
	String name=" nitesh  verma  ";
	String rev=" ";
String	arr[]=name.split(" ");
for(int i=arr.length-1;i>=0;i--) 
{
	
	rev=rev+" "+arr[i];
	


}
System.out.print(rev);		
	}
	
	
}
