package com.sorting.selectionsort;

import java.util.Arrays;

public class CheckArrayIsAlreadySorted {
	public static boolean isAlreadySorted(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				return false; // If we find an out-of-order element, return false
			}
		}

		return true;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 }; // Example input
		System.out.println("Original Array: " + Arrays.toString(arr));

		if (isAlreadySorted(arr)) {
			System.out.print("Already Sorted");
		} else {
			System.out.print("Not Sorted");
		}

	}

}
