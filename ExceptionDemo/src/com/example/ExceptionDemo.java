package com.example;

public class ExceptionDemo {

	public static void main(String[] args) {

	System.out.println(1);
	System.out.println(2);
	System.out.println(3);
	try {
	System.out.println(4/0);
	System.out.println(5);
	System.out.println(6);
	System.out.println(7);
	System.out.println(8);
	System.out.println(9);
	System.out.println(10);
	}catch (Exception e) {
		// TODO: handle exception
	}	
	
	System.out.println("contuing after 10");
	System.out.println("contuing after 10");
	System.out.println("contuing after 10");
	
	}
}
