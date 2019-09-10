package com.sahil.practise.Minimum_Count_of_Squares;

public class SolutionRecursion {

		public static int minCount(int n) {
			// Write your code here
			
			if(n==0 || n==1 || n==2 || n==3)
				return n;
			int minCount=Integer.MAX_VALUE;
			
			for(int i=1;i<=n/2;i++)
			{
	            if(i*i<=n)
	            {
	                int tempCount=1+minCount(n-i*i);
				    if(minCount>tempCount)
					    minCount=tempCount;
	            }
	            
			}
			
			return minCount;

		}
}
