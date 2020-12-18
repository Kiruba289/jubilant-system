package com.demo;

import java.util.Scanner;

public class Evenornot {
	public static void main(String args[])
	{
    int n;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number to be checked");
	n=sc.nextInt();
	if(n%2==0)
		System.out.println("Even number");
	else
		System.out.println("Odd number");
	}
}