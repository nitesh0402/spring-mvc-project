package com.oneToMany.exaple2;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.oneToMany.exaple2.Customer;

//import org.hibernate.*;
//import org.hibernate.cfg.Configuration;
public class VCMaping {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("venCust.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Customer c1 = new Customer();
		c1.setCustomerid(1125);
		c1.setCustomername("arti");
		Customer c2 = new Customer();
		c2.setCustomerid(126);
		c2.setCustomername("maya");
		Vendor v = new Vendor();
		v.setVid(12347);
		v.setVname("mahiS");
		Set st = new HashSet<Customer>();
		st.add(c1);
		st.add(c2);
		v.setFokey(st);
		Transaction ts = s.beginTransaction();
		s.save(v);
		ts.commit();
		System.out.println("Data Savad ");
	}
}
