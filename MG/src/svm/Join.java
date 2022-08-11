package svm;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.*;
public class Join {

	public static void main(String[] args) {
		  Configuration cfg = new Configuration();
		  cfg.configure("hibernateA.cfg.xml");
		  SessionFactory sf = cfg.buildSessionFactory();
		  Session s = sf.openSession();
		  Query q = s.createQuery("select co.sid ,co.sname ,s1.fees from Corse co inner join co.children c");
		  List lst = q.list();
		  Iterator it = lst.iterator();
		  while(it.hasNext())
		  {
		   Object arr[] = (Object[])it.next();
		   System.out.println(arr[0] +" "+arr[1]);
		  }

		 }

		}
	
	

