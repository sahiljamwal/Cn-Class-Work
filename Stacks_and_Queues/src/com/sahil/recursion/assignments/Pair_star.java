package com.sahil.recursion.assignments;

import java.util.Scanner;

public class Pair_star {
    public static String addStarshelper(String s,int start)
	{
		String temp="";
		
		if(s.length()-1==0)
		{
			temp+=s;
			return temp;
		}
		else if(s.length()-1!=start)
		{
            if(start!=s.length()-1)
            {
                if(s.charAt(start)==s.charAt(start+1))
                {
                    temp+=s.charAt(start);
                    temp+="*";
                    temp+=s.charAt(start+1);
                    return temp+addStarshelper(s, start+1);
                }
                else
                {
                    temp+=s.charAt(start);
                    return temp+addStarshelper(s, start+1);
                }

                
            }
		}
        
          
		return temp;
			
	}
	
	
	
	// Return the updated string
	public static String addStars(String s) {
        
          
        s=addStarshelper(s,0);
        return s;
	}
    
    
    
    
    public static void main(String args[]) {
        Scanner st=new Scanner(System.in);
        String s=st.nextLine();
        s=addStars(s);

        System.out.println(s);


    }
}