package com.sorting.insertion.sort;

public class CheckArrayIsAlreadySorted {
	public static boolean isArrayAlreadySorted(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; i++) {
			if (arr[i - 1] > arr[i]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		isArrayAlreadySorted(arr);
		if (isArrayAlreadySorted(arr)) {
			System.out.println("Already sorted!");
		} else {
			System.out.println("Not sorted");
		}

	}

}
