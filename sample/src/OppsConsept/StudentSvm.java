package OppsConsept;

public class StudentSvm extends SchoolSvm {

	void Detailsvm(int Rno,String Sname) 
	{
		this.Rno=Rno;
		this.Sname=Sname;	
		System.out.println(Rno);
		System.out.println(Sname);
	}
	public static  void main(String []args) {
		
	

		SchoolSvm obj=new SchoolSvm();
        //StudentSvm obj=new StudentSvm();
		
		obj.Detail(1122, "Nitesh");
//obj.Detailsvm(1123, "Chitransh");
	}	
}
