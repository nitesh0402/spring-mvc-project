package com.ManyToOne.Anotaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CllsStuMain {

	public static void main(String []args) 
	{
		
		Configuration cfg=new Configuration();
		cfg.configure("manyToOneclsStu.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		
		ClassEx cl=new ClassEx();
		cl.setcNum(101);
		cl.setcName("bhagatshingh");
		
		StudentEx st=new StudentEx ();
		st.setsRno(1122);
		st.setSame("nitesh");
		st.setClassex(cl);

		StudentEx st1=new StudentEx ();
		st1.setsRno(1122);
		st1.setSame("nitesh");
		st1.setClassex(cl);
		
		Transaction ts=ss.beginTransaction();
		
		ss.save(st);
		ss.save(st1);
		ts.commit();
		System.out.println("Data Saved");
		ss.close();
		sf.close();
		
		
	}
	
	
	
}
