package SchoolInfo;

import org.hibernate.*;
import org.hibernate.cfg.*;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class SchoolMain {
static Configuration cfg = new Configuration();
static SessionFactory sessionFactory;
static Session s;
	static void selectOperation()
	{
		cfg.configure("School.cfg.xml");
	SessionFactory sf = cfg.buildSessionFactory();
	Session s = sf.openSession();
		   Query q = s.createQuery("from School "); //select * from job
		   List lst = q.list();
		   Iterator it = lst.iterator();
		   while(it.hasNext())
		    {
		    	School obj =(School) it.next();
		    	System.out.println(obj.getStuR() + " "+obj.getStuN()+" "+obj.getStuFn()+"  "+obj.getStuMn());
		    }
		  
	}
	
	public static void main(String[] args) {
		//selectOperation();
		
		System.out.println("hello");
		int stuR;
		String stuN, stuFn, stuMn;
		Scanner sc = new Scanner(System.in);
		
		cfg.configure("School.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		System.out.println("Enter Student name");
		stuN = sc.next();
		System.out.println("Enter Student Roll Number");
		stuR = sc.nextInt();
		System.out.println("Enter Student Father Name");
		stuFn = sc.next();
		System.out.println("Enter Student Mother Name");
		stuMn = sc.next();
		School obj = new School();
		obj.setStuN(stuN);
		obj.setStuR(stuR);
		obj.setStuFn(stuFn);
		obj.setStuMn(stuMn);
		s.save(obj);

		tx.commit();
		System.out.println("Your data saved successfully");
		s.close();
		
	}

}
