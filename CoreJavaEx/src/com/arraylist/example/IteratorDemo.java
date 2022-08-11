package com.arraylist.example;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();

		al.add("yogesh");
		al.add("nitesh");
		al.add(50); 
		al.add(12.50);

		Iterator i = al.iterator();

	while(al.size()>0)
	{	
		if (i.hasNext()) {
			System.out.println(i.next());

		} else {

			System.out.println("Thre is no value availabe in collection");
			break;
		}
	}
	}

}
