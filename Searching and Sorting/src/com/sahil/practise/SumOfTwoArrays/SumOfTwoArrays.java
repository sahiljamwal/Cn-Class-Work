package com.sahil.practise.SumOfTwoArrays;

public class SumOfTwoArrays{	

	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
        
        int n1=arr1.length;
        int n2=arr2.length;
        int n=0;
        
        if(n1==n2)
        {
            n=n1+1;
            
        }
        else if(n1>n2)
        {
            n=n1+1;
        }
        else if(n2>n1)
        {
            n=n2+1;
        }
        
        int ans[]=new int[n];
        int index=n-1;
            for(int i=n1-1;i>=0;i--)
            {
                ans[index]+=arr1[i];
                if(ans[index]>9)
                {
                    int temp=ans[index];
                    ans[index-1]+=(temp/10);
                    ans[index]=(temp%10);
                }
                index--;
            }
            
             index=n-1;
             for(int i=n2-1;i>=0;i--)
            {
                ans[index]+=arr2[i];
                if(ans[index]>9)
                {
                    int temp=ans[index];
                    ans[index-1]+=(temp/10);
                    ans[index]=(temp%10);
                }
                index--;
            }
            
            return ans;
 

	}
}