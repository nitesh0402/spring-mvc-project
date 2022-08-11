package com.hospital.example;

import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class PetientUpdate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int roomNum, moNum;
		String petientName, disease;

		Configuration cfg = new Configuration();
		cfg.configure("Hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction ts = s.beginTransaction();
		System.out.println("Enter roomNumber");
		roomNum = sc.nextInt();
		Object o = s.get(Petient.class, new Integer(roomNum));
		Petient obj = (Petient) o;
		obj.setRoomNum(roomNum);
		System.out.println("Enter rommMun");
		roomNum = sc.nextInt();
		obj.setRoomNum(roomNum);
		s.update(obj);
		ts.commit();
		s.close();
	}

}
