package com.codility;

import java.util.Stack;
//Dry Run 
//Debug it and check the working of logic
public class StoneWall {
	public static int solution(int[] H) {

      // main idea: need to use "stack" to check when we need a new block
  
      Stack<Integer> st = new Stack<>();
      int numBlock =0;
  
      //i=0...8
      // note: H[i] is the ith height of the wall
      for(int i=0; i< H.length; i++){
      
          // step 1: "stack is not empty" AND "from high to low"
          // then, "pop" (it is the key point, be careful)
          while( st.isEmpty()==false && st.peek() > H[i] ){
              st.pop();
          }
          // step 2: if the stack is empty
          if( st.isEmpty() ){
              numBlock++;     // add a block
              st.push(H[i]);  // push the height
          }
          // step 3: the height is the same: do nothing
          else if( st.peek() == H[i] ){//no increase in block
          } 
          // step 4: from low to high 
          else if( st.peek() < H[i] ){
              numBlock++;    // add a block
              st.push(H[i]); // push the height
          }
          System.out.println(numBlock);
      }
      
      return numBlock;
  }
	
	public static void main(String[] args) {
		int[] arr= {8,8,5,7,9,8,7,4,8};
		System.out.println(solution(arr));
	}
}
