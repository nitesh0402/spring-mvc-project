package com.spring.example;

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

//import scs.dao.Student;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.springMvc.*;
@Controller
public class StudentController {

	@RequestMapping(method = RequestMethod.GET, value = ("/stuDetail"))
	public ModelAndView Detail(HttpServletRequest req, HttpServletResponse response) {

		ModelAndView mv = new ModelAndView("StudentView");

		Student s = new Student();

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();

		int rollNum = Integer.parseInt(req.getParameter("rollNum"));

		String name = req.getParameter("name");

		s.setRno(rollNum);
		s.setSname(name);
		ss.save(s);
		ts.commit();
		
		System.out.println("data saved");
		mv.addObject("isDetail", "Data saved Susccesfuly");
		// mv.addObject("isDetailList" + st);

		return mv;

	}

	@RequestMapping(method = RequestMethod.GET, value = "/fetchStudents")
	
	public ModelAndView fetchStudentRecords() 
	{
        ModelAndView mv = new ModelAndView("result");
        Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Query q = ss.createQuery("From Student s");
		List<Student> st = (List<Student>) q.list();
		System.out.println("fetched data  " + st);
		mv.addObject("studentRecord", st);
		return mv;
    }

	
	@RequestMapping(method = RequestMethod.GET, value = "/DeleteStudent")
	
	public ModelAndView DeleteStudentRecord() {
		int rno;
		Scanner sc = new Scanner(System.in);
        ModelAndView mv = new ModelAndView("DeleteResult");

		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction ts = ss.beginTransaction();
		System.out.println("Enter delete id ");
		rno = sc.nextInt();

		Object o = ss.get(Student.class, new Integer(rno));
		Student obj = (Student) o;
		mv.addObject("Deletereocord", o);
		ss.delete(o);
		ts.commit();
		// ss.close();

		return mv;
	}

	@RequestMapping(method = RequestMethod.GET, value = "/si")
	public ModelAndView siload() {
		int p,r,t;
		
		Si s=	new Si(1000,12,2);

		
	double si=s.getP()*s.getR()*s.getT()/100;
	
		return new ModelAndView("siform", "simpleInterest", si);
	}

}
