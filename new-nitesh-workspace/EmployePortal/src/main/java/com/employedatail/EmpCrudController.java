package com.employedatail;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class EmpCrudController {

	
	@RequestMapping(method=RequestMethod.GET,value=("/empragistaction"))
	 
	public ModelAndView insertData(HttpServletRequest req,HttpServletResponse res)
	{
	ModelAndView mv=new ModelAndView();

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


	mv.addObject("isDetail");
	return mv;
	
}}
