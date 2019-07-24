package com.sahil.practise.Sum_of_digits_recursive;


public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
        
        if(input==0)
            return 0;
        else 
        {
            int ans=0;
            ans+=input%10;
            return ans+sumOfDigits(input/10);
            
        }

	}
}
