package svm;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernateA.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Student s1 = new Student();
		s1.setFees(1200);
//s1.setSname("nitesh");
		s1.setStuId(1122);
		Corse co = new Corse();
		co.setsId(1123);
		co.setsName("verma");
		Set st = new HashSet<Student>();
		st.add(s1);
		st.add(co);
		co.SetSub(st);
		Transaction tx = s.beginTransaction();
		s.save(co);
		tx.commit();
		s.close();
	}

}
