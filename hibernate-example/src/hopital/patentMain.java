package hopital;


import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;


import java.util.Scanner;
public class patentMain {
	public static void main(String[] args) {
		
		 String hName;
		 String pName;
		 int pRoonNum; 
		 String pDessece;
		 String pAddress;
		
		
		int Empid, sell;
		String Dpatment, Empname;
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
		System.out.println("Enter Patent Room number");
		pRoonNum=sc.nextInt();
		System.out.println("Enter patent name");
		pName=sc.next();
		System.out.println("Enter hospital name");
		hName=sc.next();
		System.out.println("Enter Patent Dessece name");
		pDessece=sc.next();
		System.out.println("Enter Patent Address");
		pAddress=sc.next();
		System.out.println("Data save sucssce fully");
		
   patent pt = new patent();
   pt.setpRoonNum(pRoonNum);
   pt.setpName(pName);
   pt.sethName(hName);
   pt.setpDessece(pDessece);
   pt.setpAddress(pAddress);
   
   
   s.save(pt);
   ts.commit();

   
   
   
   
}	
	
	
}
