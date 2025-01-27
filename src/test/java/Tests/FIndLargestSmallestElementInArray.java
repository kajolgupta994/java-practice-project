package Tests;

import java.util.Scanner;

public class FIndLargestSmallestElementInArray {
	public static int[] findLargestSmallestElements(int[] arr) {
		if (arr == null || arr.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		int largest = arr[0];
		int smallest = Integer.MAX_VALUE;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}

			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		return new int[] { largest, smallest };
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] results = findLargestSmallestElements(arr);

		System.out.println("Largest Element: " + results[0]);
		System.out.println("Smallest Element: " + results[1]);
		sc.close();
	}

}
