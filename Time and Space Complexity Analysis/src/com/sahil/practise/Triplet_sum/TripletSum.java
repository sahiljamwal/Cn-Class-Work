package com.sahil.practise.Triplet_sum;

import java.util.Arrays;
public class TripletSum {	

	public static void FindTriplet(int[] arr, int x){
		/* Your class should be named TripletSum.
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                for(int k=0;k<arr.length;k++)
                {
                    if(i<j && j<k)
                    {
                        if(arr[i]+arr[j]+arr[k]==x)
                            System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
	}
}