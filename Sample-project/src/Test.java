import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class Test {

	
	public static void main(String[] args) {
		Student s=new Student();
		//s.setName("");
		List<Student> li=new ArrayList<>();
		li.add(s);
		
		
		System.out.println(StringUtils.isEmpty(li.get(0).getName().trim()));
	}
}
