package ExceptionHanding;

import java.util.Scanner;

public class CheckedEx extends RuntimeException {

	public CheckedEx(String msg) {
		super(msg);
	}

	static int num;
	static int fact = 1;

	public void getfacto(int num) {
		for (int i = 1; i <= num; i++) {

			fact = fact * i;
	
	
		}
	

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		Integer num =null;
		try {
		 num = sc.nextInt();
		}catch(Exception e){	
			CheckedEx obj1 = new CheckedEx("Enter only numeric number");

		throw obj1;}
		

		CheckedEx obj = new CheckedEx("");
		
		obj.getfacto(num);
		System.out.println(fact);
	}
}
