package com.sahil.practise.CheckMaxHeap;

public class Solution {

	public static boolean checkMaxHeap(int arr[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        
        int parentIndex=0;
        int leftChildIndex=2*parentIndex+1;
        int rightChildIndex=2*parentIndex+2;
        boolean ans=true;
        
        for(int i=0;i<arr.length;i++)
        {
        	if(leftChildIndex<arr.length )
            {
            	if(arr[parentIndex]<arr[leftChildIndex])
            	{
            		ans=false;
            		break;
            	}
            	if(rightChildIndex<arr.length && arr[parentIndex]<arr[rightChildIndex])
            	{
            		ans=false;
            		break;
            	}
            	if(i+1!=arr.length)
            	{
            		parentIndex=i+1;
            		leftChildIndex=2*parentIndex+1;
            		rightChildIndex=2*parentIndex+2;
            	}
            	
            	
            }
            
        }
        
        return ans;
        
	}
}