package com.codility;

import java.util.ArrayList;
import java.util.HashSet;

public class PermCheck {
public int solutionPermCheck(int[] A){
	HashSet<Integer> a=new HashSet<>();
	for(int i=0;i<A.length;i++) {
		a.add(A[i]);
		
	}
	for(int i=1;i<=A.length;i++) {
		if(a.contains(i)!=true) {
			return 0;
		}
		
		
	}
	return 1;
}
}

