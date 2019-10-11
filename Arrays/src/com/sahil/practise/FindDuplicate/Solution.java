package com.sahil.practise.FindDuplicate;

public class Solution {

	public static int duplicate(int[] arr) {

		int duplicate = arr[0];
		int n = arr.length;
		int flag = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j != i) {
					if (arr[j] == duplicate) {
						flag = 1;
						break;
					} else {
						flag = 0;
					}
				}
			}
			if (flag == 0)
				duplicate = arr[i + 1];
			else
				break;
		}

		return duplicate;

	}
}