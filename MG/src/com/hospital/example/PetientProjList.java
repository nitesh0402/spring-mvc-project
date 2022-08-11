package com.hospital.example;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import java.util.Iterator;
import java.util.List;
//import javassist.bytecode.Descriptor.Iterator;

import java.util.List;
import java.util.Scanner;

public class PetientProjList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
		Criteria ct = s.createCriteria(Petient.class);
		ProjectionList p = Projections.projectionList();
		p.add(Projections.property("roomNum"));
		p.add(Projections.property("moNum"));
		p.add(Projections.property("petientName"));
		p.add(Projections.property("disease"));
		ct.setProjection(p);
		List lst = ct.list();
		Iterator it = lst.listIterator();
		for (Object o1 : lst) {

			Object o[] = (Object[]) o1;
			System.out.println(o[0] + "   " + o[1] + "   " + o[2] + "   " + o[3]);
		}
		s.close();
		sf.close();
	}

}
