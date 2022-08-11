package OneToMany;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDptEmp {

	public static void main(String[] args) {
		int dptid;
		String dptname;
		int empId;
		String empName;
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("OneToMany.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Dept obj = new Dept();
		
		System.out.println("Enter Department ID");
		dptid = sc.nextInt();
		System.out.println("Enter Department Name");
		dptname = sc.next();

		Employe obj1 = new Employe();

		System.out.println("Enter 1 Employee ID");
		empId = sc.nextInt();
		System.out.println("Enter 1Employe Name");
		empName = sc.next();

		Employe obj2 = new Employe();
		
		System.out.println("Enter 2 Employe ID");
		empId = sc.nextInt();
		System.out.println("Enter 2 Employe Name ");
		empName = sc.next();
		
	
		obj.setDptid(dptid);
		obj.setDptname(dptname);
		obj1.setEmpId(empId);
		obj1.setEmpName(empName);
		obj2.setEmpId(empId);
		obj2.setEmpName(empName);
		
		Set st = new HashSet();
		st.add(obj1);
		st.add(obj2);
		obj.setEmpref(st);
		
		Transaction ts = ss.beginTransaction();
		ss.persist(obj);
		ts.commit();
		System.out.println("data savad");
		ss.close();
		sf.close();

	}

}
