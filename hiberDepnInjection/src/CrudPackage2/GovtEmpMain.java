package CrudPackage2;

import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class GovtEmpMain {

	static int empId;
	static String empName;
	static int empSall;
	static String address;
	static Scanner sc = new Scanner(System.in);
	static SessionFactory sf;
	static Session ss;

 static	void conection() {

		Configuration cfg = new Configuration();
		cfg.configure("govtEmp.cfg.xml");
		sf = cfg.buildSessionFactory();
		ss = sf.openSession();
	}

 static	 void insertData() {
		int empId;
		String empName;
		int empSall;
		String address;
		System.out.println("Enter Employe Id");
		empId = sc.nextInt();
		System.out.println("Enter Employe Name");
		empName = sc.next();
		System.out.println("Enter Employe Sallary");
		empSall = sc.nextInt();
		System.out.println("Enter Employe Address");
		address = sc.next();

		GovtEmploye em = new GovtEmploye();

		em.setEmpId(empId);
		em.setEmpName(empName);
		em.setEmpSall(empSall);
		em.setAddress(address);
		
		ss.save(em);
		
		Transaction ts=ss.beginTransaction();
		ts.commit();
		System.out.println("data savad");
		ss.close();	
	  
	}

static void update() 
	{
		Scanner sc=new Scanner(System.in);
		Transaction ts=ss.beginTransaction();
		System.out.println("Enter Employe Id");
		empId=sc.nextInt();
		Object o=ss.get(GovtEmploye.class,new Integer (empId));
		GovtEmploye  gm=(GovtEmploye)o;
		System.out.println("Enter Employe Name");
		empName = sc.next();
		System.out.println("Enter Employe Sallary");
		empSall = sc.nextInt();
		System.out.println("Enter Employe Address");
		address = sc.next();
		gm.setEmpId(empId);
		gm.setEmpName(empName);
		gm.setEmpSall(empSall);
		gm.setAddress(address);
		ss.update(gm);
		
		ts.commit();
		ss.close();
	}

static void Delete() 
	{
		Scanner sc=new Scanner(System.in);
		Transaction ts=ss.beginTransaction();
		System.out.println("Enter Employe Id For Delete");
		empId=sc.nextInt();
        Object o= ss.get(GovtEmploye.class, new Integer(empId));
		GovtEmploye gm=(GovtEmploye)o;
		ss.delete(gm);
		ts.commit();
		ss.close();
			}
	
static void Select() {
		Query q = ss.createQuery("from GovtEmploye sv");
		List st = q.list();
		Iterator it = st.iterator();
		while (it.hasNext()) {
		GovtEmploye s = (GovtEmploye) it.next();
		System.out.println("Student empId is  " + s.getEmpId()+ "," + "empName  is  "
					
				+ s.getEmpName() + "," + "empSall is   " + s.getEmpSall() + ","
					+ "address   is   " + s.getAddress());
		}
		}
	static	void ColectionClose() {
			ss.close();
		}

		public static void main(String[] args) {
		conection();
		insertData();
		//update();
	//Delete();
	//Select();
		}
}
