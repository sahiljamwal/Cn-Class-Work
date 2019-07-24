package com.sahil.practise.Geometric_Sum;


public class solution {

	public static double findGeometricSum(int k){
		// Write your code here

        double ans=0;
        if(k==0)
            return 1;
        else 
        {
            ans+=(1.0/Math.pow(2,k));
            return ans+findGeometricSum(k-1);
        }
	}
}
