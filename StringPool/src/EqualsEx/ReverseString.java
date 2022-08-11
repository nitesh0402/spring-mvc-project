package EqualsEx;

public class ReverseString {
public static void main(String[] args) {

	String name="nitesh verma";
	String rev="";
//	char n[]=name.toCharArray();

	String n[]=name.split(" ");
	for (int i=n.length-1;i>=0;i--) 
	{
		
        rev=rev+" "+n[i];
		
	}
	
	System.out.println(rev);

}
}
