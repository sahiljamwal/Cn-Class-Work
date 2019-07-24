package com.sahil.practise.Multiplication_Recursive;


public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
	
        if(n==1)
            return m;
        else if(n==0)
            return 0;
        
        else 
            return m+multiplyTwoIntegers(m,n-1);
        
        
	}
}
