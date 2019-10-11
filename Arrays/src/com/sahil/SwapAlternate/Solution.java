package com.sahil.SwapAlternate;

public class Solution {

	public static void swapAlternate(int[] input) {

		for (int i = 0; i < input.length; i = i + 2) {
			if (i != input.length - 1) {
				int temp = input[i];
				input[i] = input[i + 1];
				input[i + 1] = temp;
			}

		}
	}

}
