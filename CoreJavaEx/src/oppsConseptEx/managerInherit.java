package oppsConseptEx;

public class managerInherit extends AdminInherit {
String empName;
int empId;

	void emp(String empName,int empId) 
	{
		
		this.empName=empName;
		this.empId=empId;
		
		System.out.println("Employe name is "+empName);
		System.out.println("Employe id is "+empId);

	}
	
	/*public static void main(String []args) 
	{
		managerInherit obj=new managerInherit();
		 obj.company("nitesh");
		 obj.emp("yogesh", 1122);
				
	}*/

	
}
