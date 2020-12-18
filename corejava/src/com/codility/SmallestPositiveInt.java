package com.codility;

import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class SmallestPositiveInt{
 public int solution(int[] A) {
     // write your code in Java SE 8
     int N = A.length;
Set<Integer> set = new HashSet<>();
for (int a : A) {
 if (a > 0) {
     set.add(a);
 }
}
for (int i = 1; i <=N+1; i++) {
 if (!set.contains(i)) {
     return i;
 }
}
return -1;
}}
