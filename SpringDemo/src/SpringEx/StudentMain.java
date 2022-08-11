package SpringEx;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class StudentMain {

	public static void main(String []args) 
	{
		
		Resource res=new ClassPathResource("Student.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Student s=(Student)bf.getBean("stu");
		s.setsRno(1122);
		s.setsName("nitesh");
		System.out.println(s.getsName());
		System.out.println(s.getsRno());

	}
	
}
