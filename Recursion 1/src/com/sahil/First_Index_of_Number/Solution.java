package com.sahil.First_Index_of_Number;


public class Solution {

    
    public static int firstIndexbetter(int input[], int x,int startIndex)
    {
        if(input.length==1 && input[0]==x)
            return 0;
        
        else if(input[startIndex]==x )
            return startIndex;
        
        else if(input.length!=startIndex+1)
        {
            return firstIndexbetter(input,x,startIndex+1);
        }
        
        else 
            return -1;
        
    }
    
    
	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
            
            int ans=firstIndexbetter(input,x,0);
            return ans;
        
        
	}
	
}