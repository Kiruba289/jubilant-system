package com.codility;

public class Pattern1 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==3)
				continue;
			for(int j=1;j<=i;j++) {
				System.out.print(j);
				
			}
			System.out.println("");
		}
		
	}

}
