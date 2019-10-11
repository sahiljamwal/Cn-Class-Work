package com.sahil.practise.CheckArrayRotation;

public class CheckRotation {

	public static int arrayRotateCheck(int[] arr) {
		int flag = arr[0];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < flag) {
				flag = arr[i];
				k = i;
			}
		}

		return k;
	}
}