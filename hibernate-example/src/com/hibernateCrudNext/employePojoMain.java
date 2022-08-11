package com.hibernateCrudNext;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import org.hibernate.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class employePojoMain {
	static Scanner sc = new Scanner(System.in);
	static SessionFactory sf;
	static Session ss;
	static int empId;
	static String empName;
	static int empSall;

	static void conction() {

		Configuration cfg = new Configuration();
		cfg.configure("employePojo.cfg.xml");
		sf = cfg.buildSessionFactory();
		ss = sf.openSession();
	}

	static void insertData() {
		System.out.println("Enter employe Id");
		empId = sc.nextInt();
		System.out.println("Enter employe name");
		empName = sc.next();
		System.out.println("Enter employe Sallary");
		empSall = sc.nextInt();

		EmployePojo em = new EmployePojo();
		em.setEmpId(empId);
		em.setEmpName(empName);
		em.setEmpSall(empSall);
		Transaction ts = ss.beginTransaction();

		ss.save(em);
		ts.commit();
		System.out.println("data saved");
	}

	static void update() {

		Object o = ss.get(EmployePojo.class, empId);

		EmployePojo e = (EmployePojo) o;
		e.setEmpName(empName);
		System.out.println("enter Employe Id");
		empId = sc.nextInt();
		System.out.println("enter Employe empName");
		e.setEmpName(empName);
		System.out.println("enter Employe Sallary");
		e.setEmpSall(empSall);

		ss.update(e);
		Transaction ts = ss.beginTransaction();
		ts.commit();
		System.out.println("Data Update");
	}

	static void delete() {

		EmployePojo em = new EmployePojo();
		System.out.println("enter Employe ID");
		em.setEmpId(empId);
		Object o = ss.get(EmployePojo.class, empId);
		EmployePojo e = (EmployePojo) o;
		ss.delete(em);
		Transaction ts = ss.beginTransaction();
		ts.commit();
		System.out.println("data delete");

	}
	
	static void Select() {
	Query q=ss.createQuery("empPojo em");
	List <EmployePojo> lt=(List<EmployePojo>)q.list();
	Iterator it=lt.iterator();
	while(it.hasNext()) 
	{
		
		EmployePojo obj=(EmployePojo)it.next();
		System.out.println("Employe ID is"+obj.getEmpId());
		System.out.println("employe name is"+obj.getEmpId());
		System.out.println("Employe "+obj.getEmpSall());
		
	}
	}
	
	

	static void closeConction() {

		ss.close();

	}

	public static void main(String[] args) {
		conction();

	//	insertData();
        //update();
		//delete();
		Select();
		
		
		closeConction();

	}

}
