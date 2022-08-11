package OverRiding;

public class DemoNext extends Demo {

	void add(int a,int b) 
	{
		
		int c=a*b;
		System.out.println(""+c);
		System.out.println("i am Child class");
	}
	
	public static void main(String[] args) {
		Demo obj= new Demo();
		obj.add(100, 400);
		
		DemoNext obj1=new DemoNext();
		
		obj1.add(10,4);
	Demo obj3=new DemoNext();
	obj3.add(10, 4);
		
		
	}
	
}
