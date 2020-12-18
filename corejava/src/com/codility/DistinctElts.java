package com.codility;

import java.util.Arrays;

public class DistinctElts {
	 public int solution(int[] A) {
		 Arrays.sort(A);
		 int n=A.length;
		 int result=1;
		 for(int i=1;i<n;i++) {
			 if(A[i]!=A[i-1])
				 result+=1;
		 }
		 return result;
	 }

}
