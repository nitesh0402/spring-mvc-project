package com.collectionEx;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListToIntArray {

	public static void main(String[] args) {
		
	ArrayList<Integer>hs=new ArrayList();
	
	hs.add(12);
	hs.add(13);
	hs.add(14);
	hs.add(15);
	hs.add(16);
	hs.add(17);
	hs.add(18);
	hs.add(19);
	hs.add(20);
	
	int []s =new int[hs.size()]; 
for(int i=0;i<hs.size();i++) 
{
	
 s[i]=hs.get(i);}
for(int j:s) 
{
	System.out.print(j);
}

}
	
	}
	
	

