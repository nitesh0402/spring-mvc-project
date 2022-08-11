package EmployeH;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

//import Company.Employee;

public class EmployeeMain {

	
	
	
	public static void main(String []args) 
	{ int empId,empSall;																																				
	String empName;
		Scanner sc=new Scanner(System.in);	
		Configuration cfg=new Configuration();
		cfg.configure ("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction ts=s.beginTransaction();
		System.out.println("Enter Employee Id Number");
		empId=sc.nextInt();
	    System.out.println("Enter Employee Name");
	empName=sc.next();
	System.out.println("Enter Employee Salary");
	empSall=sc.nextInt();
	System.out.println("Data save sucssefully");
	Employee obj=new Employee();
	obj.setEmpId(empId);
	obj.setEmpName(empName);
	obj.setEmpSall(empSall);
	s.save(obj);
	ts.commit();
	s.close();
		
	}

	public EmployeeMain() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
