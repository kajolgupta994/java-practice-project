package com.sorting.bubble.sort;

public class FindKthSmallestElement {
	public static void findKthLargestElement(int[] arr, int k) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - 1; j++) {
				if (arr[j] > arr[j + 1]) {

					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

			System.out.print(k + "th largest element is: " + arr[k - 1]);
			return;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 20, 15 };
		int k = 3;
		findKthLargestElement(arr, k);

	}

}
