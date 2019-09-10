package com.sahil.practise.Min_Steps_to_One_using_DP;

public class Solution {

	public static int countStepsTo1(int n){
		
		int storage[]=new int[n+1];
		storage[1]=0;
		
		for(int i=2;i<=n;i++)
		{
			if(i%3==0)
				storage[i]=1+Math.min(storage[i/3], storage[i-1]);
			else if(i%2==0)
				storage[i]=1+Math.min(storage[i/2], storage[i-1]);
			else
				storage[i]=1+storage[i-1];
		}
		
		return storage[n];
		
		
	}
	
}
