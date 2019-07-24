package com.sahil.Quick_Sort_Code;


public class Solution {
	
	public static int partition(int[] input, int start, int end) {
	
		// find pivot position
		int count = 0;
		for (int i = start; i <= end; i++) {
			if ( input[i]>input[end])
				count++;
		}
       
		int pivotPos = (end-count);
        


            int temp = input[pivotPos];
			input[pivotPos] = input[end];
			input[end] = temp;
        

		// ensuring correct position of elements with respect to pivot
		int i = start;
		int j = end;
		while (i < pivotPos && j > pivotPos)
         {
			if(input[i]<=input[pivotPos] )
            {
                i++;
				
            }
			else if(input[j]>input[pivotPos])
            {
                    j--;
            }
			else
			{
				int change=input[j];
                input[j]=input[i];
                input[i]=change;
                i++;
                j--;
			}

         }
     

		return pivotPos;
	}

	public static void quickSortHelper(int[] input, int start, int end) {
		if (start >= end)
			return;
       
		int pivot = partition(input, start, end);
		quickSortHelper(input, start, pivot - 1);
		quickSortHelper(input, pivot + 1, end);
        
	}

	public static void quickSort(int[] input) {

		quickSortHelper(input, 0, input.length - 1);

	}
	
}