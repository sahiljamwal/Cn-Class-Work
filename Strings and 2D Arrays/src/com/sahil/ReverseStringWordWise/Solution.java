package com.sahil.ReverseStringWordWise;

public class Solution {
	public static String reverseWordWise(String input) {
		// Write your code here
		char[] arr = input.toCharArray();
		int[] space = new int[arr.length];
		char[] ans = new char[arr.length];

		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (char) 32) {
				count++;
			}
		}

		int index = 0;
		space[index] = -1;
		index++;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (char) 32) {
				space[index] = i;
				index++;
			}
		}

		space[index] = arr.length;

		int index1 = 0;
		int k = 1;
		while (k <= count) {
			for (int i = space[index - k] + 1; i < space[index - k + 1]; i++) {

				ans[index1] = arr[i];
				index1++;
			}
			if (k != count) {
				ans[index1] = (char) 32;
				index1++;
			}

			k++;
		}

		input = String.valueOf(ans);
		return input;

	}
}
