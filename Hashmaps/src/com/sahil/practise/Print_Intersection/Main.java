package com.sahil.practise.Print_Intersection;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static void print(ArrayList<Integer> list) {
		for (int i : list) {
			System.out.print(i+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = takeInput();
		int[] arr2 = takeInput();
		Intersection.intersection(arr1, arr2);
	}
}