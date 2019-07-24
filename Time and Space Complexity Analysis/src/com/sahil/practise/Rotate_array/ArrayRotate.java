package com.sahil.practise.Rotate_array;
public class ArrayRotate {	

	public static void rotate(int[] arr, int d) {
		/* Your class should be named ArrayRotate
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to print or return the output.
      		 * Taking input and printing the output is handled automatically.
     		 */
            
        int ans[]=new int[arr.length];
        int index=0;
        for(int i=d;i<arr.length;i++)
        {
            ans[index]=arr[i];
            index++;
        }
        for(int i=0;i<d;i++)
        {
            ans[index]=arr[i];
            index++;
        }
        
        for(int i=0;i<index;i++)
        {
            arr[i]=ans[i];
        }
	}
}