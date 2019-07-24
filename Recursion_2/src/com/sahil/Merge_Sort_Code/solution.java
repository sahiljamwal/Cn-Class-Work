package com.sahil.Merge_Sort_Code;

public class solution {

	public static void merge(int[] input,int start,int end)
    {
        int mid=(start+end)/2;

        int ans[]=new int[end-start+1];
        int index=0;
        int i=start;
        int j=mid+1;
        while(i<=mid && j<=end)
        {
            if(input[i]<input[j])
            {
                ans[index]=input[i];
                i++;
                index++;
            }
            else
            {
                ans[index]=input[j];
                j++;
                index++;
            }
        }

        while(i<=mid)
        {
            ans[index]=input[i];
            i++;
            index++;
        }
        while(j<=end)
        {
            ans[index]=input[j];
            j++;
            index++;

        }
        
        for(int p=0;p<ans.length;p++)
        {
            input[start+p]=ans[p];
        }

    }

    public static void mergeSortHelper(int[] input,int start,int end)
    {
            if(start>=end)
                return;
           
                    int mid=(start+end)/2;
                    mergeSortHelper(input,start,mid);
                    mergeSortHelper(input,mid+1,end);
                    merge(input,start,end);
            
    }

    public static void mergeSort(int[] input){

        mergeSortHelper(input,0,input.length-1);
   
	}
}
