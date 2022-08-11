package com.collectionExample;
import java.util.*;
import java.util.Iterator;
import java.util.ListIterator;

public class VactorEx {

public static void main(String []args)	
{
Vector<Integer> obj=new Vector<Integer>();
obj.add(4);
obj.add(9);
obj.add(1);
obj.add(21211);
obj.add(2);
obj.add(78);
//obj.remove(3);
//System.out.println(obj);


	

ListIterator it=obj.listIterator();
/*
while(it.hasNext()) {	

System.out.println(it.next());

}*/
while(it.hasPrevious()) 
{
System.out.println(it.previous());	
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
}}
