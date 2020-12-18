package com.codility.simantsir;



import java.util.Scanner;

public class CallCyclic {
	public static void main(String[] args) {
		int n,k;
		System.out.println("Enter the no. of elts in your array");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		int[] ar=new int[n];
		System.out.println("Enter the elts in your array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the no. of rotations ");
		k=sc.nextInt();
		CyclicRotation1 cr=new CyclicRotation1();
		ar=cr.solution(arr, k);
		System.out.println("the rotated array is  ");
		for(int i=0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
		
	}

}
