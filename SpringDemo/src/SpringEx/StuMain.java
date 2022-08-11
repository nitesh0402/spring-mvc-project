package SpringEx;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StuMain {

	public static void main(String[]args) 
	{
		Resource res=new ClassPathResource("stu.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		Student1 s1= (Student1)bf.getBean("s");
		s1.show();
	}
}
