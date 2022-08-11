package com.hospital.example;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration; 
public class PetientMain {
  
	public static void main(String []args) 
	{
	int roomNo;String petientName,disease;
	int moNum;
	Scanner sc = new Scanner (System.in);
	Configuration cfg=new Configuration();
	cfg.configure("Hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction ts=s.beginTransaction();
	
	System.out.println("Enter Petient Admit RoomNumber");
	roomNo=sc.nextInt();
	System.out.println("Enter Petient Name");
	petientName=sc.next();
	System.out.println("Enter Petient Disease");
	disease=sc.next();
	System.out.println("Enter Petient Mobile Number");
	moNum=sc.nextInt();
	System.out.println("Detail is Fulfill");
	Petient obj=new Petient();
	obj.setRoomNum(roomNo);
	obj.setPetientName(petientName);
	obj.setDisease(disease);
	obj.setMoNum(moNum);
	s.save(obj);
	ts.commit();
	s.close();
	
	
	}
	
}
