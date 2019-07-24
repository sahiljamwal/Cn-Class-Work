package com.sahil.Pair_star;


public class solution {

	 public static String addStarsHelper(String s,String temp,int start)
    {
        if(s.length()-1==0)
        {
            temp+=s;
            return temp;
        }
        else if(s.length()!=start)
        {
            if(s.length()-1!=start)
            {
                    if(s.charAt(start)!=temp.charAt(temp.length()-1))
                    {
                        temp+=s.charAt(start);
                        return addStarsHelper(s,temp,start+1);
                    }
                    else
                    {
                        temp+="*";
                        temp+=s.charAt(start);

                        return addStarsHelper(s,temp,start+1);
                    }
            }
            else
            {
                if(s.charAt(start)!=temp.charAt(temp.length()-1))
                    {
                        temp+=s.charAt(start);
                        return temp;
                    }
                else
                    {
                        temp+="*";
                        temp+=s.charAt(start);

                        return temp;
                    }
            }
                    
                    
        }
        else 
            return temp;

    }

    public static String addStars(String s)
    {
        String ans="";
        String temp="";

        temp+=s.charAt(0);
        ans=addStarsHelper(s,temp,1);

        return ans;
    }
}
