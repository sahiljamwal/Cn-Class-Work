package com.sahil.CodeMergeTwoSortedArrays;

import java.util.Arrays;

public class Solution {

	public static int[] merge(int arr1[], int arr2[]) {

		int arr[] = new int[arr1.length + arr2.length];
		int index = 0;
		for (int i = 0; i < arr1.length; i++) {
			arr[index] = arr1[i];
			index++;
		}

		for (int i = 0; i < arr2.length; i++) {
			arr[index] = arr2[i];
			index++;
		}

		Arrays.sort(arr);

		return arr;
	}

}
