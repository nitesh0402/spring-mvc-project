package ThrowsExecption;


import java.util.*;

public class throwsa{
	  public static void main(String[] args) 
	  {
		  String email="yogeshverma@test.com";
		  
		  int lindex=email.lastIndexOf('@');
	 String em=email.substring(lindex, email.length());
	  System.out.println(em);
	  }
	
  
}
