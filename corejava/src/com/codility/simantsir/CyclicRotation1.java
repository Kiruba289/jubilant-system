package com.codility.simantsir;

public class CyclicRotation1 {
	 public int[] solution(int[] A, int K) {
		 int n=A.length-1;
		 int temp;
		 int[] arr=new int[A.length];
		 for(int i=0;i<K;i++) {
			 temp=arr[n-1];
			 for(int j=n-1;j>0;j--) {
				 arr[j]=arr[j-1];
			 }
			 arr[0]=temp;
			 
		 }
		 return arr;
	 }

}
