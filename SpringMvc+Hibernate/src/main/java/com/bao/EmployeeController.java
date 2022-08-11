package com.bao;


import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
	
	@Controller

	public class EmployeeController {

		@RequestMapping("emp")

	    public ModelAndView additon(){

	    	return new ModelAndView("empview","command",new Emp());

	    }

		@RequestMapping(value="empinsert",method = RequestMethod.POST)

	    public ModelAndView additonLogic(@ModelAttribute("Spring-MVC-Addition")Emp s){

			Configuration cfg = new Configuration();

			cfg.configure("hibernate.cfg.xml");

			SessionFactory sf = cfg.buildSessionFactory();

			Session sess = sf.openSession();

			Transaction tx= sess.beginTransaction();

			sess.save(s);

			tx.commit();

			sess.close();

			ModelAndView obj=new ModelAndView("empview","command",new Emp());

			obj.addObject("res", "Data Inserted Successfully ");

	    	return obj;

	    }

	}
	
	

