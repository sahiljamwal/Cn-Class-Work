package com.sahil.FahrenheitToCelsiusTable;

public class Solution {

	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		int i=start;
		while(i<=end)
		{
			int f=i;
			int c=(int)((5.0/9)*(f-32));
			System.out.println(f+"\t"+c);
			i=i+step;
		}
	}
}