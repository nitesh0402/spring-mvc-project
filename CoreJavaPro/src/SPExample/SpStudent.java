package SPExample;

public class SpStudent {

	private int srno;
	private String sname;
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	void Display(int srno, String  sname) 
	{
		this.srno=srno;
		this.sname=sname;
		
		System.out.println("Studennt Roll Number is "+srno);
		System.out.println("Student name is "+sname);
		
	}
	
	
}
