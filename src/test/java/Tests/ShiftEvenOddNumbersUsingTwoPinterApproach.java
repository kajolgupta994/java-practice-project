package Tests;

import java.util.Arrays;

class Outputs {
	public static void ShiftOddEvenNumber(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			if (arr[left] % 2 == 0) {
				left++;
			} else if (arr[right] % 2 != 0) {
				right--;
			} else {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}

		}

	}
}

public class ShiftEvenOddNumbersUsingTwoPinterApproach {

	public static void main(String[] args) {
		int[] arr = { 12, 17, 5, 3, 24, 55, 1, 44, 20 };
		Outputs.ShiftOddEvenNumber(arr);
		System.out.println(Arrays.toString(arr));

	}

}
