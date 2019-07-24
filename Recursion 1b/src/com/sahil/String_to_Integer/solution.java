package com.sahil.String_to_Integer;

public class solution {
    
    public static int convertStringToNum(String temp,int start)
    {
        int ans=0;
        if(temp.length()-1==0)
            ans=Integer.parseInt(temp);
        else if(temp.length()!=start)
            {
                String ttemp="";
                ttemp+=temp.charAt(start);
                int num=Integer.parseInt(ttemp);
                ans+=num*Math.pow(10,start);
                ans+=convertStringToNum(temp,start+1);
            } 
        return ans;
    }

	public static int convertStringToInt(String input){
		// Write your code here
        
        String temp="";
        for(int i=input.length()-1;i>=0;i--)
        {
            temp+=input.charAt(i);
        }
       
        int ans=convertStringToNum(temp,0);
        
        return ans;
	}
}
