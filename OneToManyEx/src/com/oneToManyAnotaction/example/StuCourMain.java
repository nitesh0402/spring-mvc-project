package com.oneToManyAnotaction.example;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class StuCourMain {

	public static void main(String[] args) {
		
		System.out.println("hello");
		Configuration cfg = new Configuration();
		cfg.configure("StuCourse.cfg.xml");
		SessionFactory sf =cfg.buildSessionFactory(); 
		Session ss = sf.openSession();

		Course c = new Course();

		c.setcNum(1);
		c.setCName("java");
		c.setcCode(101);

		Student s = new Student();

		s.setsRNum(1123);
		s.setsName("man");
		s.setSClassNum(6);

		Student s1 = new Student();

		s1.setsRNum(1124);
		s1.setsName("yogesh");
		s1.setSClassNum(7);

		Set st = new HashSet<>();
		st.add(s);
		st.add(s1);
		c.setSturef(st);

		Transaction ts = ss.beginTransaction();
		ss.save(c);
		ts.commit();
		System.out.println("data saved");
		ss.close();
		sf.close();
	//	new AnnotationConfiguration().configure().buildSessionFactory();
	}

}
