package com.sahil.practise.Minimum_bracket_Reversal;

import java.util.Stack;

public class Solution {

	
	// Function returns -1 if brackets can't be balanced
	public static int countBracketReversals(String input){
		
		// Write your code here
        if(input.length()%2!=0)
            return -1;
        else
        {
            Stack<Character> stack=new Stack<Character>();
            int count=0;
            for(int i=0;i<input.length();i++)
            {
                if(input.charAt(i)=='{')
                {
                    stack.push(input.charAt(i));
                }
                else if(input.charAt(i)=='}' && stack.size()==0)
                {
                    stack.push(input.charAt(i));
                }
                 else if(input.charAt(i)=='}' && stack.size()!=0 && stack.peek()=='{')
                {
                    stack.pop();
                }
                else if(input.charAt(i)=='}' && stack.size()!=0 && stack.peek()!='{')
                {
                   stack.push(input.charAt(i));
                }
                
            }
            while(!stack.isEmpty())
            {
                int c1=stack.peek();
                stack.pop();
                int c2=stack.peek();
                stack.pop();
                if(c1==c2)
                {
                    count++;
                }
                else
                {
                    count+=2;
                }
            }
            return count;
        }

	}
	
	

}

