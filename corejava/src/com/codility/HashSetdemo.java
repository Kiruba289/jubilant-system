package com.codility;


import java.util.HashSet;

public class HashSetdemo {
	public static void main(String[] args) {
		HashSet<String> days=new HashSet<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thurday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		for(String i:days) {
			System.out.println(i);
		}
		
	}
}
