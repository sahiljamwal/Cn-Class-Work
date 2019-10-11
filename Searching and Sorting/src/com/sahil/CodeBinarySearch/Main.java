package com.sahil.CodeBinarySearch;

import java.util.Scanner;

public class Main {
	static Scanner s1 = new Scanner(System.in);
		
	public static int[] takeInput() {
		int size = s1.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s1.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		int num = s1.nextInt();
		System.out.print(BinarySearch.binarySearch(arr, num));
	}
}