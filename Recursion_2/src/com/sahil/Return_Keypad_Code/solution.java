package com.sahil.Return_Keypad_Code;

public class solution {
public static char[] helper(int n)
    
{if(n==2)
{
    char c[]={'a','b','c'};
    return c;
}
 
 else if(n==3)
{
    char c[]={'d','e','f'};
    return c;
}
 else if(n==4)
{
    char c[]={'g','h','i'};
    return c;
}
 else if(n==5)
{
    char c[]={'j','k','l'};
    return c;
}
 else if(n==6)
{
    char c[]={'m','n','o'};
    return c;
}
 else if(n==7)
{
    char c[]={'p','q','r','s'};
    return c;
}
 else if(n==8)
{
    char c[]={'t','u','v'};
    return c;
}
 else if(n==9)
{
    char c[]={'w','x','y','z'};
    return c;
}
 else
 {char c[]={};
 return c;}
    
    
    
    
}

	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		if(n==0)
        {String ans[]={""};
            return ans;
        }
        String Sans[]=keypad(n/10);
        char arr[]=helper(n%10);
           String ans[]=new String[Sans.length*arr.length]; 
        int c=0;
for(int i=0;i<Sans.length;i++)
{for(int j=0;j<arr.length;j++)
{
   ans[c]=Sans[i]+arr[j];
    c++;
    
    
}
  
    
     
}
    return ans;  
        
	}
}
