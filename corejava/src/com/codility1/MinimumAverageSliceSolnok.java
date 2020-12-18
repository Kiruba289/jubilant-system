package com.codility1;
public class MinimumAverageSliceSolnok {
  public int solution(int[] A) {
	        // write your code in Java SE 8
	        int n = A.length;
			int[] m= new int[n];
			float min=Float.MAX_VALUE;
			float x;
			int y=0;

			m[0] = A[0];
			for (int i = 1; i < n; i++) {
				m[i] = m[i - 1] + A[i];
			}
			//System.out.println(m[1]);
			for (int j = 0; j < n; j++) {
				for(int k=j+1;k<n;k++) {
					if(j==0) {
						x=(float)m[k]/(k-j+1);
					}
					else {x=(float)(m[k]-m[j-1])/(k-j+1);}
					if( x<min) {
						min=x;
						y=j;
						
					}
					
				}
				
			}
			///System.out.println(y);
			return y;
	    }
	}
