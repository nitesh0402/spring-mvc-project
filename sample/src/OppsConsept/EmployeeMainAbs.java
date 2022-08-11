package OppsConsept;

public class EmployeeMainAbs extends EmployeeAbs {
	void add(int a,int b) 
	{
	int c=a+b;	
	System.out.println(c);
	}


public static void main(String []args) 
{
EmployeeAbs obj=new EmployeeMainAbs();	
obj.add(10, 15);
obj.Multiplye(10, 12);
}
}

