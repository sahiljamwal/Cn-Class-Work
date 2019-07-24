package com.sahil.Replace_pi_recursive;

public class solution {

    
    public static String replacePI(String str,int start)
    {
        String temp="";
        if(str.length()-1==0)
        {
            temp+=str.charAt(start);
            return temp;
            
        }
            
        
        else if(str.length()!=start)
        {
           if(start!=str.length()-1)
           {
                 if( str.charAt(start)=='p'  && str.charAt(start + 1)=='i')
                {
                    temp+="3.14";
                    return temp+replacePI(str,start+2);
                }
                else
                {
                    temp+=str.charAt(start);
                    return temp+replacePI(str,start+1);
                }
           }
            else
            {
                temp+=str.charAt(start);
                    return temp;
            }
                
            
            
        }
        else 
        	return temp;
      
    }
	// Return the changed string
	public static String replace(String input){
		// Write your code here
            
     
            input=replacePI(input,0);
                return input;
	}
}
