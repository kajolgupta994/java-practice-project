package Tests;

import java.util.Arrays;

public class FindLargest {
	public static int findLargest(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		return largest;
	}

	public static int secondLindLargest(int[] arr) {
		if (arr.length < 2) {
			throw new IllegalArgumentException("Array must contain at least two elements.");
		}
		int largest = Integer.MIN_VALUE;
		int secondLarg = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLarg = largest;
				largest = arr[i];
			} else if (arr[i] > secondLarg && arr[i] != largest) {
				secondLarg = arr[i];
			}
		}
		if (secondLarg == Integer.MIN_VALUE) {
			throw new IllegalArgumentException("No second largest element found.");
		}

		return secondLarg;
	}

	public static int findSmallest(int[] arr) {
		int smallest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		return smallest;
	}

	public static int[] sortArray(int[] arr) {

		int length = arr.length;
		for (int i = 0; i < length - 1; i++) {
			int len = arr.length - i - 1;
			for (int j = 0; j < len; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		return arr;

	}

	public static int[] sortAndRemoveDuplicateArray(int[] arr) {
		Arrays.sort(arr);
		// Use a temporary array to remove duplicates
		int[] temp = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];

			}
		}
		temp[j++] = arr[arr.length - 1];// Add the last element
		// Copy unique elements to a new array of correct size
		int[] uniqueArr = Arrays.copyOf(temp, j);

		return uniqueArr;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 11, 3, 6 };
		int largestElement = FindLargest.findLargest(arr);
		System.out.println("Largest element: " + largestElement);

		int SecondlargestElement = FindLargest.secondLindLargest(arr);
		System.out.println("Second largest element: " + SecondlargestElement);

		int smallestElement = FindLargest.findSmallest(arr);
		System.out.println("Smallest element: " + smallestElement);

		System.out.println("Array elements are sorting: ");
		int[] sortedArray = FindLargest.sortArray(arr);
		for (int num : sortedArray) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Array after sorting and removing duplicates: ");
		int[] uniqueElements = FindLargest.sortAndRemoveDuplicateArray(arr);
		for (int num : uniqueElements) {
			System.out.print(num + " ");
		}

	}

}
