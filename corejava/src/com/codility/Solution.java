package com.codility;

import java.util.Arrays;

class Solution {
	public static int solution(int A, int B, int C, int D) {
        int[] t = {A,B,C,D};
        boolean[] flag = new boolean[3];
        Arrays.sort(t);
        int count = 0;
        for(int i=0;i<t.length;i++){
            if((t[i]==0||t[i]==1||t[i]==2)&&(flag[t[i]]==false)){
                flag[t[i]]=true;
                boolean[] flag1 = new boolean[10];
                for(int j=0;j<t.length;j++){
                    if(j==i)
						continue;
                    else if((flag1[t[j]]==false)){
                        flag1[t[j]] = true;
                       if(10*t[i] + t[j]<=23){
							int[] arr = new int[2];
							int m=0;
                           for(int k=0;k<t.length;k++){
                               if(k!=i && k!=j){
                                   arr[m]=t[k];m++;
								}
							}							   
                            if(arr[0]*10+arr[1]<=59)
								count++;
							if((arr[1]*10+arr[0]<=59) && (arr[1]!=arr[0]))
								count++;
                               
                           
                       }
                    }
                    
                }
            }
		}
        return count;
	}
    public static void main(String[] args) {
		
		//System.out.println(new Solution().solution(4,9,9,1));
		System.out.println(new Solution().solution(1,2,3,4));
		System.out.println(new Solution().solution(1,3,3,2));
	}
}