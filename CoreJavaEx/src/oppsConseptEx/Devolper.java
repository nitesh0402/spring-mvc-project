package oppsConseptEx;

public class Devolper extends managerInherit {
	
String DevolperName;

 void dev(String DevolperName) 
 {
	 
	 this.DevolperName=DevolperName;
	 System.out.println("Devolpername is "+DevolperName);
 }
	public static void main(String []args) 
	{
		Devolper obj=new Devolper();
		 obj.company("nitesh");
		 obj.emp("yogesh", 1122);
	obj.dev("dishu");
}}
