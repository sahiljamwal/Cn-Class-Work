package com.sahil.practise.Maximum_Frequency_Number;

import java.util.HashMap;
public class Solution {

    
    
    public static HashMap<Integer,Integer> fillArray(int[] arr)
    {
        HashMap<Integer,Integer> output=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(output.containsKey(arr[i]))
            {
                int count=output.get(arr[i]);
                count++;
                output.put(arr[i],count);
                
            }
            else
            {
                output.put(arr[i],1);
            }
        }
        return output;
    }    
    
    
	public static int maxFrequencyNumber(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        HashMap<Integer,Integer> ans=fillArray(arr);
        
        int max=ans.get(arr[0]);
        int maxElement=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int temp=ans.get(arr[i]);
            if(temp>max)
            {
                max=temp;
                maxElement=arr[i];
            }
                
        }
        
        return maxElement;
		
        
	}
}