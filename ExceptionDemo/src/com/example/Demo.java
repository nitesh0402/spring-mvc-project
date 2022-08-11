package com.example;

import java.io.*;

public class Demo {

	String s="nitesh";
	int i;
	public  void Read() 
			throws IOException
	{
	//	try {
		File f=new File("D:\\Nitesh Java work//reada.txt");
		FileInputStream fis=new FileInputStream(f);
	//}
		//catch(Exception ex) {
		//System.out.println("file not found");
//	}
		//finally
		//{
		//System.out.println("program Completed");	
		//}	
		System.out.println(s);
		System.out.println("addition is");
		}
	public static void main(String[]args) 
	// throws IOException
	{
		Demo d =new Demo();
		try {
		d.Read();
		}
		catch(Exception ex) {
			
			System.out.println("File nhi mili");
		}
		finally 
	    {
		System.out.println("program complete");
	    }
		
		
	}
	}
	
	

