package Hashing;

import java.util.Scanner;

public class FindFrequecyOfArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		// prestore or precompute
		int maxLength = 0;
		for (int num : arr) {
			if (num > maxLength) {
				maxLength = num;
			}
		}
		int[] freq = new int[maxLength + 1];

		for (int i = 0; i < arr.length; i++) {
			freq[arr[i]] += 1;
		}

		int q = sc.nextInt();

		while (q-- > 0) {
			// enter number to find its frequencies
			int number = sc.nextInt();
			// fetch frequencies
			if (number <= maxLength) {
				System.out.println(number + " appears: " + freq[number] + " times");
			} else {
				System.out.println(number + " appears: 0 times");
			}
		}

		sc.close();
	}

}
