package com.sahil.ArrangeNumbersInArray;


public class Solution {

	
	public static int[] arrange(int n){
        
        int []arr=new int[n];
        
        int index=0;
        for(int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                arr[index]=i;
                index++;
            }
        }
        
        for(int j=n;j>=1;j--)
        {
            if(j%2==0)
            {
                arr[index]=j;
                index++;
            }
        }
        
        return arr;
	}
	
}
