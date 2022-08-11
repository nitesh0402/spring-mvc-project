package SpringEx;

public class Student1 {
private String name;
private int rno;
Student1()
{
this.name="nitesh";	
}
Student1(String name,int rno )
{
this.name=name;
this.rno=rno;
}

void show() 
{
System.out.println(this.name);	
System.out.println(this.rno);
}
}
