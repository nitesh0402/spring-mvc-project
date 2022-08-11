package StuH;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import JobInfo.Job;

public class stuCrud {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jobid;
		String jobtitle;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
	    System.out.println("Enter job id ");
	    jobid = sc.nextInt();
	    System.out.println("Enter job title");
	    jobtitle = sc.next();
	    Job obj = new Job();
	    obj.setJobid(jobid);
	    obj.setJobtitle(jobtitle);
	    s.save(obj);
	    tx.commit();
	    s.close();

	}

}
