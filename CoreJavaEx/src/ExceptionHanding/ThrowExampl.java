package ExceptionHanding;

import java.util.Scanner;

public class ThrowExampl extends RuntimeException {

	static 	 int age;

	public ThrowExampl(String msg) {

		super(msg);
	}

	public void GetEligblity() {

		if (age > 18) {

			System.out.println("Your Eligble for voting " + age);

		} else {
			ThrowExampl th = new ThrowExampl(" your not Eligble");
			throw th;

		}

	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		age = sc.nextInt();
		ThrowExampl th = new ThrowExampl(" ");

		th.GetEligblity();
	}

}
