package com.codility;


//import java.util.*;
class BugFixingLeader {
    int solution(int[] A) {
        int n = A.length;
        int[] L = new int[n + 1];
        L[0] = -1;
        for (int i = 0; i < n; i++) {
            L[i + 1] = A[i];
        }
        int count = 0;
        int pos = (n + 1) / 2;
        int candidate = L[pos];
        for (int i = 1; i <= n; i++) {
            if (L[i] == candidate)
                count = count + 1;
        }
        //System.out.println(pos);
        //System.out.println(2*pos-1);
        //System.out.println(n);
        if (count > n/2)
            return candidate;
        return (-1);
    }
    public static void main(String[] args) {
    	int k;
    	k=new BugFixingLeader().solution(new int[] {2,2,2,2,2,3,4,4,4,6});
    	System.out.println(k);
    	
    }
}
