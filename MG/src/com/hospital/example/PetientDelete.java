package com.hospital.example;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

//import scs.Job;

import java.util.Scanner;
public class PetientDelete {

	public static void main(String []args) 
	{ 
		int roomNum,moNum;
		String petientName,desease;
		Scanner sc=new Scanner(System.in);
       Configuration cfg =new Configuration();
		cfg.configure("Hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session s=sf.openSession();
        Transaction ts=s.beginTransaction();
        System.out.println("Enter Petient RoomNumber");
        petientName=sc.next();
        System.out.println("Record Delete Sucsscefully");
        Object o=s.get(Petient.class, new Integer(petientName));
        Petient obj=(Petient)o;
        s.delete(obj);
        ts.commit();
        s.close();

	
	
	
	}
	
	
}


