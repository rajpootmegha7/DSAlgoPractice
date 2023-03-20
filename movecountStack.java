package org.example;

import java.util.Stack;

public class Stackprob {
    public static void main(String args[]){
        Stackprob sp = new Stackprob();
        String str = "())()(";
        int val = sp.findMoveParen(str);
        System.out.println(val);
        }
      public int findMoveParen (String str){
        // Create a stack and save the values of open bracket in stack.
          int count = 0;
          int ans = 0;
          // use this counter to update the value of closing bracket.
          for(int i = 0; i <str.length(); i++){
              if(str.charAt(i) == ')') count--;
              if(str.charAt(i) == '(') count++;
              if(count < 0 ) { ans++; count = 0;}
          }
          return ans;
      }
    }
