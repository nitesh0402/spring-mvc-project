package HibernateCrud;


import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		int sRollNum;
		String sName;
		int className;
		Scanner sc = new Scanner(System.in);
	//	System.out.println("HEll every one");
		
	
        Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		System.out.println("Enter Employee Id Number");
		sRollNum=sc.nextInt();
	    System.out.println("Enter Employee Name");
	    sName=sc.next();
	System.out.println("Enter Employee Salary");
	className=sc.nextInt();
	System.out.println("Data save sucssefully");
	System.out.println("HEll every one");
	
		Student s = new Student();

		s.setsRollNum(sRollNum);
		s.setsName(sName);
		s.setClassName(className);
		ss.save(s);

		ts.commit();
		ss.close();

	}

}
