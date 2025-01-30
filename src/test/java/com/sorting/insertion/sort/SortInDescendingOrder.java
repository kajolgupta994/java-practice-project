package com.sorting.insertion.sort;

import java.util.Arrays;

public class SortInDescendingOrder {

	public static void sortInDescendingOrder(int arr[]) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] < key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 7, 3, 9 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		sortInDescendingOrder(arr);

		System.out.print("Sorted array in descending order: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}
