package com.codility;

public class BinaryToOne {
	public int numSteps(String s) {
		int sum = 0;
		double bin;
		int k, r, count=0;
		long div;
		long num = Long.parseLong(s);
		//int sum=Integer.parseInt(s,2);
		
		for (int i = 0; i < s.length(); i++) {
			div = num % 10;
			bin = div * Math.pow(2, i);
			sum += bin;
			num = num / 10;
		}
		r = sum;
		while (true) {
			k = r % 2;
			if(r!=1) {
			if (k == 0) {
				r = r / 2;
			} else {
				r = r + 1;
			}
			count++;
			}
			else if(r==1) break;
		}

		return count;
	}

	public static void main(String[] args) {
		String str = "1101";
		int res;
		System.out.println(new BinaryToOne().numSteps(str));
	}
}