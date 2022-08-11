package com.bao;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
public class StudentController {
	
	
	
@RequestMapping("add")
ModelAndView GetDetail(@ModelAttribute("SpringMvc+Hibernate")Student s,ModelMap model) 
{
//	ModelAndView mv=new ModelAndView();
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction ts= ss.beginTransaction(); 
	//Student s=new Student();
	//s.setSchoolName(null);
	ss.save(s);
	ts.commit();
	ss.close();
	
	model.addAttribute("key","Recored Insert successfully");
	

	

	return new ModelAndView("isDetail","command",new Student());
	
	//mv.addObject("isDetail","res"+s);
//	return mv;
	
	 

}
	
	
}
