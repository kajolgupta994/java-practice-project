package com.sorting.insertion.sort;

import java.util.Arrays;

public class FindNumberOfShifts {

	public static void findNumberOfShift(int[] arr) {
		int n = arr.length;
		int shiftCount = 0;
		System.out.println("Original Array: "+Arrays.toString(arr));
		
		for (int i = 1; i < n; i++) {
			int key = arr[i];
			int j = i - 1;

			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
				shiftCount++;
			}
			arr[j + 1] = key;
			
		}
		System.out.println("Sorted Array: "+Arrays.toString(arr));
		System.out.println("Total shifts: "+shiftCount);
	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 2, 1 };

		findNumberOfShift(arr);

	}

}
