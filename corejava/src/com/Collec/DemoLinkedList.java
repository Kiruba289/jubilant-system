package com.Collec;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class DemoLinkedList {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> list=new LinkedList<>();
		list.add("mouse");
		list.add("keyboard");
		list.addLast("mic");
		
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
				
	}
}

