package com.sorting.bubble.sort;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 64, 25, 12, 22, 11}; // Example input
		System.out.println("Original Array: " + Arrays.toString(arr));

		bubbleSort(arr);

		System.out.println("Sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
