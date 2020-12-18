package com.codility;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingEltInArray {
public int solutionMissingElt(int[] A){
	HashSet<Integer> a=new HashSet<>();
	for(int i=0;i<A.length;i++) {
		a.add(A[i]);
		
	}
	for(int i=1;i<=A.length;i++) {
		if(a.contains(i)!=true) {
			return i;
		}
		
		
	}
	return (A.length)+1;
}
}
