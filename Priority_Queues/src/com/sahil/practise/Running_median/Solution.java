package com.sahil.practise.Running_median;

import java.util.PriorityQueue;
import java.util.Arrays;
public class Solution {

	public static void runningMedian(int arr[]) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;)
        {
           pq.add(arr[i]);
            Integer[] arr1 = new Integer[pq.size()];
            Integer[] res = pq.toArray(arr1); 
            int n=res.length;
             Arrays.sort(res);
             
            if(n%2==0)
            {
                int a1=res[(n-1)/2];
                int a2=res[n/2];
                int m=(a1+a2)/2;
                System.out.println(m);
            }
            else if(n%2!=0)
            { 
            	System.out.println(res[n/2]);
            }
            
            
            i++;
        }
      
	}
}
                 
