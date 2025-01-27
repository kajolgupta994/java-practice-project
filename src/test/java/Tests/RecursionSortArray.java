package Tests;

import java.util.*;

public class RecursionSortArray {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}

		ReverseArray.RevArray(arr);
		System.out.println(Arrays.toString(arr));
		// ReverseArray.reverseArray(0, arr, n);
		// System.out.println(Arrays.toString(arr));

		sc.close();

	}

}

class ReverseArray {
	public static void RevArray(int[] arr) {
		int left = 0;
		int right = arr[arr.length-1];
		if (left >= right) {
			return;
		}

		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		left++;
		right--;
		RevArray(arr);
		
	}

	public static void reverseArray(int i, int[] arr, int n) {

		if (i >= n / 2) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[n - i - 1];
		arr[n - i - 1] = temp;

		reverseArray(i + 1, arr, n);

	}

}
