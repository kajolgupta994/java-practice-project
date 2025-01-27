package Tests;

public class FindDuplicateArrayElement {
	public static int findDuplicateElement(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					return arr[i];
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 6, 5, 7 };
		int result = FindDuplicateArrayElement.findDuplicateElement(arr);
		if (result != -1) {
			System.out.println("Duplicate Element: " + result);
		} else {
			System.out.println("No duplicate found.");
		}
	}

}
