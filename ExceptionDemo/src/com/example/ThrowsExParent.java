package com.example;

import java.io.*;

class ThrowsExParent {
	String s;
 int i;
	public void read() throws FileNotFoundException  {
//-------------------------------------
File f=new File("D://Nitesh Java work//raaaead.txt");
FileInputStream fis=new FileInputStream(f);
		
		System.out.println(s);
		System.out.println("Addition is");
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		ThrowsExParent t=new ThrowsExParent();
t.read();

	}
}