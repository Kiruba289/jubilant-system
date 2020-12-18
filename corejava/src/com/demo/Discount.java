package com.demo;

import java.util.Scanner;

public class Discount {
	public static void main(String args[])
	{
    float p,q,tot,disc=0,actual=0;
    Scanner sc=new Scanner (System.in);
	System.out.println("Enter the price");
	p=sc.nextInt();
	System.out.println("Enter the quantity");
	q=sc.nextFloat();
	tot=p*q;
	if(tot>=10000)
	{
		disc=(float) (0.15*tot);
		actual=tot-disc;
	}
	else if(tot>=5000 && tot<10000)
	{
		disc=(float) (0.10*tot);
		actual=tot-disc;
	}
	else if(tot>=2000 && tot<5000)
	{
		disc=0*tot;
		actual=tot-disc;
	}
	System.out.println("Actual price  "+actual+"     Discount   "+disc);

}
	
}