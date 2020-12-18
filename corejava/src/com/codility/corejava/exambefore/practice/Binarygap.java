package com.codility.corejava.exambefore.practice;

public class Binarygap {
	public int solution(int N) {
		String bin=Integer.toBinaryString(N);
		int count=0;
		int max_count=0;
		for(int i=0;i<bin.length();i++) {
			if(bin.charAt(i)==1) {
				while(bin.charAt(++i)==0) {
					count++;
					}
				if(bin.charAt(i)!=1) {
					return 0;
				}
				else {
					if(count>max_count) {
						max_count=count;
					}
					else {
						
					}
				}
			}
		}
	return max_count;	
	}

}
