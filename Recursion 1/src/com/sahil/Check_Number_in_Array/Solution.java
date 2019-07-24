package com.sahil.Check_Number_in_Array;

public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
        if(input.length==1 && input[input.length-1]==x)
            return true;
        
        else if(input[0]==x)
            return true;
        else if(input.length!=1)
        {
             int temp[]=new int[input.length-1];
        for(int i=1;i<input.length;i++)
        {
            temp[i-1]=input[i];
        }
        
        boolean tempCheck=checkNumber(temp,x);
            return tempCheck;   
        
        }
        
        else 
            return false;
       
        
        
	}
}