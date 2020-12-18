package com.codility;

import java.util.Arrays;
import java.util.HashSet;

public class FirstCoveringPrefix {
    public int solution(int[] A) {
        // write your code in Java SE 8
    	// write your code in Java SE 8
        int length = A.length;
        HashSet<Integer> temp = new HashSet<>();
        int result = 0;

        for (int i=0; i<length; i++)
        {
            if (!temp.contains(A[i]))
            {
                temp.add(A[i]);
                result = i;
            }
        }
        return result;
    }
    public static void main(String[] args) {
		//int[] A = {0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1};
		//int[] A ={2,2,1,0,1};
		int[] A = {};
		System.out.println(new FirstCoveringPrefix().solution(A));
	}
}