package SPExample;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import org.springframework.beans.factory.BeanFactory;

public class EmployeMain {

	public static void main(String []args) 
	{
	Resource res= new ClassPathResource("Employe.xml");
	BeanFactory bf=new XmlBeanFactory(res);
	Employe em=(Employe)bf.getBean("stu");

em.Display(123, "nitesh");		
		
	}
	
}
