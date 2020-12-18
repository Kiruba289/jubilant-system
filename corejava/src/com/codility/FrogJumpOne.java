package com.codility;

public class FrogJumpOne {
	 public int solutionFrogJumpOne(int X, int[] A) {
	        // write your code in Java SE 8
	        int[]counter = new int[X+1];
	    int ans = -1;
	    int x = 0;

	    for (int i=0; i<A.length; i++){
	        if (counter[A[i]] == 0){
	            counter[A[i]] = A[i];
	            x += 1;
	            if (x == X){
	                return i;
	            }
	        } 
	    }

	    return ans;
	    }
	}

