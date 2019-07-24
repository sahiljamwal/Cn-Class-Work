package com.sahil.practise.Count_Zeros;


public class solution {

	public static int countZerosRec(int input){
		// Write your code here
        int ans=0;
        if(input==0)
            return 0;
        
        if(input%10==0)
                ans++;
       
        if(input!=0)
              ans+=countZerosRec(input/10);
        
        
        return ans;
	}
}
