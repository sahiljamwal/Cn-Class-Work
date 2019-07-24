package com.sahil.practise.Print_Permutations_String;

public class solution {

    public static void permutations (String current,String remaining)
    {
        if(remaining.length()==0)
        {
            System.out.println(current);
            return;
        }
        for(int i=0;i<remaining.length();i++)
        {
            String newCurrent=current+remaining.charAt(i);
            
            String newRemaining=remaining.substring(0,i)+remaining.substring(i+1);
            
            permutations(newCurrent,newRemaining);
            
        }
    }
    
	public static void permutations(String input){
		// Write your code here
        permutations("",input);
	}
}

