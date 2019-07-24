package com.sahil.practise.Return_subset_of_an_array;

public class solution {

	// Return a 2D array that contains all the subsets
	
    public static int[] subsetsHelper(int input[],int start)
    {
        if(start==input.length)
        {
            int ans[]={};
            return ans;
        }
        if(start<input.length)
        {
            int ans[]={input[start]};
            return ans;
        }
        
        int smallAns[]=subsetsHelper(input,start+1);
        
        return smallAns;
    }
    
    
    public static int[][] subsetsResult(int input[])
    {
        int temp[]=subsetsHelper(input,1);
        for(int i=0;i<temp.length;i++)
        {
            System.out.println(temp[i]);
        }
        int ans[][]=new int[2*temp.length][];
        
        ans=new int[2][];
        
        return ans;
    }
    
    
    
    public static int[][] subsets(int input[]) {
		// Write your code here
        
        return (subsetsResult(input));

	}
}
