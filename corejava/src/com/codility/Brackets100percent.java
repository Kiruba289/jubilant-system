package com.codility;

import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

public class Brackets100percent{
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
             case ']':
                 if (stack.isEmpty() || stack.pop() != '[')
                     return 0;
                 break;
             case '}':
                 if(stack.isEmpty() || stack.pop() != '{')
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