package Tests;

import java.util.Arrays;

public class CountingSort {

	public static int[] countingSort(int[] arr) {
		// Step 1: Find the maximum value in the array
		int max = Arrays.stream(arr).max().getAsInt();

		// Step 2: Create a count array to store the frequency of each value
		int[] count = new int[max + 1];
		for (int num : arr) {
			count[num]++;
		}

		// Step 3: Create the sorted array
		int[] sorted = new int[arr.length];
		int index = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				sorted[index++] = i;
				count[i]--;
			}
		}
		return sorted;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 2, 1 };
		System.out.println("Original Array: " + Arrays.toString(arr));

		int[] sortedArray = countingSort(arr);

		System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
	}
}
