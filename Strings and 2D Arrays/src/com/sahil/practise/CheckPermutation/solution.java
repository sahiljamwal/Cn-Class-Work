package com.sahil.practise.CheckPermutation;

public class solution {

	public static boolean isPermutation(String input1, String input2) {
		// Write your code here

		int m = input1.length();
		int n = input2.length();
		int freq[] = new int[256];
		char[] arr = input1.toCharArray();
		char[] arr1 = input2.toCharArray();

		if (m == n) {
			for (int i = 0; i < arr.length; i++) {
				char c = arr[i];
				freq[(char) c]++;
			}

			for (int i = 0; i < arr1.length; i++) {
				char c = arr1[i];
				freq[(char) c]--;
			}
			int flag = 0;
			for (int i = 0; i < freq.length; i++) {
				if (freq[i] != 0) {
					flag = -1;
					break;
				}
			}

			if (flag == -1)
				return false;
			else
				return true;
		} else {
			return false;
		}

	}
}
