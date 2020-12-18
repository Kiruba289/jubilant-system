package com.codility.corejava.exambefore.practice;

public class OddOccur {
    public int oddoccurence(int[] arr, int size) {
        int res = 0;
       
        for (int i = 0; i < size; i++) {
            res = res ^ arr[i];

        }
        return res;
    }

    public static void main(String args[]) {
        int[] arr = { 2, 5, 5, 2, 2, 3, 3, 3 };

        int n = arr.length;
        OddOccur obj = new OddOccur();

        System.out.println("odd occuring element is:"
                + obj.oddoccurence(arr, n));
    }
}