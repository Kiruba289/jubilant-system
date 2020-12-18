package com.codility;

import java.util.Arrays;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class TriangleOrNot {
 public int solution(int[] A) {
     // write your code in Java SE 8
     Arrays.sort(A);  
      if (A.length<3) {
         return 0;    
      }
      for (int i=2;i<A.length;i++) {
         if (A[i-2]>A[i]-A[i-1])//if (A[i-2]+A[i-1]>A[i]) is used overflow error occurs
         {  
             return 1;
         }         
      }
      
      return 0;
 }
}