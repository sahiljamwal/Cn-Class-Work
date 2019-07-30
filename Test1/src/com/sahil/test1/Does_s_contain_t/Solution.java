package com.sahil.test1.Does_s_contain_t;


public class Solution {
    
    
    public static boolean checkSequenceHelper(String a,String b,int size1,int size2)
    {
        if(size1==0)
            return false;
        if(size2==0)
            return true;
        if(a.charAt(size1-1)==b.charAt(size2-1))
            return checkSequenceHelper(a,b,size1-1,size2-1);
        
        return checkSequenceHelper(a,b,size1-1,size2);
            
    }
    
    
    
	public static boolean checkSequence(String a, String b) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        return checkSequenceHelper(a,b,a.length(),b.length());
	}
}