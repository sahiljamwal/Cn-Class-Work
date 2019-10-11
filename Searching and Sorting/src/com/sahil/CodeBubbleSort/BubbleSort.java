package com.sahil.CodeBubbleSort;

public class BubbleSort {
	// arr is the input array you have to sort
	public static void bubbleSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}

			}
		}
	}
}