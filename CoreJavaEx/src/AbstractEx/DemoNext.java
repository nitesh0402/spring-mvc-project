package AbstractEx;

public class DemoNext extends Demo{

	void add(int a,int b) 
	{
	int c=a+b;
	
	System.out.println("add is "+c);
		
	}
	
	void Divide (int a,int b) 
	{
		
		int c=a/b;
		
		System.out.println("Divide is "+c);

		
	} 
	public static void main(String []args) 
	{
		
		Demo obj=new DemoNext();
		
		obj.add(10, 4);
		obj.multiplye(10, 4);
		
		DemoNext obj1=new DemoNext();
		obj1.Divide(40, 4);
		
	}
	
}
