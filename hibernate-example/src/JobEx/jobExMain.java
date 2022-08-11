package JobEx;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class jobExMain {

	public static void main(String[] args) {
		int Empid, sell;
		String Dpatment, Empname;
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
		System.out.println("Enter Employee Id");
		Empid = sc.nextInt();
		System.out.println("Enter Employee Deparment");
		Dpatment = sc.next();
		System.out.println("Enter Employee Sallary");
		sell = sc.nextInt();
		System.out.println("Enter Employee Name");
		Empname = sc.next();
		JobEx obj = new JobEx();
		obj.setEmpId(Empid);
		obj.setDpatment(Dpatment);
		obj.setSell(sell);
		obj.setEmpName(Empname);
		s.save(obj);
		ts.commit();
		s.close();

	}

}
