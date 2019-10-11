package com.sahil.FibonacciNumber;


public class Solution {
	
	public static boolean checkMember(int n){
				
		/* Your class should be named Solution
		* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/

        
       int first=0;
        int second=1;
        
        int arr[]=new int[1000];
        int third=first+second;
        int index=0;
        while(third<=n)
        {
            
            third=first+second;
            arr[index]=third;
            
            first=second;
            second=third;
            index++;
        }
        arr[index]=0;
        index++;
        arr[index]=1;
        index++;
        int flag=0;
        for(int i=0;i<index;i++)
        {
           if(arr[i]==n)
              {
                  flag=-1;
                  break;
              }
        }

        if(flag==-1)
            return true;
        else
            return false;
	}
	

}
