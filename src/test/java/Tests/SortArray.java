package Tests;

class Output2 {
	public static boolean sortArray() {
		int[] arr = new int[] { 1, 2, 1, 3, 4 };
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= arr[i - 1]) {

			} else {
				return false;
			}

		}
		return true;
	}
}

public class SortArray {

	public static void main(String args[]) {
		boolean result = Output2.sortArray();

		System.out.println((result) ? "Sorted" : "Not Sorted");

	}
}
