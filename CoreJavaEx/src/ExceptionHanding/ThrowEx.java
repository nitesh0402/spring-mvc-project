package ExceptionHanding;

import java.util.Scanner;

public class ThrowEx extends RuntimeException {

	public ThrowEx(String msg) {
		super(msg);
		
	}

	static int num;

	void getPossitiveNum() {

		if (num > 0)

		{
			System.out.println("number is possitive");

		} else {

			ThrowEx obj1 = new ThrowEx("Enter number start 1");

			throw obj1;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter any number");
		num = sc.nextInt();

		ThrowEx obj = new ThrowEx("");
		obj.getPossitiveNum();

	}
}
