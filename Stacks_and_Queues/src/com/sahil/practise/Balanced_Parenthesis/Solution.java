package com.sahil.practise.Balanced_Parenthesis;

import java.util.Stack;

public class Solution {

	public static boolean checkBalanced(String exp) {
		// Write your code here
		String ans = "";
        int countOpening=0;
        int countClosing=0;
		for (int i = 0; i < exp.length(); i++) {
			if (exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '}'
					|| exp.charAt(i) == ')' || exp.charAt(i) == ']') {
				ans += exp.charAt(i);
                if(exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '[')
                    countOpening++;
                else
                    countClosing++;
			}
		}
		exp = ans;
       
		Stack<Character> stack = new Stack<Character>();
		int flag = -1;
		for (int i = 0; i < exp.length(); i++)
        {
			if (exp.charAt(i) == '{' || exp.charAt(i) == '(' || exp.charAt(i) == '[') 
            {
				stack.push(exp.charAt(i));
			}
            
            if(i!=exp.length()-1  && stack.size()!=0)
            {
                 if (exp.charAt(i + 1) == '}' || exp.charAt(i + 1) == ')' || exp.charAt(i + 1) == ']') 
                {
					if ( ((stack.peek()=='(')&&(exp.charAt(i+1)==')')) || ((stack.peek()=='{')&&(exp.charAt(i+1)=='}')) || ((stack.peek()=='[')&&(exp.charAt(i+1)==']')) )
                    {
						stack.pop();
						flag = 0;
					} 
                    else 
                    {
						flag = -1;
						break;
					}
				} 
            }
              
            
            

		}
//exp.length()==0
		if ( (countOpening==countClosing) && (flag == 0 && stack.isEmpty()))
			return true;
		else
			return false;

	}
}