package com.sahil.practise.Min_Steps_to_One_Recursive;


public class Solution {
	
	public static int countStepsTo1(int n){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */
		
		int steps=0;
		
		if(n==1)
			return 0;
		
		if(n%3==0)
			steps+=Math.min(countStepsTo1(n/3),countStepsTo1(n-1));
		
		else if(n%2==0)
			steps+=Math.min(countStepsTo1(n/2),countStepsTo1(n-1));
		
		else
		    steps+=countStepsTo1(n-1);
		
	    steps++;
        
		return steps;
	}
	
}
