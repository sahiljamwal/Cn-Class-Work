package com.sahil.practise.RotateArray;

public class ArrayRotate {

	public static void rotate(int[] arr, int d) {

		int ans[] = new int[arr.length];
		int index = 0;
		for (int i = d; i < arr.length; i++) {
			ans[index] = arr[i];
			index++;
		}

		for (int i = 0; i < d; i++) {
			ans[index] = arr[i];
			index++;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
	}
}