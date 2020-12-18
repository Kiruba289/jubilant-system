package com.codility;

import java.util.HashMap;

public class HashMapdemo {
	public static void main(String[] args) {
		HashMap<String,String> days=new HashMap<String,String>();
		days.put("mon", "Monday");
		days.put("tue", "Tuesday");
		days.put("wed", "Wednesday");
		days.put("thurs", "Thursday");
		days.put("fri", "Friday");
		days.put("sat", "Saturday");
		days.put("sun", "Sunday");
		for(String i:days.keySet()) {
			System.out.println(days.get(i));
		}
		
	}
}
