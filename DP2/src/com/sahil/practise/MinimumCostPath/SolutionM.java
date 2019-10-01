package com.sahil.practise.MinimumCostPath;

public class SolutionM {

	public static int minCostPath(int input[][]) {
		
		int m=input.length;
		int n=input[0].length;
		
		
		int storage[][]=new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				storage[i][j]=-1;
			}
		}
		
		return minCostPathM(input, 0, 0,storage);

	}

	private static int minCostPathM(int[][] input, int i, int j,int[][] storage) {
		
		try{
			
			int m=input.length-1;
        	int n=input[0].length-1;
        	
        	
            if(i>m || j>n)
                return Integer.MAX_VALUE;
            
            else if(i==m && j==n)
            {
            	storage[i][j]=input[i][j];
            	return storage[i][j];
            }
            
            else if(storage[i][j]!=-1)
            	return storage[i][j];
            
            int cost1=minCostPathM(input, i+1,j,storage);
    		int cost2=minCostPathM(input, i+1,j+1,storage);
    		int cost3=minCostPathM(input, i,j+1,storage);
    		
    		storage[i][j]=input[i][j]+Math.min(cost1, Math.min(cost2, cost3));
    		
    		return storage[i][j];
		}
		
		catch(Exception e){}
		
		return 0;
	}
	
	
	
}
