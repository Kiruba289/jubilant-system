package com.demo;

import java.util.Scanner;

public class Primeornot {
	public static void main(String args[])
	{
    int flag = 0,i,m,n;
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter the number to be checked");
	n=sc.nextInt();
	m=n/2;
	if(n==0|| n==1)
		System.out.println("Not a prime number");
	else
	{
		for(i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime number");
				flag=1;
				break;
		      }
	    }
	if(flag==0)
		System.out.println(n+"   is a prime number");
		
	}

}
}
