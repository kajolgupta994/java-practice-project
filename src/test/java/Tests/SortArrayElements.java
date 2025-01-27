package Tests;

public class SortArrayElements {
	public static int[] sortArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 34, 2, 5, 1, 8, 9 };
		int[] result = sortArray(arr);
		System.out.println("Sorted array: ");
		for (int num : result) {
			System.out.print(num + " ");
		}

	}

}
