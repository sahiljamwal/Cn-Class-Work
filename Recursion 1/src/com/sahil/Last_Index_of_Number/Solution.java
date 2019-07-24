package com.sahil.Last_Index_of_Number;


public class Solution {

    public static int foundLastbetter(int temp[],int x,int start)
    {
        
        if(start==temp.length-1 && temp[start]==x)
            return start;
        else if(start==temp.length-1 && temp[start]!=x)
            return -1;
        else if(temp[start]==x)
            return start;
        else if(start!=temp.length-1)
            return foundLastbetter(temp,x,start+1);
        else    
            return -1;
        
    }
    
    
    
    
	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        int temp[]=new int[input.length];
        int index=0;
        for(int i=input.length-1;i>=0;i--)
        {
            temp[index]=input[i];
            index++;
        }
        
        int ans =foundLastbetter(temp,x,0);
        
        if(ans==-1)
            return ans;
        else 
            return input.length-ans-1;
	}
	
}