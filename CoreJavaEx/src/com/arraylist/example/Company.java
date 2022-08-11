package com.arraylist.example;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
//import.java.util.list;
public class Company {

	public static void main(String []args) 
	{
		
LinkedHashSet<Integer> al=new LinkedHashSet<Integer>();		




	al.add(12);
	al.add(15);
	al.add(55);
	al.add(15);
	al.add(68);
	al.add(98);

	Iterator it =al.iterator();
	while(it.hasNext()) 
	{
	System.out.println(it.next());	
	}}}