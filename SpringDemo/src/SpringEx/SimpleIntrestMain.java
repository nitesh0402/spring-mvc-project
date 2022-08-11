package SpringEx;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class SimpleIntrestMain {

public static void main(String []args) 
{


Resource res=new ClassPathResource("SimpleIntrest1.xml");
BeanFactory bf=new XmlBeanFactory(res);
//Student1 s1= (Student1)bf.getBean("s");

SimpleIntrest S=(SimpleIntrest)bf.getBean("si");
S.calculate();

}	
}
