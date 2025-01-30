package com.sorting.bubble.sort;

public class SortArrayInDescendingOrder {
	public static void sortInDescendingOrder(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) { // 0-3
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 1, 8, 2, 7 };
		sortInDescendingOrder(arr);
		System.out.println("Descending order sorted array: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
