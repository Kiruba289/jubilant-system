package com.codility;

import java.util.Scanner;

public class CallingClass {
	public static void main(String ar[]) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
        Integer val = sc.nextInt();
        String vals = val.toBinaryString(val);
        int gapVal = findBinaryGap(vals);
        System.out.println(vals);
        System.out.println("gapVal=" + gapVal);

    }
	
	public static Integer findBinaryGap(String binVal) {
        Integer retVal = 0;
        String splitVal[] = binVal.split("1");
        int endVal = splitVal.length;
        if (binVal.endsWith("0")) {
            endVal = endVal - 1;
        }
        for (int incr = 0; incr < endVal; incr++) {
            if (retVal < splitVal[incr].length()) {
                retVal = splitVal[incr].length();
            }
        }
        return retVal;
    }

}
