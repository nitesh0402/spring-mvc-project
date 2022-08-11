package com.collectionEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToList {

	
	public static void main(String[] args) {
		
		
		String []city= {"indore","dewas","bhopal","delhi","ujjain"};
		
		ArrayList<String>al=new ArrayList<>(Arrays.asList(city));
	al.add("vidisha");
		al.add("pithampur");
		
	System.out.println(al.size());	
	
	for(String s:al) 
	{
	System.out.println(s);	
	}
	}
	
}
