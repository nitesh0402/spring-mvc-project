package com.employeshorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeMain implements Comparator<Employe> {

	
	public static void main(String[] args) {
		
		
		ArrayList <Employe>arrObj=new ArrayList<Employe>();
		
		Employe em=new Employe();
		em.setDpt("It");
		em.setId(101);
		em.setName("nitesh");
		em.setSallary(2500);
		
		
		Employe em2=new Employe();
		em2.setDpt("admit");
		em2.setId(102);
		em2.setName("yogesh");
		em2.setSallary(4500);
		
		Employe em3=new Employe();
		em3.setDpt("manager");
		em3.setId(103);
		em3.setName("aman");
		em3.setSallary(7500);
		
		Employe em4=new Employe();
		em4.setDpt("ec");
		em4.setId(104);
		em4.setName("aman");
		em4.setSallary(6500);
		
		Employe em5=new Employe();
		em5.setDpt("civil");
		em5.setId(105);
		em5.setName("nayan");
		em5.setSallary(5500);
		
		
		
		arrObj.add(em);
		arrObj.add(em2);
		arrObj.add(em3);
		arrObj.add(em4);
		arrObj.add(em5);
		
		System.out.println("before sort   "+arrObj);
	Collections.sort(arrObj,new EmployeMain());	
		
		
	System.out.println("After sort   "+arrObj);
		
		
		
	}

	

	@Override
	public int compare(Employe o1, Employe o2) {
		// TODO Auto-generated method stub
		
		return o1.getSallary()>o2.getSallary()?1:-1;
	}
	
	
	
}
