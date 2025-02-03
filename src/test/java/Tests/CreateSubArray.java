package Tests;

import java.util.*;

public class CreateSubArray {
	public static void getSubArrays(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		System.out.println("Right side index: " + right);
		System.out.println("Mid index: " + mid);
		int[] subArr1 = new int[mid - left + 1]; // 3
		int[] subArr2 = new int[right - mid]; // 2

		// Copy elements correctly into subArr1
		for (int i = left; i <= mid; i++) {
			subArr1[i - left] = arr[i];
		}
		System.out.println("Sub Array One: " + Arrays.toString(subArr1));

		// Copy elements correctly into subArr2
		for (int i = mid + 1; i <= right; i++) {
			subArr2[i - (mid + 1)] = arr[i];
		}
		System.out.println("Sub Array Two: " + Arrays.toString(subArr2));

	}

	public static void main(String[] args) {
		int[] arr = { 2, 1, 4, 3, 5};
		int right = arr.length - 1;
		System.out.println("Original Array: " + Arrays.toString(arr));
		getSubArrays(arr, 0, right);

	}

}
