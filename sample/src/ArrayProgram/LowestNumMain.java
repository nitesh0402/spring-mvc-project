package ArrayProgram;

public class LowestNumMain {
public static void main(String []args) {
	int num []= {2,3,1,5,4};
	LowestNumArray obj=new LowestNumArray();
	 obj.getLowest(num);

	 System.out.println("Array length is "+num.length);	
		System.out.println( "Smallest num is "+num[0]);
		System.out.println( "Highest num is "+num[4]);
	}
}
