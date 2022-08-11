package OverRiding;

public class Child extends Parent{

	int i;
	void m1()
	{
int i=super.a;		
int j=super.b;
int c=i+j;
		System.out.println("Hello I am child m1 "+c);
	}
	
	public static void main(String[] args) {
		Child c=new Child();

		c.m1();
		
	}


	
	
}
