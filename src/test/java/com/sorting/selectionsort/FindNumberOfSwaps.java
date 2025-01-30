package com.sorting.selectionsort;

public class FindNumberOfSwaps {
	public static int findNumberOfSwaps(int[] arr) {
		int swapCount = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int miniIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[miniIndex]) {
					miniIndex = j;
				}
			}
			// Swap only if a smaller element is found
			if (miniIndex != i) {
				int temp = arr[miniIndex];
				arr[miniIndex] = arr[i];
				arr[i] = temp;
				swapCount++;
			}
		}

		return swapCount;

	}

	public static void main(String[] args) {
		int[] arr = { 4, 3, 2, 1 };
		int swaps = findNumberOfSwaps(arr);

		System.out.print(swaps + " swaps");

	}

}
