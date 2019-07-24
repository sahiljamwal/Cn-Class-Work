package com.sahil.All_Indices_of_Number;


public class Solution {
    
    public static int[] returnAllIndex(int arr[],int temp[],int index,int x,int start)
    {
        
        if(arr.length-1==0  && arr[start]==x)
            {
                temp[index]=start;
                index++;
                return temp;
            }
        else if(arr.length!=start)
        {
            if(start!=arr.length-1)
            {
                    if(arr[start]==x)
                        {
                            temp[index]=start;
                            index++;
                        }

                return returnAllIndex(arr,temp,index,x,start+1);
                
             }
             else
             {
                 if(arr[arr.length-1]==x)
                 {
                     temp[index]=start;
                     index++;
                     
                 }
                 return temp;
             }
            
        }

                else
                {
                    return temp;
                }


    }

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int ans[]=new int[input.length];
        int temp[]=new int[input.length];
        int index=0;
        ans =returnAllIndex(input,temp,index,x,0);
            int finalarr[]=new int[ans.length];
        int index1=0;
        if(ans[0]==0)
        {
            finalarr[index1]=ans[0];
            index1++;
        }

        for(int i=0;i<ans.length;i++)
        {
            if(ans[i]!=0)
            {
                finalarr[index1]=ans[i];
                index1++;
            }
    
        }
        int ftemp[]=new int[index1];
        for(int i=0;i<index1;i++)
        {
            ftemp[i]=finalarr[i];
            
        }
            
            
            return ftemp;
	}
	
}