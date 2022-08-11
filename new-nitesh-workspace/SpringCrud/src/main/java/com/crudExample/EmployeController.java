package com.crudExample;

import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

@Controller
public class EmployeController {

	@RequestMapping(method = RequestMethod.GET, value = ("/Insert"))
	public ModelAndView insertdemo(HttpServletRequest req, HttpServletRequest res) {

		ModelAndView mv = new ModelAndView("show");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		int empId = Integer.parseInt(req.getParameter("empId"));
		String empName = req.getParameter("empName");
		int empSall = Integer.parseInt(req.getParameter("empSall"));
		Employe em = new Employe();
		em.setEmpId(empId);
		em.setEmpName(empName);
		em.setEmpSall(empSall);

		ss.save(em);
		ts.commit();
		System.out.println("Data Saved");
		mv.addObject("isinsert", "Data Saved Sacusece");
		return mv;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/DeleteempRecord")
	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res) {

		ModelAndView mv = new ModelAndView("DeleteData");

		Scanner sc = new Scanner("System.in");
		int empId = Integer.parseInt(req.getParameter("empId"));
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		Employe em = new Employe();

		System.out.println("Enter empId for delete");
		// empId=sc.nextInt();
		Object o = ss.get(Employe.class, new Integer(empId));
		Employe emp = (Employe) o;
		// emp.setEmpId(0);
		mv.addObject("isDelete", o);
		ss.delete(o);
		ts.commit();
		System.out.println("data delete sucessesce");
		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/Select")
	public ModelAndView SelectData() {

		ModelAndView mv = new ModelAndView();

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		Query q = ss.createQuery(" from Employe em");
		List<Employe> st = (List<Employe>) q.list();
		System.out.println("Enter Fetch employe Data" + st);
		mv.addObject("EmployeRecord", st);
		return mv;

	}
	@RequestMapping(method Requestmathod.GET,value="/updateData");
	public ModelAndView update() 
	{ 
		ModelAndView mv=new ModelAndView("update");
		
		Configuration cfg=new Configuration ();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction ts=ss.beginTransaction();
		
		int empId=ss.get
		
		
		
		
	}

}
