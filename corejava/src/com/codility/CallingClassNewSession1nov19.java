package com.codility;

import java.util.Scanner;

public class CallingClassNewSession1nov19{
	public static void main(String[] args) {
		SolutionBinaryGapCounter sbg=new SolutionBinaryGapCounter();
		int[][] arr=new int[50][2];
		int n,N,x,i=0;
		char c='y';
		Scanner sc=new Scanner(System.in);
		while(c=='y'){
		System.out.println("Enter the number to find the binary gap");
		N=sc.nextInt();
		n=sbg.bgSolved(N);
		System.out.println("The binary gap for the entered numer is "+n);
	    arr[i][0]=N;
        arr[i][1]=n;
		i=i+1;
		System.out.println("Do u want to continue? (y/n)");
	    c=sc.next().charAt(0);
	   }
		
	
		System.out.println("Enter the number to be searched");
		x=sc.nextInt();
		for(int j=0;j<50;j++) {
			if(arr[j][1]==x) {
				System.out.println("The number is"+arr[j][0]);
			}
		}
		
		
	}

}