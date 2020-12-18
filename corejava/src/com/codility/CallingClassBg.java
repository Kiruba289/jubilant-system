package com.codility;

import java.util.Scanner;

public class CallingClassBg {
	public static void main(String[] args) {
		SolutionBinaryGapCounter sbg=new SolutionBinaryGapCounter();
		int n,N;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find the binary gap");
		N=sc.nextInt();
		n=sbg.bgSolved(N);
		System.out.println("The binary gap for the entered numer is   "+n);
		
	}

}
