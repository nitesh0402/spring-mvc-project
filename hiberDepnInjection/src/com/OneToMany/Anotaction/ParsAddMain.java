package com.OneToMany.Anotaction;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
//import org.hibernate.mapping.Set;

public class ParsAddMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("ParsAdd.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Address ad = new Address();
		ad.setAddNum(227);
		ad.setName("mukhrjinagar");

		Parsan p = new Parsan();
		p.setpId(1112);
		p.setpName("nitesh");

		Parsan p1 = new Parsan();
		p1.setpId(1122);
		p1.setpName("nitesh");

		Set st = new HashSet<>();
		st.add(p);
		st.add(p1);
		ad.setParsnref(st);
		Transaction tx = ss.beginTransaction();
		ss.save(ad);

		tx.commit();
		System.out.println("hello");
		ss.close();
		sf.close();

	}

}
