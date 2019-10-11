package com.sahil.LinearSearch;

public class LinearSearch{	
	
	public static int linearSearch(int[] arr, int num){
		/* Your class should be named LinearSearch
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
        int flag=0;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                index=i;
                flag=-1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        
        if(flag==-1)
            return index;
        
        else
            return -1;
        
	}
}