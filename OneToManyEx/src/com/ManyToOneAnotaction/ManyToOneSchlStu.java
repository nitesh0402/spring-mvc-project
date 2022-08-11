package com.ManyToOneAnotaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOneSchlStu {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("ManyToOne.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();

		Student s1 = new Student();

		s1.setsRollNumber(1122);
		s1.setsName("nitesh");

		School s2 = new School();

		s2.setSchlCode(12345);
		s2.setSchlName("svm m ngr ");
		s2.setSturef(s1);

		School s3 = new School();

		s3.setSchlCode(123456);
		s3.setSchlName("svm v ngr");
		s3.setSturef(s1);
		
		Transaction ts=ss.beginTransaction();
		ss.save(s2);
		ss.save(s3);
		ts.commit();
		System.out.println("Data savad");
		ss.close();
		sf.close();
		
		
	}

}
