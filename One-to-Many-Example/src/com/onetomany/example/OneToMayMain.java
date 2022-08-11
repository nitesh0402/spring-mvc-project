package com.onetomany.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToMayMain {

	public static void main(String[] args) {

		testOneToMany();
	}

	static void testOneToMany() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		List<Course> listCourse = new ArrayList();

		Course c1 = new Course();
		c1.setCourseId(11);
		c1.setCourName("maths");

		Course c2 = new Course();
		c2.setCourseId(102);
		c2.setCourName("science");

		Course c3 = new Course();
		c3.setCourseId(103);
		c3.setCourName("english");

		listCourse.add(c1);
		listCourse.add(c2);
		listCourse.add(c3);

		Student stu = new Student();
		stu.setStuRoll(12);
		stu.setName("Nitesh");

		stu.setCourse(listCourse);

		s.save(stu);
		tx.commit();

		s.close();

	}

}
