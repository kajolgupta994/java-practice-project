package Hashing;

import java.util.Scanner;

public class FindDuplicateArrayElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter array elements:");
		int maxLength = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (arr[i] > maxLength) {
				maxLength = arr[i];
			}
		}

		// prestore or precompute

		int[] freq = new int[maxLength + 1];

		boolean foundDuplicate = false;
		System.out.println("Duplicate elements:");
		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]] += 1;
			if (freq[arr[i]] == 21) {
				System.out.println(arr[i] + " is duplicated");
				foundDuplicate = true;
			}
		}
		if (!foundDuplicate) {
			System.out.println("No duplicate elements found.");
		}

		sc.close();
	}

}
