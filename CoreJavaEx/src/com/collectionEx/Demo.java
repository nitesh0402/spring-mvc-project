package com.collectionEx;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Stack;

public class Demo {

	
	public static void main(String[] args) {
		
		
		String arr[]= {"nitesh","yogesh","nitesh","rohit","nitesh"};
	
	HashSet<String>al=new HashSet<>();
//	LinkedHashSet<String>	al=new LinkedHashSet<>();
	
		
		//Stack<String>al=new Stack<>();
		
		al.add("kalu");
		al.add("raju");
		
		
		
		
		
		
		
		for(String s:arr) 
		{
			
			al.add(s);
			
			
		}
		
		System.out.println(al);
		
	}
	
}
