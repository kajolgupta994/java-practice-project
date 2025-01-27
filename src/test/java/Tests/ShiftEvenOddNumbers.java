package Tests;

import java.util.Arrays;

class Output4 {
	public static int[] ShiftOddEvenNumber(int[] arr) {
		int index = 0;
		int[] result = new int[arr.length];
		for (int num : arr) {
			if (num % 2 == 0) {
				result[index++] = num;
			}
		}
		for (int num : arr) {
			if (num % 2 != 0) {
				result[index++] = num;

			}

		}
		return result;

	}
}

public class ShiftEvenOddNumbers {

	public static void main(String[] args) {
		int[] arr = { 12, 17, 5, 3, 24, 55, 1, 44, 20 };
		int[] n = Output4.ShiftOddEvenNumber(arr);
		System.out.println(Arrays.toString(n));

	}

}
