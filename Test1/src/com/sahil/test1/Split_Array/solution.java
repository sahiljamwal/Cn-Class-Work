package com.sahil.test1.Split_Array;



public class solution {
    
    
    
    public static boolean splitArrayHelper(int input[],int n,int start,int lsum,int rsum)
    {
        if(start==n)
            return lsum==rsum;
        if(input[start]%5==0)
            lsum+=input[start];
        else if(input[start]%3==0)
            rsum+=input[start];
        else
            return splitArrayHelper(input,n,start+1,lsum+input[start],rsum)||splitArrayHelper(input,n,start+1,lsum,rsum+input[start]);
        
        return splitArrayHelper(input,n,start+1,lsum,rsum);
    }

	public static boolean splitArray(int input[]) {
		/* Your class should be named solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		return splitArrayHelper(input,input.length,0,0,0);
	}
	

}

