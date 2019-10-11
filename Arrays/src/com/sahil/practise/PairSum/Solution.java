package com.sahil.practise.PairSum;

import java.util.Arrays;

public class Solution {

	public static void pairSum(int[] input, int x) {
		Arrays.sort(input);
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (j > i) {
					if ((input[i] + input[j]) == x) {
						System.out.println(input[i] + " " + input[j]);
					}
				}
			}
		}

	}
}