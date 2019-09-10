package com.sahil.practise.Staircase;

public class SolutionDP {
	
	public static long staircase(int n){

		long[] storage=new long[n+1];
		storage[0]=1;
		storage[1]=1;
		storage[2]=2;
		
		for(int i=3;i<=n;i++)
		{
			storage[i]=storage[i-3]+storage[i-2]+storage[i-1];
		}
		
		return storage[n];
		
	}


}
