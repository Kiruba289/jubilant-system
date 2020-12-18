package com.codility;

public class PermMissingElement {
	public int permMissingEltSolution(int[] A){
		int n=A.length;
	  int sum=(n+2)*(n+1)/2;
	   int total=0;
	   for(int i=0;i<n;i++) {
		   total+=A[i];
	   }
		return sum-total;
	}

}
