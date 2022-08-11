package com.onetomanyA;
import org.hibernate.*;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import org.hibernate.cfg.Configuration;

//import svm.Student;
public class OneToManyMain {
public static void main (String []args) 
{
Configuration cfg=new Configuration();
cfg.configure("hibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session s=sf.openSession();
Company c1=new Company();
c1.setComId(1122);
c1.setComName("Chitransh");
Company c2=new Company();
c2.setComId(1123);
c2.setComName("man");
Employe e=new Employe();
e.setEmpId(1125);
e.setEmpName("Dishu");
Set st= new HashSet<Employe>();
st.add(c1);
st.add(c2);
st.add(e);
c1.setForkey(st);
Transaction ts=s.beginTransaction();
s.save(e);
//s.save(c1);
//s.save(c2);
ts.commit();
s.close();

}
}
