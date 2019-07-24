package com.sahil.practise.Return_Permutations_String;

public class solution {
    
    private static int index=0;
	
    public static String[] permutationOfString(String current,String remaining,String ans[]){
		// Write your code here
        
        if(remaining.length()==0)
        {
            
            ans[index]=current;
            index++;
            return ans;
        }
        for(int i=0;i<remaining.length();i++)
        {
            String newCurrent=current+remaining.charAt(i);
            
            String newRemaining=remaining.substring(0,i)+remaining.substring(i+1);
            
            permutationOfString(newCurrent,newRemaining,ans);
           
          
        }
        
        return ans;
		
	}
    
    
    public static int factorial(int n)
    {
        int ans=1;
        for(int i=1;i<=n;i++)
        {
            ans*=i;
        }
        
        return ans;
    }
    
    
	public static String[] permutationOfString(String input){
		// Write your code here
        
        String ans[]=new String[factorial(input.length())];
      
        String ans1[]= permutationOfString("",input,ans);
		
        return ans;
	}
	
}
