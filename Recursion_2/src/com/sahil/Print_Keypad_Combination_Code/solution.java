package com.sahil.Print_Keypad_Combination_Code;

public class solution {

    public static char[] returnArray(int n)
    {
        if(n==2)
        {
            char ans[]={'a','b','c'};
            return ans;
        }
        else if(n==3)
        {
            char ans[]={'d','e','f'};
            return ans;
        }
        else if(n==4)
        {
            char ans[]={'g','h','i'};
            return ans;
        }
        else if(n==5)
        {
            char ans[]={'j','k','l'};
            return ans;
        }
        else if(n==6)
        {
            char ans[]={'m','n','o'};
            return ans;
        }
        else if(n==7)
        {
            char ans[]={'p','q','r','s'};
            return ans;
        }
        else if(n==8)
        {
            char ans[]={'t','u','v'};
            return ans;
        }
        else if(n==9)
        {
            char ans[]={'w','x','y','z'};
            return ans;
        }
        else
        {
            char ans[]={};
            return ans;
        }

        
    }
    
    public static void printKeypad(int input,String output)
    {
        if(input==0)
        {
            System.out.println(output);
            return;
        }
        
        char arr[]=returnArray(input%10);
        
        for(int i=0;i<arr.length;i++)
        {
            printKeypad(input/10,arr[i]+output);
        }
        
        
    }
    
	public static void printKeypad(int input){
		// Write your code here
        
        printKeypad(input,"");
		
	}
}
