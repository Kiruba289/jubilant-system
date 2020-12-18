package com.codility;

public class SolutionBinaryGapCounter {
	public int bgSolved(int N) {
		int bg=0,temp=0;
		boolean flag=false;
		String str=Integer.toBinaryString(N).toString();
				System.out.println(str);
		for(int count=0;count<str.length();count++) {
			if(str.charAt(count)=='1') {
				if(((count+1)<str.length())&&str.charAt(count+1)=='0') {
					flag=true;
					if(temp>bg) {
						bg=temp;
					}
					temp=0;
				}
				else {
					flag=false;
				      }
			}
				else {
					temp=temp+1;
				}
				if((count+1)==str.length()) {
					if(flag==false) {
						if(temp>bg) {
							bg=temp;
							//temp=0;
						}
					}
				}
		}
		return bg;
				
		}
	}
	


