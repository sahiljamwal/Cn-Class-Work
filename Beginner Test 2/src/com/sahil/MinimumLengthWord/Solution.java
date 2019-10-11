package com.sahil.MinimumLengthWord;


public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
        
        int space[]=new int[input.length()];
       
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==32)
            {
                count++;
            }
        }
        
        count=count+1;
        
        
        
        int index=0;
        space[index]=-1;
        index++;
        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)==32)
            {
                space[index]=i;
                index++;
            }
        }
        
        space[index]=input.length();

       
        
        int k=count;
        int min_length=Integer.MAX_VALUE;
        String ans="";
         
        while(k>=1)
        {
           int length=0;
            for(int i=space[index-k]+1;i<space[index-k+1];i++)
			{
                
                length++;

			}
           
        if(length<min_length)
                {
                    ans="";
                    ans+=input.substring((space[index-k]+1),space[index-k+1]);
                    min_length=length;
                    
                    
                }

               
           
            k--;
        }
        return ans;
	}
    public static void main(String args[])
    {
        String input="abc de ghihjk a uvw h j";
        input= minLengthWord(input);
        System.out.println(input);

    }
}
