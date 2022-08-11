package EqualsEx;

public class Equals {

	public static void main(String[] args) {

		String name = new String("nitesh");
		String name1 = new String("nitesh");
		
		System.out.println(name == name1);
		System.out.println(name.equals(name1));

		String name2 = "nitesh";
		String name3 = "nitesh";

		System.out.println(name2 == name3);
		System.out.println(name2.equals(name3));

	}

}
