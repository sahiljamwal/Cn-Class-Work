package com.sahil.practise.FindUnique;

public class Solution {

	public static int findUnique(int[] arr) {

		int unique = arr[0];
		int n = arr.length;
		int flag = 0;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (j != i) {
					if (unique != arr[j]) {
						flag = -1;

					} else {
						flag = 0;
						break;

					}

				}

			}
			if (flag == 0)
				unique = arr[i + 1];
			else
				break;
		}
		return unique;

	}
}