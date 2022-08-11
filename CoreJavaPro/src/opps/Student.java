package opps;

public class Student {

int srno;
String sname;
void Detail(int srno,String sname) 
{
this.srno=srno;
this.sname=sname;
}
void Display(int srno,String sname) 
{
	this.srno=srno;
	this.sname=sname;
	System.out.println("student roll number "+srno);	
	System.out.println("student name is "+sname);
	
	}
	
	
}
