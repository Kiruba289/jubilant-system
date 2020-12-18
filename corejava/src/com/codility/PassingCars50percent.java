package com.codility;

public class PassingCars50percent {
	public int solution(int[] A) {
	      int n=A.length;
		    int result = 0; 
		    for (int i=0; i<n-1; i++) 
		    { 
		       if (A[i] == 0) 
		       { 
		           for (int j=i+1; j<n; j++)   
		              if (A[j]==1) 
		                 result++;  
		       }  
		    } 
		    return result; 
				
			}

}
