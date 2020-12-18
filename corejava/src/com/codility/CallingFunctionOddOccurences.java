package com.codility;

import java.util.Scanner;

public class CallingFunctionOddOccurences {
	public static void main(String[] args) {
		int n,k;
		System.out.println("Enter the no. of elts in your array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[5];
		System.out.println("Enter the elts in your array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		OddOccurencesInArray o=new OddOccurencesInArray();
		k=o.oddOccurenceSolution(arr);
		System.out.println("Not paired "+k);
		
		
	}

}
