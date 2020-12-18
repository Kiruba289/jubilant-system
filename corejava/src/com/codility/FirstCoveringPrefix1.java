package com.codility;

import java.util.HashMap;
//import java.util.HashSet;

public class FirstCoveringPrefix1 {
	public int solution(int[] A) {
        
        int length = A.length;
        HashMap<Integer,Integer> temp = new HashMap<>();
        int result = 0;

        for (int i=0; i<length; i++)
        {
            if (!temp.containsValue(A[i]))
            {
                temp.put(i,A[i]);
                result = i;
            }
        }
        return result;
    }

}
