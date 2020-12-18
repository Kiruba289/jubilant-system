 package com.codility;

public class Tapeequilibrium {
public int solutionTapeequilibrium(int[] A) {

//variable holding number of elements in A
	int N = A.length;
	// variable holding the total sum of the array
     int totalSum = 0;
     // variable holding the minimum difference that we are solving for
     int minDifference = Integer.MAX_VALUE;
     // O(N) space complexity array for holding the left summation (A[0] + A[1] + ... + A[P-1])
     // N-1 because the last element in the array is always part of right sum
     int [] leftSum = new int[N-1];
     // Element at index 0 is always part of the left sum
     leftSum[0] = A[0];

     // loop to calculate the total sum of A
	for (int i = 0; i < N; i++) {
             totalSum += A[i];
     }

	// loop to calculate all of the summations on the left side 
	// leftSum [0] = A[0]; leftSum[1] = A[0] + A[1]; leftSum[2] = A[0] + A[1] + A[2]; leftSum[P-1] = A[0] + A[1] + ... + A[P-1];
	for (int i = 1; i < N - 1; i++) {
	        leftSum[i] = leftSum[i-1] + A[i];
	}

	// variable to hold the current minimum difference as we are going through our loop
	int curr = 0;
	for (int i = 0; i < N - 1; i++) {
	        // calculating the minimum difference 
		curr = Math.abs(leftSum[i]-(totalSum-leftSum[i]));
		// if our minimum difference is bigger than our current minimum difference
		if (minDifference > curr) {
			// we update minDifference to accurately represent the minimum difference
			minDifference = curr;
		}
	}

	return minDifference;
}
}