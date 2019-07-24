package com.sahil.Sum_of_Array;

public class Solution {

	public static int sum(int input[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        int n=input.length;
        int ans=0;
        if(n==1)
            return input[n-1];
        
        
            int[] temp=new int[n-1];
        
        for(int i=1;i<n;i++)
        {
            temp[i-1]=input[i];
        }
        
       
        
        
            return input[0]+sum(temp);
        
      
        
        
        
        
        
        //return input[0]+sum(temp);
		
	}
}
