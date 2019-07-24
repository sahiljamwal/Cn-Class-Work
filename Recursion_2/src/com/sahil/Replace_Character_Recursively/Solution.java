package com.sahil.Replace_Character_Recursively;


public class Solution {

	public static String replaceCharacterbetter(String input, char c1, char c2,int start) 
    {
            String temp="";
          
            if(input.length()-1==0  &&  input.charAt(0)==c1)
            {
                temp+=c2;
                return temp;
            }
            else if(input.length()-1==0  &&  input.charAt(0)!=c1)
            {
                temp+=input.charAt(start);
                return temp;
            }
            else if(input.length()!=start)

            {
                if(input.charAt(start)==c1)
                {
                    temp+=c2;
                    return temp+replaceCharacterbetter(input,c1,c2,start+1); 
                }
                else
                {
                    temp+=input.charAt(start);
                     return temp+replaceCharacterbetter(input,c1,c2,start+1);
                }
            }

            else 
                return temp;
    }

    public static String replaceCharacter(String input, char c1, char c2) {
		
        String ans="";
        ans=replaceCharacterbetter(input,c1,c2,0);

        return ans;

	}
}
