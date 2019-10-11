package com.sahil.practise.ReverseEachWord;

public class Solution {

	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
		// Write your code here
		char arr[] = input.toCharArray();
		char ans[] = new char[arr.length];
		int space[] = new int[arr.length];

		int count = 1;// holds no of words in string
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == (char) 32) {
				count++;
			}
		}

		int index = 0;
		space[index] = arr.length;
		index++;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] == (char) 32) {
				space[index] = i;
				index++;
			}
		}

		space[index] = -1;

		int k = 1;
		int index1 = 0;
		while (k <= count) {
			for (int i = space[index - k] - 1; i > space[index - k + 1]; i--) {
				ans[index1] = arr[i];
				index1++;
			}
			if (k != count) {
				ans[index1] = (char) 32;
				index1++;
			}
			k++;
		}

		return String.valueOf(ans);

	}
}
