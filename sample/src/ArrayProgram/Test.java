package ArrayProgram;

import java.util.Scanner;


class Marks
{

   int mark[];
   float per=0,total;
   String sub[];
   void enterSubjectMarks(String sub[],int mark[])
   {
        this.sub = sub;
        this.mark = mark;
        
 
   }

   void calculateMarks()
   {
     for(int i=0;i<mark.length;i++)
      {
          total = total+mark[i];
      } 
      per = total/mark.length;
      System.out.println("Percentage is "+per);

   }

  

   


}


class MainMark
{

    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       String sub[] = {"physics","chemistry","maths","english","hindi"};
       System.out.println("Enter number of students");
       Marks obj[] = new Marks[sc.nextInt()];
       float ag=0;
       for(int i=0;i<obj.length;i++)
       {
             obj[i] = new Marks();
             int marks[] = new int[5];
            
             System.out.println("Enter Record for student " + (i+1));
             for(int j=0;j<5;j++)
             {
                     System.out.println("Enter marks for "+sub[j]);
                     marks[j] = sc.nextInt();

             }  
            obj[i].enterSubjectMarks(sub,marks);
            obj[i].calculateMarks(); 
            ag+=obj[i].per;
            

       }   
       System.out.println("Agreegate pecentage is " + ag/obj.length);
    }


}


