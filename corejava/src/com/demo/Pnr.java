package com.demo;

import java.util.Scanner;

public class Pnr {
	public static void main(String args[])
	{
    int p,n,r;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter P");
	p=sc.nextInt();
	System.out.println("Enter N");
	n=sc.nextInt();
	System.out.println("Enter R");
	r=sc.nextInt();
	int SI= p*n*r/100;
	System.out.println("Simple Interst is"+SI);
	}

}
