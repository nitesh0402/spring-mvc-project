package com.hospital.example;
//import java.util.List;
import java.util.Iterator;
import java.util.List;
import org.hibernate.*;
import java.util.ListIterator;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

//import javassist.bytecode.Descriptor.Iterator;
public class PetientProjection {
	
	public static void main(String []args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction ts=s.beginTransaction();
		Criteria ct=s.createCriteria(Petient.class);
		ct.setProjection(Projections.property("roomNum"));
		List lst=ct.list();
		Iterator it = lst.iterator();
		  while(it.hasNext())
		{
		
		
		
		{
			Object o=it.next();
			System.out.println(o);
			
		}
	
	sf.close();
	}
	
	

	}
}