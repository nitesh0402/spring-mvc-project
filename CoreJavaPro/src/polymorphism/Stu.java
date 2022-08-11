package polymorphism;

public class Stu extends Student {

	void stuDataill() 
	{
		int  a = 10;
		int  b = 4;
	    int  c = a - b;
	System.out.println("result is "+c);	
	}
	
	public static void main(String []args) 
	{
		
		//Student obj=new Student();
		//obj.stuDatail();
		
		//Stu obj1=new Stu();
		//obj1.stuDataill();
		Student s=new Stu();
		s.stuDatail();
	
		
		
	}
}
