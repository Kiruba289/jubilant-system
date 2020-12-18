package com.codility;

public class OddOccurencesInArray {
	 public int oddOccurenceSolution(int[] A){
		 int frequency = 0;
	     int oddElement = 0;
	     
	     for(int ctr=0; ctr < A.length; ctr++){
	       for(int x=0; x < A.length; x++){
	         if(A[ctr] == A[x]){
	           frequency++;
	         }
	       }
	       
	       if(frequency % 2 != 0){
	         oddElement = A[ctr];
	         break;
	       }
	       frequency=0;
	     }
	    
	     return oddElement;
	 }

}
