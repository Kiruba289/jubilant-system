package com.codility;

public class PassingCarsAliter100percent {
	public int solution(int[] A) {
	// limit on number of passing cars (given in problem description) (1,000,000,000)
		final int CAR_LIMIT = 1000000000;
		// counter for number of passing cars
	        int passingCars = 0;
	        // number of zeroes OR cars traveling east
	        int carsTravelingEast = 0;
	        // number of elements in A
	        int N = A.length;
	 
	        // iterate through A
	        for (int i = 0; i < N; i++) {
	        	// increment number of cars traveling east
	        	if (A[i] == 0) {
	        		carsTravelingEast++;
	        	}
	        	//If you have at least 1 car traveling East and you encounter a car traveling west
	        	if (A[i] == 1 && carsTravelingEast > 0) {
	        		passingCars += carsTravelingEast;
	        		// if passing cars exceeds limit set by problem description
	        		if (passingCars > CAR_LIMIT)
	                	    return -1;
	        	}
	        }                   
		return passingCars;
}
}