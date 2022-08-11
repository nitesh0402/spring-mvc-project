package com.employedatail;
import java.util.Scanner;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmployeController {

 
@RequestMapping(method=RequestMethod.GET,value=("/empragistaction"))
 
public ModelAndView insertData(HttpServletRequest req,HttpServletResponse res)
{
ModelAndView mv=new ModelAndView("empShow");

Configuration cfg=new Configuration();
cfg.configure("employehibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session ss=sf.openSession();
int empId=Integer.parseInt(req.getParameter("empId"));
String empName=req.getParameter("empName");
int empSall=Integer.parseInt(req.getParameter("empSall"));
String empAdd=req.getParameter("empAdd");
Transaction ts=ss.beginTransaction();

EmployePojo ep=new EmployePojo();
ep.setEmpId(empId);
ep.setEmpName(empName);
ep.setEmpSall(empSall);
ep.setEmpAdd(empAdd);

ss.save(ep);
ts.commit();
System.out.println("Data Savad");


mv.addObject("isDetail", "Data saved Susccesfuly");
return mv;

}

@RequestMapping (method=RequestMethod.GET,value=("/empSelect"))
public ModelAndView select(HttpServletRequest req,HttpServletResponse res)
{
	ModelAndView mv=new ModelAndView("selectdata");

	Configuration cfg=new Configuration();
	cfg.configure("employehibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	
	EmployePojo em=new EmployePojo();
	
	Query q=ss.createQuery("From EmployePojo empp");
		List <EmployePojo>emp=(List<EmployePojo>)q.list();
	System.out.println("select data is+emp");
	mv.addObject("selectis",emp);
	
return mv;

}


@RequestMapping(method=RequestMethod.GET,value=("/empupdate"))
public ModelAndView updatedata(HttpServletRequest req,HttpServletResponse res) 
{  
	int empID;
	
	Scanner sc=new Scanner(System.in);
 
	ModelAndView mv=new ModelAndView("updateemp");
	
Configuration cfg=new Configuration();
cfg.configure("employehibernate.cfg.xml");
SessionFactory sf=cfg.buildSessionFactory();
Session ss=sf.openSession();
Transaction t=ss.beginTransaction();
System.out.println("Emter empoye ID");
empID=sc.nextInt();
Object o=ss.get(EmployePojo.class,(empID));
EmployePojo em=(EmployePojo)o;
em.setEmpAdd("Delhi");
em.setEmpName("Mohan");

mv.addObject("isupdate",o);
ss.update(em);
t.commit();
//ss.save(em);
return mv;
}


}


