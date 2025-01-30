package com.sorting.selectionsort;

public class FindKthSmallestElement {
	public static void findKthSmallestElement(int[] arr, int k) {
		int n = arr.length; // Get the length of the array = 6

		for (int i = 0; i < n - 1; i++) { // 0-4
			int miniIndex = i; // i = 0
			for (int j = i + 1; j < n; j++) { // j=1, j<6 = 1-5
				if (arr[j] < arr[miniIndex]) { // 10 < 7, NO, 4 <7 YES
					miniIndex = j; // miniIndex = 2
				}
			}

			int temp = arr[miniIndex]; // temp = 4
			arr[miniIndex] = arr[i]; // arr[2] = 7
			arr[i] = temp; // arr[0] = 4, all the above steps goes on until array is sorted in descending
							// order
			// If we have found the kth element, print and return
			if (i == k - 1) {
				System.out.print(k + "th smallest element is: " + arr[i]);
				return;
			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 7, 10, 4, 3, 20, 15 };
		int k = 3;
		findKthSmallestElement(arr, k);

	}

}
