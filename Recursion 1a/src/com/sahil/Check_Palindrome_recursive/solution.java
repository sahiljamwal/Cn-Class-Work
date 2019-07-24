package com.sahil.Check_Palindrome_recursive;


public class solution {

    public static boolean isStringPalindromebetter(String input,int start,int end)
    {
        
        if(start==end )
            return true;
        else if(!(start<end))
            return true;
        else if(input.charAt(start)!=input.charAt(end))
            return false;
        else if(input.charAt(start)==input.charAt(start))
            return isStringPalindromebetter(input,start+1,end-1);
        
     else 
         return false;
        
        
        
    }
    
    
    
    
    
	public static boolean isStringPalindrome(String input) {
		// Write your code here
      
        
            boolean ans=isStringPalindromebetter(input,0,input.length()-1);
            
            return ans;
       

	}
}

