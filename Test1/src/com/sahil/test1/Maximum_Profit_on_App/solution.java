package com.sahil.test1.Maximum_Profit_on_App;

import java.util.Arrays;


public class solution {

	public static int maximumProfit(int budget[]) {
		// Write your code here
        
        Arrays.sort(budget);
        int maxProfit=0;
        for(int i=0;i<budget.length;i++)
        {
            int tempPrice=budget[i];
            int tempProfit=tempPrice*(budget.length-i);
            if(tempProfit>=maxProfit)
            {
                maxProfit=tempProfit;
            }
        }
        
        return maxProfit;
	}

}
