package com.sahil.practise.Find_the_Unique_Element;

public class FindUnique{	

	public static int findUnique(int[] arr){
		/* Your class should be named FindUnique
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        
        int flag=0,element=0;;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    if(arr[i]==arr[j])
                    {
                        flag=0;
                        break;
                    }
                    else
                    {
                        flag=-1;
                    }
                }

            }
            if(flag==-1)
                {
                    element=arr[i];
                    break;
                }
        }
        return element;
	}
}