package com.sahil.practise.Sort01;

public class SortBinaryArray {

	public static void sortBinaryArray(int[] arr) {

		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 1) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				j++;
			}
		}

	}
}