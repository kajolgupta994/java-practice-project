package com.sorting.selectionsort;

public class SortArrayInDescendingOrder {
	public static void selectionSortDescending(int[] arr) {
		int n = arr.length; // Get the length of the array = 5
		for (int i = 0; i < n - 1; i++) { // 0-3
			int maxIndex = i; // i = 0
			for (int j = i + 1; j < n; j++) { // j=1, j<5 = 1-4
				if (arr[j] > arr[maxIndex]) { // 8 > 5 yes
					maxIndex = j; // maxIndex = 1, then 9>1 yes so maxIndex = 4
				}
			}
			int temp = arr[maxIndex]; // temp = 9
			arr[maxIndex] = arr[i]; // earlier arr[0] = 5, after swap arr[4] = 5
			arr[i] = temp; // after swap arr[0] = 8, and arr[4] = 5
			//[9, 8, 3, 1, 5] // 1 iteration

		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 8, 3, 1, 9 };
		selectionSortDescending(arr);
		System.out.println("Descending order sorted array: ");
		for (int num : arr) {
			System.out.print(num+" ");
		}
	}

}
