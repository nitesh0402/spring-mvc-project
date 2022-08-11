package bao;
import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.Transaction;

import org.hibernate.cfg.Configuration;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class EmpController {

	@RequestMapping()

	   public ModelAndView additonLogic(@ModelAttribute("MvcHIbernate")Emp s){
	
	Configuration cfg = new Configuration();

	cfg.configure("hibernate.cfg.xml");

	SessionFactory sf = cfg.buildSessionFactory();

	Session sess = sf.openSession();

	Transaction tx= sess.beginTransaction();

	sess.save(s);

	tx.commit();

	sess.close();
	ModelAndView obj=new ModelAndView("showView","command",new Emp());
	
	obj.addObject("res","Data Saved ");

	return obj;
	
	}
	}

