package SPExample;

public class Employe {

private int srno;
private String sname;

	Employe(int srno,String sname)
	{
		this.srno=srno;
		this.sname=sname;
	}
	void Display( int srno,String sname) 
	{
		this.srno=srno;
		this.sname=sname;
		System.out.println("Student Roll number is "+srno);
		System.out.println("Student name is "+sname);
}
}
