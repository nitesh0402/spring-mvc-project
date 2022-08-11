package com.hibernate.crud;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeMain {

	static int empID;
	static String empName;
	static int empSall;
	static String empAdd;
	static SessionFactory sf;
	static Session ss;
	Scanner sc = new Scanner(System.in);

	static void conection() {
		Configuration cfg = new Configuration();
		cfg.configure("employe.cfg.xml");
		sf = cfg.buildSessionFactory();
		ss = sf.openSession();
	
	System.out.println("hello");
	}

	static void insertData() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employe ID");
		empID = sc.nextInt();
		System.out.println("Enter Employe Name");
		empName = sc.next();
		System.out.println("Enter Employe Sallary");
		empSall = sc.nextInt();
		System.out.println("Enter Employe Address");
		empAdd = sc.next();
		Employe em = new Employe();
		em.setEmpID(empID);
		em.setEmpName(empName);
		em.setEmpSall(empSall);
		em.setEmpAdd(empAdd);
		Transaction tx = ss.beginTransaction();
		ss.save(em);
		tx.commit();

	}

	static void update() {
Scanner sc=new Scanner (System.in);
		Transaction ts = ss.beginTransaction();
        System.out.println("Enter Employe empID");
        empID=sc.nextInt();
        Object o=ss.get(Employe.class, empID);
        Employe emp=(Employe)o;
        emp.setEmpID(empID);
        emp.setEmpName(empName);
        emp.setEmpSall(empSall);
        emp.setEmpAdd(empAdd);
        ss.update(emp);
        ts.commit();
        }
	static void delete() 
	{
	Transaction ts=ss.beginTransaction();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employe EmpID for Delete");
	empID=sc.nextInt();
	Object o=ss.get(Employe.class, empID);
	Employe emp=(Employe)o;
	ss.delete(emp);
	ts.commit();
	
		
	}
	
	static void closeConction() 
	{
		
		ss.close();
		
		
	}
	public static void main(String[] args) {
	
		System.out.println("hello  every one");
		conection();
		
	//	insertData();
		//closeConction();
	}
	
	

}
