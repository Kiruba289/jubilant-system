package com.codility.corejava.exambefore.practice;

import java.util.Arrays;

public class Bf2 {
	 int solution(int[] A, int[] B) {
	int n = A.length;
	int m = B.length;
	Arrays.sort(A);
	Arrays.sort(B);
	int i = 0;
	for (int k = 0; k < n; ) {
	if (A[k] == B[i])
	return A[k];
	if (i < m-1 && B[i] < A[k])
	i += 1;
	else
	k+=1;
	}
	return -1;
	}
	public static void main(String[] args) {
	int[] A = {8, 4,1, 6, 7};
	int[] B = {8, 5, 1, 7,1};
	System.out.println(new Bf2().solution(A, B));
	}
	}