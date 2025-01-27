package RecursionPack;

import java.util.Scanner;

public class RecursiveReverseArray {
	public static void revArray(int left, int right, int[] arr) {

		if (left >= right) {
			return;
		}
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;

		revArray(left + 1, right - 1, arr);// this statement sorting array

	}

	public static void revArray2(int i, int n, int[] arr) {

		if (i >= n / 2) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[n - i - 1];
		arr[n - i - 1] = temp;

		revArray2(i + 1, n, arr);// this statement sorting array

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr1 = new int[n];
		int[] arr2 = new int[n];

		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
			arr2[i] = arr1[i]; // Copy array for independent testing
		}
		int right = arr1.length - 1;
		revArray(0, right, arr1);

		System.out.println("Reversed array elements using revArray: ");
		for (int num : arr1) {
			System.out.print(num + " ");
		}

		revArray2(0, n, arr2);

		System.out.println("\nReversed array elements using revArray2: ");
		for (int num : arr2) {
			System.out.print(num + " ");
		}

		sc.close();

	}

}
