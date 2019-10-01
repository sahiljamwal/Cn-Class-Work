package com.sahil.practise.MinimumCostPath;



public class Solution {

	public static int minCostPath(int input[][]) {
		return minCostPathHelper(input, 0, 0);

	}

	private static int minCostPathHelper(int[][] input, int i, int j) {

        try{
        	
        	int m=input.length-1;
        	int n=input[0].length-1;
        	
        	
            if(i>m || j>n)
                return Integer.MAX_VALUE;
            
            else if(i==m && j==n)
            	return input[i][j];
        
		
		int cost1=minCostPathHelper(input, i+1,j);
		int cost2=minCostPathHelper(input, i+1,j+1);
		int cost3=minCostPathHelper(input, i,j+1);
		
		return (input[i][j]+Math.min(cost1, Math.min(cost2, cost3)));

        }
        
        catch(Exception e){}
            
        return 0;
	}
}