package com.sorting.insertion.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i]; 
			int j = i - 1; 

			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
			
			System.out.println("Step " + i + ": " + Arrays.toString(arr));

		}
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 8, 1, 2 }; 
		System.out.println("Original Array: " + Arrays.toString(arr));

		insertionSort(arr);

		System.out.print("Sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}
}
