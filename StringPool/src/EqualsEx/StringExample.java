package EqualsEx;

public class StringExample {
	public static void main(String[] args) {

		String s = "This is a long string";

		String[] arr = s.split(" ");

		String rev = "";

		for (String s1 : arr) {
			char ch[] = s1.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				rev = rev + s1.charAt(i);
			}

			rev = rev + " ";
		}
		System.out.println(rev);
	}
}

//Output-"sihT si a gnol gnirts"
