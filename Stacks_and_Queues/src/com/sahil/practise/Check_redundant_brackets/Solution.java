package com.sahil.practise.Check_redundant_brackets;

import java.util.Stack;

public class Solution {
	
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
Stack<Character>  stack=new Stack<Character>();
		
		for(int i=0;i<input.length();i++)
		{
			int count=0;
			if(input.charAt(i)!=')')
			{
				stack.push(input.charAt(i));
			}
			else
			{
				while(stack.peek()!='(')
				{
					stack.pop();
					count++;
				}
				stack.pop();
				if(count==0)
				{
					
                    return true;
				}
				
			}
				
		}
	    return false;
		

	}
}