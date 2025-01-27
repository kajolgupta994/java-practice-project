package Hashing;

import java.util.Scanner;

public class FindCommonElementsOfTwoArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };

		// Find max element in arr1 to create frequency array
		int maxLength = 0;
		for (int num : arr1) {
			if (num > maxLength) {
				maxLength = num;
			}
		}
		// Create frequency array for arr1
		int[] freq = new int[maxLength + 1];
		// prestore or precompute
		for (int i = 0; i < arr1.length; i++) {
			freq[arr1[i]] += 1;
		}

		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] <= maxLength && freq[arr2[i]] == 1) {
				System.out.print(arr2[i]+" ");
				// Mark the element to avoid duplicate printing
				freq[arr2[i]] = 0;
			}
		}

	}

}
