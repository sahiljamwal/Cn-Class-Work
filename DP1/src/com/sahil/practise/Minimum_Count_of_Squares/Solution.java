package com.sahil.practise.Minimum_Count_of_Squares;


public class Solution {
	
	public static int minCount(int n) {

     
		int[] storage=new int[n+1];
		storage[0]=0;
		storage[1]=1;
		storage[2]=2;
		storage[3]=3;
		
		for(int i=4;i<=n;i++)
		{
			storage[i]=i;
            
			for(int j=1;j<=i/2;j++)
	            if(j*j<=i)
					storage[i]=Math.min(storage[i],1+storage[i-j*j]);	
		}
							
		return storage[n];
	}

	
}