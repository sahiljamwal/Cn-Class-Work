package com.sahil.CheckArmstrong;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();

        int check=n;
        int no=n;
        int count=0;
        while(no>0)
        {
            no=no/10;
            count++;
        }

        int sum=0;
        for(int i=1;i<=count;i++)
        {
            int q=n/10;
            int r=n%10;
            sum+=Math.pow(r,count);
            n=q;
        }
        if(sum==check)
            System.out.println("true");
        else
            System.out.println("false");
        s.close();
	}
}
