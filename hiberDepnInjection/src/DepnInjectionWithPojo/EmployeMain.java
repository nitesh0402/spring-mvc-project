package DepnInjectionWithPojo;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
public class EmployeMain {

	public static void main(String []args) 
	{
		Resource r=new ClassPathResource("dependency.cfg.xml");
        BeanFactory sf=new XmlBeanFactory(r);  
		Employe em= (Employe)sf.getBean("obj");
		em.display();
		
	}
	
}
