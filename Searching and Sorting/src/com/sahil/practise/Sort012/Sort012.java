package com.sahil.practise.Sort012;

public class Sort012 {

	public static void sort012(int[] arr) {
		int ans[] = new int[arr.length];

		int i = 0;
		int beg = 0;
		int end = arr.length - 1;
		while (i < arr.length) {
			if (arr[i] == 0) {
				ans[beg] = arr[i];
				i++;
				beg++;
			} else if (arr[i] == 2) {
				ans[end] = arr[i];
				i++;
				end--;
			} else
				i++;
		}

		while (beg <= end) {
			ans[beg] = 1;
			beg++;
		}

		for (int p = 0; p < arr.length; p++) {
			arr[p] = ans[p];
		}

	}
}