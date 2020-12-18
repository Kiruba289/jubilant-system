package com.demo;

import java.util.Scanner;

public class Consoorvow {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		char c;
		System.out.println("Enter the character");
		c=sc.next().charAt(0);
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
			break;
	 default:
		 System.out.println("consonant");
	}
		   
	    
			
			
			
			
	}

}
