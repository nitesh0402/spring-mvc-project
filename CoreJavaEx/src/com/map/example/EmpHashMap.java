package com.map.example;

import java.util.HashMap;

import java.util.HashMap;

public class EmpHashMap {

	public static void main(String []args) 
	{
		
	HashMap<Integer,Employe> hm= new HashMap<>();	
		
	Employe e=new Employe();
	e.setEmpId(1122);
	e.setEmpName("nitesh");
	e.setSalay(15000);
	Employe e1=new Employe();
	e1.setEmpId(1123);
	e1.setEmpName("yogesh");
	e1.setSalay(15000);
	
	Employe e2=new Employe();
	e2.setEmpId(1122);
	e2.setEmpName("nitesh");
	e2.setSalay(15000);
	
	hm.put(101, e);
	hm.put(102, e1);
	hm.put(103, e2);
		
		System.out.println(hm.get(101));
		System.out.println(hm.get(102));
		System.out.println(hm.get(103));
		
	
//System.out.println();
	}}
