package com.test;

public final class ImutableCreate {

	final int name;
	public ImutableCreate( int name) 
	{
		this.name=name;
		
	}
	public int getName() {
		return name;
	}
public static void main(String[] args) {
	
	ImutableCreate obj=new ImutableCreate(123142);
	int s=obj.getName();
	System.out.println("name is "+s);
}
	
}
