package com.arraylist.example;
import java.util.ArrayList;
public class EmpolyeIterator {

	public static void main(String []args) 
	{
		
		ArrayList<Employe> al=new ArrayList<Employe>();
		Employe e=new Employe();
		e.setId(101);
		e.setcName("SunPharma");
		e.setCno(101);
		e.setEmpName("Nitesh");
		e.setSall(15000);

		Employe e1=new Employe();
		e1.setId(101);
		e1.setcName("SunPharma");
		e1.setCno(101);
		e1.setEmpName("Nitesh");
		e1.setSall(15000);
		
		Employe e2=new Employe();
		e2.setId(101);
		e2.setcName("SunPharma");
		e2.setCno(101);
		e2.setEmpName("Nitesh");
		e2.setSall(15000);
		al.add(e);
	al.add(e1);
	al.add(e2);
	
	for(Employe emp:al) 
	{
		
		System.out.println(emp);
	}	
		
	}
		
		
	}
	

