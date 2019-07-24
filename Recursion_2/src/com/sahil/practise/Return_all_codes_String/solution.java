package com.sahil.practise.Return_all_codes_String;


public class solution {

	// Return a string array that contains all possible codes
    
    
    public static char getMapping(Character ch)
    {
        int num=ch-'0';

        char ans=(char)(num+97-1);
        
        return ans;
      
        
    }
    
    public static  String[] getCodeHelper(String input,int start)
    {
    	if(start==input.length())
		{
			String character="";
			character+=getMapping(input.charAt(start-1));
			String ans[]={character};
			
			return ans;
		}
    	
    	String smallAns[]=getCodeHelper(input, start+1);
    	String ans[]=new String[smallAns.length];
    	
    	for(int i=0;i<smallAns.length;i++)
    	{
    		String temp="";
        	
        	temp+=getMapping(input.charAt(start-1))+smallAns[i];
        	ans[i]=temp;
    	}
    	
    	return ans;
    	
    }
    
    
    
	public static  String[] getCode(String input){
		// Write your code here
		
		String Result1[]=getCodeHelper(input, 1);
		
		
		return Result1;
		
		
	}

}
