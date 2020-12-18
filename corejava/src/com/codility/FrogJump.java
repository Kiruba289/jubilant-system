package com.codility;

public class FrogJump {
	public int frogJumpSolution(int X, int Y, int D) {
		int d,result;
		d=Y-X;
		if(d%D>0) {
			result=d/D+1;
			
		}
		else result=d/D;
		return result;
	}

}
