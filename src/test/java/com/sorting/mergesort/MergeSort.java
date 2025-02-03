package com.sorting.mergesort;

import java.util.Arrays;

public class MergeSort {
	// Merge Sort function
	public static void mergeSort(int[] arr, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			// Recursively split the array
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			// Merge sorted halves
			merge(arr, left, mid, right);
		}
	}

	// Merge function to merge two sorted halves
	private static void merge(int[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Create temporary arrays
		int[] leftArr = new int[n1];
		int[] rightArr = new int[n2];

		// Copy data to temp arrays
		System.arraycopy(arr, left, leftArr, 0, n1);
		System.out.println("Sub-array One: " + Arrays.toString(leftArr));

		// Copy data to temp arrays
		System.arraycopy(arr, mid + 1, rightArr, 0, n2);
		System.out.println("Sub-array Two: " + Arrays.toString(rightArr));

		// Merge the two arrays
		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (leftArr[i] <= rightArr[j]) {
				arr[k] = leftArr[i];
				i++;
			} else {
				arr[k] = rightArr[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements from leftArr
		while (i < n1) {
			arr[k] = leftArr[i];
			i++;
			k++;
		}

		// Copy remaining elements from rightArr
		while (j < n2) {
			arr[k] = rightArr[j];
			j++;
			k++;
		}
	}

	// Main method to test Merge Sort
	public static void main(String[] args) {
		int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted Array: " + Arrays.toString(arr));
	}
}
