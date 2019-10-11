package com.sahil.LargestRowOrColumn;

public class Solution {

	public static void findLargest(int input[][]) {

		int n = input.length;
		int m = input[0].length;

		int mrs = 0;
		int mrs_index = -1;
		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = 0; j < m; j++) {
				sum += input[i][j];
			}
			if (sum > mrs) {
				mrs = sum;
				mrs_index = i;
			}
		}

		int mcs = 0;
		int mcs_index = -1;
		for (int j = 0; j < m; j++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += input[i][j];
			}
			if (sum > mcs) {
				mcs = sum;
				mcs_index = j;
			}
		}

		if (mrs > mcs) {
			System.out.println("row" + " " + mrs_index + " " + mrs);
		} else if (mrs < mcs) {
			System.out.println("column" + " " + mcs_index + " " + mcs);
		} else if (mrs == mcs) {
			System.out.println("row" + " " + mrs_index + " " + mrs);
		}

	}

}
