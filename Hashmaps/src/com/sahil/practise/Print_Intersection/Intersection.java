package com.sahil.practise.Print_Intersection;

import java.util.HashMap;

public class Intersection{
	
    
    public static HashMap<Integer,Boolean> intersectionHelper(int[] arr1, int[] arr2)
    {
        HashMap<Integer,Boolean> map=new HashMap<Integer,Boolean>();
        
        if(arr1.length>=arr2.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
                map.put(arr1[i],false);
            }
            
            for(int i=0;i<arr2.length;i++)
            {
                if(map.containsKey(arr2[i]))
                {
                    map.put(arr2[i],true);
                }
            }
        }
        else
        {
            for(int i=0;i<arr2.length;i++)
            {
                map.put(arr2[i],false);
            }
            
            for(int i=0;i<arr1.length;i++)
            {
                if(map.containsKey(arr1[i]))
                {
                    map.put(arr1[i],true);
                }
            }
        }
        return map;
    }
    
    
    
    
	public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
        HashMap<Integer,Boolean> map=intersectionHelper(arr1,arr2);
        
        
        if(arr2.length>=arr1.length)
        {
            for(int i=0;i<arr1.length;i++)
            {
        	    if(map.containsKey(arr1[i]))
        	    {
        		    if((map.get(arr1[i])).equals(true))
        		    {
        		    	System.out.println(arr1[i]);
                        //map.put(arr1[i], false);
        		    }
        	}
            }
        }
        else
        {
            for(int i=0;i<arr2.length;i++)
            {
                if(map.containsKey(arr2[i]))
                {
                    if((map.get(arr2[i])).equals(true))
                    {
                        System.out.println(arr2[i]);
                    }
                }
            }
        }
        
        
        
	}
}