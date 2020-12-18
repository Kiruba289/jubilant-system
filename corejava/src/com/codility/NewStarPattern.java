package com.codility;

public class NewStarPattern {
	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println("");
		}
		
	}

}

/* i i<4 j j<=i
 * 0 0<4 0 0<=0 *
 * 1 1<4 0 0<=1 **
 *       1 1<=1 
 * */
