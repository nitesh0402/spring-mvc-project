package DepencyWithCostrotor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EnployeMain {

public static void main(String []args) 
{
	
  ClassPathResource res = new ClassPathResource("dependencyConstroctor.cfg.xml");
  BeanFactory bf=new XmlBeanFactory(res);
  
  Employe em=(Employe)bf.getBean("obj");
  
em.Show();
}	
}
