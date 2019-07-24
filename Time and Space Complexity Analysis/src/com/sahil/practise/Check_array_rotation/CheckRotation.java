package com.sahil.practise.Check_array_rotation;

public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		/* Your class should be named CheckRotation
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        
       int flag=arr[0];
            int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<flag)
            {
                flag=arr[i];
                k=i;
            }
        }
        
        return k;
        

	}
}