package com.sahil.InterestingAlphabets;

public class Solution {

	public static void print(int n) {
		//Write your code here
        int i=1;
		while(i<=n)
		{
			int j=1;
			char startChar=(char)(65+n-i);
			while(j<=i)
			{
				System.out.print(startChar);
				startChar++;
				j++;
			}

			System.out.println();
			i++;
		}
	}

}
