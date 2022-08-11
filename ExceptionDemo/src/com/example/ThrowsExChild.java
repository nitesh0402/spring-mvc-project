package com.example;

import java.io.FileNotFoundException;

public class ThrowsExChild extends ThrowsExParent {

	
	public static void main(String[] args) throws FileNotFoundException {
		ThrowsExChild ch=new ThrowsExChild();
		ch.read();
	}
}
