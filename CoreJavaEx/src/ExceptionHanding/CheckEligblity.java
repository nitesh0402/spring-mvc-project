package ExceptionHanding;

import java.util.Scanner;

public class CheckEligblity extends RuntimeException {

	
	CheckEligblity(String msg)
	{
		
		super(msg);
		
	}
	
 String  getEligblity() 
 {
 
 return "rnter only numeric number";
 } 
 
 
 	
	public static void main(String []args) {


		Scanner sc=new Scanner(System.in);
		try {
			int age;

		
		System.out.println("Enter your age");
		
		age=sc.nextInt();
		 if (age>=18) 
		 {
			 System.out.println("your eligble for voting");
			

		 }else
		 {
			 CheckEligblity obj1=new CheckEligblity("your not eligble try next time");
		 throw obj1;
		 }
		}
		catch ( CheckEligblity e) {
			e.printStackTrace();
		}
		
	//	CheckEligblity obj=new CheckEligblity("");
	//	obj.getEligblity();
	 }
		

		


	
	
	}
	

