package CrudPackage2;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import java.util.Iterator;

public class SvmStudentMain {

	static SessionFactory sf;
	static Session ss;
	static Scanner sc = new Scanner(System.in);
	static String StudentName;
	static int StudentRollNum, SchoolCode, StudentClassNumber;

	static void Connection() {
		Configuration cfg = new Configuration();
		cfg.configure("svmStudent.cfg.xml");
		sf = cfg.buildSessionFactory();
		ss = sf.openSession();

	}

	static void insertData() {
		Scanner sc = new Scanner(System.in);

		String StudentName;
		int StudentRollNum, SchoolCode, StudentClassNumber;
		Transaction ts = ss.beginTransaction();

		System.out.println("Enter Student RollNUmber");
		StudentRollNum = sc.nextInt();

		SvmStudent s = new SvmStudent();
		System.out.println("Enter Student name");
		StudentName = sc.next();
		System.out.println("Enter School Code");
		SchoolCode = sc.nextInt();
		System.out.println("Student Class Number");

		StudentClassNumber = sc.nextInt();
		s.setStudentName(StudentName);
		s.setStudentRollNum(StudentRollNum);
		s.setSchoolCode(SchoolCode);
		s.setStudentClassNumber(StudentClassNumber);
		System.out.println(s);
		ss.save(s);
		ts.commit();
		System.out.println("data saved successfully");
	}

	static void updateOpretion() {

		Scanner sc = new Scanner(System.in);

		String StudentName;
		int StudentRollNum, SchoolCode, StudentClassNumber;
		Transaction ts = ss.beginTransaction();
		System.out.println("Enter Student RollNUmber");
		StudentRollNum = sc.nextInt();
		Object o = ss.get(SvmStudent.class, new Integer(StudentRollNum));
		{
			SvmStudent s = (SvmStudent) o;
			System.out.println("Enter Student name");
			StudentName = sc.next();
			System.out.println("Enter School Code");
			SchoolCode = sc.nextInt();
			System.out.println("Student Class Number");

			StudentClassNumber = sc.nextInt();
			s.setStudentName(StudentName);
			s.setStudentRollNum(StudentRollNum);
			s.setSchoolCode(SchoolCode);
			s.setStudentClassNumber(StudentClassNumber);
			ss.update(s);
			ts.commit();
		}

	}

	static void Delete() {
		Scanner sc = new Scanner(System.in);
		String StudentName;
		int StudentRollNum, SchoolCode, StudentClassNumber;
		Transaction ts = ss.beginTransaction();
		System.out.println("Enter delete Student RollNumber");
		StudentRollNum = sc.nextInt();
		Object o = ss.get(SvmStudent.class, new Integer(StudentRollNum));
		SvmStudent s = (SvmStudent) o;
		ss.delete(s);
		ts.commit();
	}

	static void Select() {
		Query q = ss.createQuery("from SvmStudent sv");
		List<SvmStudent> st = (List<SvmStudent>)q.list();
		Iterator it = st.iterator();
		while (it.hasNext()) {
			SvmStudent s = (SvmStudent) it.next();
			System.out.println("Student RollNumber is  " + s.getStudentRollNum() + "," + "Student Name is  "
					+ s.getStudentName() + "," + "SchoolCode is   " + s.getSchoolCode() + ","
					+ "Student Class Number is   " + s.getStudentClassNumber());
		}

	}

	/*
	 * static void Intsirction() {
	 * 
	 * Transaction ts = ss.beginTransaction();
	 * System.out.println("Enter Student RollNumber"); StudentRollNum =
	 * sc.nextInt(); Object o = ss.get(SvmStudent.class, new
	 * Integer(StudentRollNum)); if (o == null) {
	 * 
	 * System.out.println("Enter Student name"); StudentName = sc.next();
	 * System.out.println("Enter School Code"); SchoolCode = sc.nextInt();
	 * System.out.println("Student Class Number"); StudentClassNumber =
	 * sc.nextInt();
	 * 
	 * SvmStudent s = new SvmStudent(); s.setStudentName(StudentName);
	 * s.setStudentRollNum(StudentRollNum); s.setSchoolCode(SchoolCode);
	 * s.setStudentClassNumber(StudentClassNumber);
	 * 
	 * ss.save(s); System.out.println("data saved"); ts.commit(); }
	 * 
	 * else
	 * 
	 * { System.out.println("this SvmStudent present alredy for jdbc"); }
	 * 
	 * }
	 */
	static void ColectionClose() {
		ss.close();
	}

	public static void main(String[] args) {
		Connection();
		 insertData();
		// updateOpretion();
		// Delete();
		// Select();
		ColectionClose();

	}

}
