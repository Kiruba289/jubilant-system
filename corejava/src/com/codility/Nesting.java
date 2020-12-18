package com.codility;

import java.util.Stack;

public class Nesting {
	public int solution(String S) {
	     // write your code in Java SE 8
	     Stack<Character> stack = new Stack<Character>();

	     for(int i = 0; i < S.length(); i++) {
	         char c = S.charAt(i);

	         switch (c) {
	             case ')':
	                 if (stack.isEmpty() || stack.pop() != '(')
	                     return 0;
	                 break;
	             default:
	                 stack.push(c);
	                 break;
	         }
	     }

	     return stack.isEmpty() ? 1 : 0;
	 }

}
