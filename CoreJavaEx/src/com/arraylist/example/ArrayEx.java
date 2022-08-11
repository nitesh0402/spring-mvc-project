package com.arraylist.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayEx {


	public static void main(String[] args) {
		
		ArrayList obj=new ArrayList<>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		
		//Iterator it=obj.listIterator();
		ListIterator lt=obj.listIterator();
		while(lt.hasNext()) 
		{
			
			System.out.println(lt.next());
			
		}
		
	}
	
}
