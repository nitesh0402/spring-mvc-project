package Abstraction;

public class Suzuki extends Car {

	@Override
	void add() {
		// TODO Auto-generated method stub
		
		int x=20;
		int y=25;
		int z=x+y;
		System.out.println("Two number  addiction is "+ z);
	}	
	
	void sum() 
	{
		
		
	}
	
	public static void main(String []args)
	{
	Car obj =new Suzuki();
		obj.sum();
		obj.add();
	}

	
	
}
