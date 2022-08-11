package inheritance;

public class School extends Student {
	
	void DetailMain() 
	{
	   int  rno = 12345;
	   String name =  "manish";
    System.out.println("student roll number is"+rno);
    System.out.println("student name  is"+name);
	
	
	}
	
public static void main(String []args) 
{

	School obj=new School();
	obj.Detail();
	obj.Detail();
}

}