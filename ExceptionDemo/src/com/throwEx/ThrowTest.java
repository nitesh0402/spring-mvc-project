package com.throwEx;

public class ThrowTest extends RuntimeException {

	String msg;
	int errorCode;
	
	
	
	public ThrowTest(String msg, int errorCode) {
		super();
		this.msg = msg;
		this.errorCode = errorCode;
	}



	public ThrowTest(String msg)

	{
		super(msg);
	}
	
	

	public ThrowTest() {
	}

	public static void main(String[] args) {

		ThrowTest t1 = new ThrowTest("Insufficient fund in your account");
		boolean result = t1.withdrwalAmount(15000);

		if (result) {
			System.out.println("you are eligible for voting");
		} else {
			// throw t1;
		
			throw t1;
		}

	}

	boolean withdrwalAmount(int requestedBalance) {
		if (requestedBalance > 10000) {
			return false;
		} else {
			return true;
		}

	}

}
