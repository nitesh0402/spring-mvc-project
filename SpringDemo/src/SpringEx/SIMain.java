package SpringEx;
import SpringEx.SILogic;
import SpringEx.SI;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;

public class SIMain {

	public static void main(String []args) 
	{
		Resource res=new ClassPathResource("SI.xml");
		BeanFactory bf=new XmlBeanFactory(res);
		SI s=(SI)bf.getBean("si");
		float output=new SILogic().calculate(s.getP(),s.getR(),s.getT());
		System.out.println(output);
		
		
	}
	
}
