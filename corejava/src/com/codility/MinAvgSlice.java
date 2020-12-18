package com.codility;

public class MinAvgSlice {
	public int solution() {
		int[] A= {4,2,2,5,1,2,8};
		int n = A.length;
		int[] prefixarr = new int[n+1];
		int min=Integer.MIN_VALUE;
		prefixarr[-1]=0;
		int x,y=-1;

		prefixarr[0] = A[0];
		for (int i = 1; i < n; i++) {
			prefixarr[i] = prefixarr[i - 1] + A[i];
		}
		for (int j = 0; j < n; j++) {
			for(int k=j+1;k<n;k++) {
				x=(prefixarr[k]+prefixarr[j-1])/k-j+1;
				if( x<min) {
					min=x;
					y=j+1;
				}
				
			}
		}
		System.out.println(y);
		return y;
	}
}
