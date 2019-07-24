package com.sahil.practise.Binary_Search_Recursive;

public class solution {

	// element - number to be searched
	
    public static int binarySearch(int input[], int element,int start,int end)
    {
        if(end>=start)
        {
            int mid=start+(end-start)/2;
            
            if(input[mid]==element)
            return mid;
            
            if(input[mid]>element)
                return binarySearch(input,element,start,mid-1);
            else
                return binarySearch(input,element,mid+1,end);
        

        }
                    
       
        return -1;
    }
    
    
    public static int binarySearch(int input[], int element) {
		// Write your code here
        
           return  binarySearch(input,element,0,input.length-1);
    
	}
}
