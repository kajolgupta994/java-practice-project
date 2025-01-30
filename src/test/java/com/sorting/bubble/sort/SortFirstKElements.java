package com.sorting.bubble.sort;

public class SortFirstKElements {
	public static void sortFirstKElements(int[] arr, int k) {
		int n = arr.length;
		for (int i = 0; i < k - 1; i++) {
			for (int j = 0; j < k - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 7, 3, 9, 1, 6, 5 };
		int k = 3;
		sortFirstKElements(arr, k);
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
