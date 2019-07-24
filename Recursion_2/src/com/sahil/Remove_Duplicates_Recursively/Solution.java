package com.sahil.Remove_Duplicates_Recursively;

public class Solution {

	public static String removeConsecutiveDuplicates(String s,String temp,int start) 
    {
      
        //System.out.println(temp);

        if(s.length()-1==0)
        {
            temp+=s.charAt(start);
            return temp;
        }
        else if(s.length()!=start)
        {
            if(s.charAt(start)==temp.charAt(temp.length()-1))
            {
                temp+="";

                return removeConsecutiveDuplicates(s,temp,start+1);
            }
            else 
            {
                temp+=s.charAt(start);
                return removeConsecutiveDuplicates(s,temp,start+1);
            }
        }

        else 
            return temp;
           
            
    }

    public static String removeConsecutiveDuplicates(String s)  {
		
        String ans="";
        String temp="";
        temp+=s.charAt(0);
        ans=removeConsecutiveDuplicates(s,temp,1);

        return ans;

	}

}