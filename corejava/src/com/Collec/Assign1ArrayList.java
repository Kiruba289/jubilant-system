package com.Collec;

import java.util.ArrayList;
import java.util.Scanner;

public class Assign1ArrayList {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> mailid=new ArrayList<>();
		String pmailid,b="yes",c;
		while(b.equals("yes")) {
			
		System.out.println("Enter the mailid");
		pmailid=sc.next();
		mailid.add(pmailid);
		System.out.println("Do you want to add more");
		b=sc.next();
		}
		
		
		System.out.println("which one do u want to remove");
		c=sc.next();
		if(mailid.contains(c)) {
			mailid.remove(c);
		}
		
		
	}

}
