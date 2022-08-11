package OverRiding;

public class OverLoding {



	void add(int a,int b) 
	{
		
	 
	int c=a+b;
System.err.println(c);		
	}

void add(int a,Double b) 
{
 
Double c =a+b;

System.out.println(c);
}
public static void main(String []args) 
{
OverLoding obj=new OverLoding();
obj.add(10, 4.5);
obj.add(10, 4);
}

}

