package com.sorting.selectionsort;

import java.util.Arrays;

public class SelectionSortDemo {
	public static void selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;// Assume the current element is smallest

			// Find the index of the smallest element in the unsorted part
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 64, 20, 12, 22, 11 }; // Example input
		System.out.println("Original Array: " + Arrays.toString(arr));

		selectionSort(arr);

		System.out.println("Sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
