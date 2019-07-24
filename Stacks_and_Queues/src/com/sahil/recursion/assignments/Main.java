package com.sahil.recursion.assignments;

import java.util.Scanner;

public class Main {

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static int partition(int[] input, int start, int end) {
		// find pivot element
		int pivot = input[start];

		// find pivot position
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[start] <= input[i])
				count++;
		}
		int pivotPos = (start + count);

		
			int temp = input[pivotPos];
			input[pivotPos] = input[start];
			input[start] = temp;
		

		pivot = input[pivotPos];

		// ensuring correct position of elements with respect to pivot
		int i = start;
		int j = end;
		while (i < pivotPos && j > pivotPos)
         {
			if(input[i]<=pivot)
				i++;
			else if(input[j]>pivot)
				j--;
			else
			{
				int change=input[j];
                input[j]=input[i];
                input[i]=change;
			}

         }
			//print(input);
		

		return pivotPos;
	}

	public static void quickSortHelper(int[] input, int start, int end) {
		if (start >= end)
			return;

		int pivot = partition(input, start, end);
		quickSortHelper(input, start, pivot - 1);
		quickSortHelper(input, pivot + 1, end);
	}

	public static void quickSort(int[] input) {

		quickSortHelper(input, 0, input.length - 1);

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		quickSort(arr);

		print(arr);

	}
}