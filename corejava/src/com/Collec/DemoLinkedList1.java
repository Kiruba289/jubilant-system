package com.Collec;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoLinkedList1 {
	public static void main(String args[]) {
		LinkedList<Course> list= new LinkedList<Course>();
		Course c1=new Course(1,"cprogramming",3,2000);
		Course c2=new Course(2,"maths",3,2030);
		Course c3=new Course(3,"science",3,2180);
		Course c4=new Course(4,"history",3,1600);
		list.add(c2);
		list.add(c2);
		list.add(c3);
		list.add(c4);
	  ListIterator it= list.listIterator();
	  while(it.hasNext())
		{
		  Course o=(Course)it.next();
			o.showdetails();
		}
	  while(it.hasPrevious())
		{
		  Course o=(Course)it.previous();
			o.showdetails();
		}
	 
	  
	  
		
	}

}
