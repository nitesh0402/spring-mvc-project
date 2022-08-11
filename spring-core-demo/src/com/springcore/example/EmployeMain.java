package com.springcore.example;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EmployeMain {

	public static void main(String []args) 
	{
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("employe.xml");
		
		Employe em=new Employe();
		
		em.Display(123, "nitesh", 150000);
		
	}
	
	
}
