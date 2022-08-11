package overriding;

public class Child extends Parent{

	
	public void display()
	{
		System.out.println("I ma display method of child class");
		
	}
	
	
	public static void main(String[] args) {
		
Parent p=new Parent();
//p.bill();
//p.display();
Child c=new Child();
//c.bill();
//c.display();


Parent p1=new Child();
p1.bill();
p1.display();

Child c1=new Parent();
Double i=new Integer(9);




		
	}
	
}
