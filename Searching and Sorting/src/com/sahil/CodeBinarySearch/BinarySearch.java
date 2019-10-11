package com.sahil.CodeBinarySearch;

public class BinarySearch {
	// arr is the given sorted array in which you need to find num
	public static int binarySearch(int[] arr, int num) {
		// write your code here

		int beg = 0;
		int end = arr.length - 1;
		int mid = (beg + end) / 2;
		int flag = 0;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[mid] == num) {
				flag = -1;
				index = mid;
				break;
			}

			if (num < arr[mid]) {
				end = mid - 1;
				mid = (beg + end) / 2;

			}

			if (num > arr[mid]) {
				beg = mid + 1;
				mid = (beg + end) / 2;

			}

		}
		if (flag == -1) {
			return index;
		}

		else {
			return -1;
		}
	}
}