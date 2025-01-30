package com.sorting.insertion.sort;

public class FindKthSmallestElement {
	public static void findKthSmallestElement(int[] arr, int k) {
		if (k <= 0 || k > arr.length) {
			System.out.println("Invalid value of k");
			return;
		}

		for (int i = 1; i < k; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		System.out.println(k + "rd smallest element is:" + arr[k - 1]);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 20, 15 };
		int k = 3;
		findKthSmallestElement(arr, k);

	}

}
