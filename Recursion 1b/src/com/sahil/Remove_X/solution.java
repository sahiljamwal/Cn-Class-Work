package com.sahil.Remove_X;


public class solution {

    
   public static String removeXhelper(String input,int start)
    {
        String temp="";
        
        if(input.length()-1==0)
        {
            temp+=input;
            return temp;
        }
        else if(input.length()!=start)
        {
            if(input.charAt(start)=='x')
            {
                temp+="";
                return temp+removeXhelper(input,start+1);
            }
            else
            {
                temp+=input.charAt(start);
                return temp+removeXhelper(input,start+1);
            }
        }
        
        else 
            return temp;
        
        
        
    }

    public static String removeX(String input){
		// Write your code here
        
        input=removeXhelper(input,0);
        
        return input;

	}
}
