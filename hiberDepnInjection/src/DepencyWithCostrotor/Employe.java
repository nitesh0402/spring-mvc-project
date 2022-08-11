package DepencyWithCostrotor;

public class Employe {
	
	private	int eID;
	
	
    private	String eName;
	private  int eSell;
	
	Employe(int eID,String eName,  int eSell)
	{
	
		this.eID=eID;
		this.eName=eName;
		this.eSell=eSell;
	}

	public int geteID() {
		return eID;
	}

	public void seteID(int eID) {
		this.eID = eID;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSell() {
		return eSell;
	}

	public void seteSell(int eSell) {
		this.eSell = eSell;
	}
	
	void Show() 
	{
		
		System.out.println(eID+" "+eName+" "+eSell);
		
	}
	
}
