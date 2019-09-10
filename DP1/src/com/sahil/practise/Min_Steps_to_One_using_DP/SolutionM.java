package com.sahil.practise.Min_Steps_to_One_using_DP;

public class SolutionM {
	
	public static int countStepsTo1(int n){
	
		int storage[]=new int[n+1];
		
		for(int i=0;i<=n;i++)
		{
			storage[i]=-1;
		}
		
		return countStepsTo1(n,storage);
		
		
	}
	
	public static int countStepsTo1(int n,int[] storage){
		
		if(n==1)
			return 0;
		
		if(storage[n]!=-1)
		{
			return storage[n];
		}
		
		if(n%3==0)
			storage[n]=1+Math.min(countStepsTo1(n/3,storage),countStepsTo1(n-1,storage));
		else if(n%2==0)
			storage[n]=1+Math.min(countStepsTo1(n/2,storage),countStepsTo1(n-1,storage));
		else
			storage[n]=1+countStepsTo1(n-1,storage);
		
		return storage[n];
		
	}
	
}
