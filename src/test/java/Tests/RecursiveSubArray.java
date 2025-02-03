package Tests;

import java.util.*;

public class RecursiveSubArray {
	public static void getSubArrays(int[] arr, int left, int right) {

		// Base case: Stop when left meets or exceeds right
		if (left >= right) {
			return;
		}
		int mid = (left + right) / 2;

		int size1 = mid - left + 1;
		int size2 = right - mid;
		
		
		int subArr1[] = new int[size1];
		int subArr2[] = new int[size2];

		for (int i = left; i <= mid; i++) {
			subArr1[i - left] = arr[i];
		}

		for (int i = mid + 1; i <= right; i++) {
			subArr2[i - (mid + 1)] = arr[i];
		}

		System.out.println("Sub Array One: " + Arrays.toString(subArr1));
		System.out.println("Sub Array Two: " + Arrays.toString(subArr2));

		// Recursively divide further
		getSubArrays(arr, left, mid);
		getSubArrays(arr, mid + 1, right);

	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 5, 6 };
		int right = arr.length - 1;
		System.out.println("Original Array: " + Arrays.toString(arr));
		getSubArrays(arr, 0, right);

	}

}
