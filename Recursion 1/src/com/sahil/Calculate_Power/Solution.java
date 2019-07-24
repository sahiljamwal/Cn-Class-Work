package com.sahil.Calculate_Power;

public class Solution {

	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
        if(n==1 )
            return x;
        else if(n==0)
            return 1;
        
        return x*power(x,n-1);
		
	}
}