package comJavaPactice;
import java.util.Scanner;
class PreeIncrementExampl {
	

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        char ch;
        System.out.println("Enter char");
        ch= sc.next().charAt(0);
       if(ch == 'a')
    	   System.out.println("a is Vowel");
       else 
       {
    	   if (ch=='e')
    		   System.out.println("Vowel");
    	   else 
    	   {
    		   if(ch=='i')
    		   System.out.println("Vowel");
    		   else
    		   { if(ch=='o')
    			   System.out.println("Vowel");
    		   else 
    		   {
    			   if(ch=='u')
    			   System.out.println("Vowel");
    			   else
    			   {
    				   System.out.println("constant");
    				   }
    		   }
    		   
    		   }}}    		   }
    	   
    	   
       
       
       
       
    
    }