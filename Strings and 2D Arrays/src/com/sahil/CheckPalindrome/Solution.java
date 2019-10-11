package com.sahil.CheckPalindrome;

public class Solution {

	public static boolean checkPalindrome(String str) {

		char[] copy = str.toCharArray();
		char[] arr = new char[copy.length];

		int index = 0;
		for (int i = copy.length - 1; i >= 0; i--) {
			arr[index] = copy[i];
			index++;
		}

		int flag = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == copy[i]) {
				flag = -1;
			} else {
				flag = 0;
				break;
			}
		}

		if (flag == -1)
			return true;
		else
			return false;
	}
}
