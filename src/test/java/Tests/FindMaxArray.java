package Tests;

public class FindMaxArray {
	public static int findMaxValue(int[] arr) {
		int largest = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 7, 11, 3 };
		int maxElement = FindMaxArray.findMaxValue(arr);
		System.out.println(maxElement);

	}

}
