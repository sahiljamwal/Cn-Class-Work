package com.sahil.Print2DArray;

public class solution {
	public static void print2DArray(int input[][]) {
		// Write your code here
        
        int n=input.length;
        
        for(int i=0;i<input.length;i++)
        {
            int k=n;
            while(k>=1)
            {
                for(int j=0;j<input[0].length;j++)
                {
                    System.out.print(input[i][j]+" ");
                }
                System.out.println();
                 k--;
            }
            n--;
           
           
        }

	}
}