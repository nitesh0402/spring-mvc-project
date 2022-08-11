package SPExample;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class StudentMain {

public static void main(String[]args) 
{
Resource res=new ClassPathResource("Student.xml");
BeanFactory bf= new XmlBeanFactory(res);
SpStudent obj=(SpStudent)bf.getBean("stu");
obj.Display(1122, "nitesh");

}	
	
	
}
