package com.codility;

import java.util.Scanner;

public class NumOfDigits {
	public static void main(String[] args) {
		
		int result=0,n;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0) {
			n/=10;
			result+=1;
		}
		System.out.println("Number of digits="+result);
	}

}
