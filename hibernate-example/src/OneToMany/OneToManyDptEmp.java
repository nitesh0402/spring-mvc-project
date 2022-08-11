package OneToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToManyDptEmp {

	public static void main (String []args) 
	{
	Configuration cfg=new Configuration();
	cfg.configure("OneToMany.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	
	Dept obj=new Dept();
	obj.setDptid(1122);
	obj.setDptname("nitesh");
	Employe obj1=new Employe();
	obj1.setEmpId(123);
    obj1.setEmpName("chitransh");
	
	Employe obj2=new Employe();
	obj2.setEmpId(12345);
	obj2.setEmpName("dhishu");
	
	Set st=new HashSet();
	st.add(obj1);
	st.add(obj2);
	obj.setEmpref(st);
	Transaction ts=ss.beginTransaction();
	ss.save(obj);
	ts.commit();
	ss.close();
	sf.close();

	
	
		
		
		
	}
	
	
}
