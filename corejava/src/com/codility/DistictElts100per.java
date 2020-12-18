package com.codility;

import java.util.HashSet;

public class DistictElts100per {
	 public int solution(int[] A) {
		 int n=A.length;
		 int distinct;
		 HashSet<Integer> hs=new HashSet<>();
		 for(int i=0;i<n;i++) {
			 hs.add(A[i]);
		 }
		 distinct=hs.size();
		return distinct;
	}

}
