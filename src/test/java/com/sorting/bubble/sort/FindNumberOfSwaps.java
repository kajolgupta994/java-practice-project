package com.sorting.bubble.sort;

public class FindNumberOfSwaps {

	public static int findNumberOfSwaps(int[] arr) {
		int swapCount = 0;
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) { // Optimize inner loop
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					swapCount++;
				}
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
