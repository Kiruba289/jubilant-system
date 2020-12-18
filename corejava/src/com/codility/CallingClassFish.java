package com.codility;

public class CallingClassFish {
	public static void main(String[] args) {
		int result;
		Fish100percent f=new Fish100percent();
		int[] A= {5,2,6,4,1};
		int[] B= {1,0,0,0,1};
		result=f.solution(A, B);
		System.out.println(result);
	}
}
