package com.oneToMany.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class EmpAddMain {

	public static void main(String []args) 
	{
		System.out.println("hello");
		
		Configuration cfg=new Configuration();
		cfg.configure("empAdd.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		
		Employe em=new Employe();
		em.setEmpId(1126);
		em.setEmpName("yogesh");
		em.setEmpSall(150000000);
		
		Address ad=new Address();
		ad.setAddName("mukhrjinagar");
		ad.setAddNum(229);
		ad.setCity("dewas");
		
		Address ad1=new Address();
		ad1.setAddName("rajaraminagar");
		ad1.setAddNum(131);
		ad1.setCity("dewas");
		
		/*
		 * Set st = new HashSet<Address>(); st.add(ad); st.add(ad1);
		 */
		/* em.setAdd(st); */
			Transaction ts=s.beginTransaction();
			s.save(em);
			ts.commit();
			
		System.out.println("Data Savad ");
			s.close();
            sf.close();		
		
	}
	
	
}
