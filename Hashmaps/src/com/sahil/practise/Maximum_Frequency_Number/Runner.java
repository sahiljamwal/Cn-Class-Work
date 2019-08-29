package com.sahil.practise.Maximum_Frequency_Number;

import java.util.Scanner;

public class Runner {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sze = s.nextInt();
		int[] arr = new int[sze];
		for(int index = 0;index<sze;index++){
			arr[index]=s.nextInt();
		}
		System.out.println(Solution.maxFrequencyNumber(arr));
	}
}