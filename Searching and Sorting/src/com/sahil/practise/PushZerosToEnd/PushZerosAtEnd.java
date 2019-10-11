package com.sahil.practise.PushZerosToEnd;

public class PushZerosAtEnd {

	public static void pushZerosAtEnd(int[] arr) {

		int ans[] = new int[arr.length];

		int j = arr.length - 1;
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				ans[index] = arr[i];
				index++;
			}
		}

		while (index < ans.length) {
			ans[index] = 0;
			index++;
		}

		for (int i = 0; i < arr.length; i++) {
			arr[i] = ans[i];
		}
	}
}