package OverRiding;

public class CMethordOverRidingMain extends PMethodOverRiding {
	void divide(int a, int b) {
		/*
		 * void add(int a,int b) {
		 * 
		 * int c=a-b;
		 * 
		 * 
		 * 
		 * System.out.println(c);
		 */
		int c = a / b;
		System.out.println(c);
		System.out.println("Child Class");
	}

	public static void main(String[] args) {
//	MethodOverRiding obj=new MethodOverRiding();
		// MethordOverRidingMain obj1=new MethordOverRidingMain();

		// MethordOverRidingMain mo=new MethodOverRiding();

		PMethodOverRiding mo = new CMethordOverRidingMain();
		mo.multiple(10, 4);
		CMethordOverRidingMain obj = new CMethordOverRidingMain();

		obj.divide(10, 4);
	}

	public CMethordOverRidingMain() {
		super();
		// TODO Auto-generated constructor stub
	}

}