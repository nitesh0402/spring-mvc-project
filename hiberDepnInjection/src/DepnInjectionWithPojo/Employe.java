package DepnInjectionWithPojo;

public class Employe {

	private int eId;
	private String eName;
	private int eSellary;
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int geteSellary() {
		return eSellary;
	}
	public void seteSellary(int eSellary) {
		this.eSellary = eSellary;
	}
	
	void display() 
	{
		
		System.out.println(eId +" "+eName+" "+eSellary+" ");
		
	}
}
