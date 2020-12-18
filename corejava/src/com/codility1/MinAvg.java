package com.codility1;

public class MinAvg {
	public int solution() {
		int[] A= {4,2,2,5,1,2,8};
		int n = A.length;
		int[] prefix = new int[n+1];
		int min=Integer.MIN_VALUE;
		prefix[-1]=0;
		int x,y=-1;

		prefix[0] = A[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = prefix[i - 1] + A[i];
		}
		for (int j = 0; j < n; j++) {
			for(int k=j+1;k<n;k++) {
				x=(prefix[k]+prefix[j-1])/k-j+1;
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