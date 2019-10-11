package com.sahil.CodeInsertionSort;

public class InsertionSort {
	// arr is the input array you have to sort
	public static void insertionSort(int[] arr) {
		// write your code here

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (temp < arr[j]) {
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}

			}
		}

	}
}