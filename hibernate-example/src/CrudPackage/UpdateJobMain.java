package CrudPackage;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import JobInfo.Job;

public class UpdateJobMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int jobid;
		String jobtitle;
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
	    SessionFactory sf = cfg.buildSessionFactory();
	    Session s = sf.openSession();
	    Transaction tx = s.beginTransaction();
	    System.out.println("Enter job id to find record");
	    jobid = sc.nextInt();
	    Object o = s.get(Job.class, new Integer(jobid));
	    Job obj = (Job)o;
	    
	    obj.setJobid(jobid);
	    System.out.println("Enter job title");
	    jobtitle = sc.next();
	    obj.setJobtitle(jobtitle);
	    s.update(obj);
	    tx.commit();
	    s.close();

	}

}
