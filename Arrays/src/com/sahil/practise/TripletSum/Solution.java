package com.sahil.practise.TripletSum;

import java.util.Arrays;

public class Solution {

	public static void tripletSum(int[] input, int x) {

		Arrays.sort(input);

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				for (int k = 0; k < input.length; k++) {
					if ((j > i) && (k > j)) {
						if (input[i] + input[j] + input[k] == x) {
							System.out.println(input[i] + " " + input[j] + " " + input[k]);
						}
					}
				}
			}
		}

	}
}
