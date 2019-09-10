package com.sahil.practise.Staircase;


public class Solution {
	
		
public static long staircase(int n){

		long[] storage=new long[n+1];
		
		for(int i=0;i<=n;i++)
		{
			storage[i]=-1;
			
		}
		
		return staircase(n,storage);
		
	}

public static long staircase(int n , long[] storage){

	if(n==0 || n==1)
	{
		storage[n]=1;
		return storage[n];
	}
	
	if(n==2)
	{
		storage[n]=2;
		return storage[n];
	}
	
	if(storage[n]!=-1)
		return storage[n];
	
	storage[n]=staircase(n-3,storage)+staircase(n-2,storage)+staircase(n-1,storage);
	return storage[n];
	
	
	
}
	
}
