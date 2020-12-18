package com.codility;

public class PassingCars100percent {
	public int solution(int[] A) {
        // write your code in Java SE 8
         int countOne = 0;
        int countZero= 0;
        int pair = 0;
        int counter = 0;
        for (int i = A.length-1; i>=0;i--){
            counter++;
            if (A[i]==1){
                countOne++;
            } else if (A[i]==0){
                countZero++;
                pair += counter-countZero;
                if (pair > 1000000000){
                    return -1;    
                }
            }    
        }
        
        return pair;
    }

}
