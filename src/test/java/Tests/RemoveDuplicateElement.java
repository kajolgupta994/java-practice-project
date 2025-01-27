package Tests;

import java.util.*;

public class RemoveDuplicateElement {
	public static void main(String args[]) {

		int[] arr = new int[] { 1, 1, 1, 2, 2, 3, 3 };
		Set<Integer> uniqueElements = new HashSet<>();

		for (int num : arr) {
			uniqueElements.add(num);
		}

		RemoveDuplicateElement.removeDuplicateElements(arr);

		// Convert HashSet back to array via creating a new array
		int[] result = new int[uniqueElements.size()];
		int index = 0;

		for (int num : uniqueElements) {
			result[index++] = num;
		}
		System.out.println("Array after removing duplicates: " +Arrays.toString(result));

		// or Convert HashSet back to array via updating existing array

		int indices = 0;
		for (int num : uniqueElements) {
			arr[indices++] = num; // overwriting the array
		}

		// Print the updated array (only the first 'uniqueElements.size()' elements are valid)
		for (int i = 0; i < uniqueElements.size(); i++) {
			System.out.print(arr[i] + " ");
		}

	}

	// Optimal approach
	public static int removeDuplicateElements(int[] arr) {

		int i = 0;
		for (int j = 1; j < arr.length; j++) {
			if (arr[j] != arr[i]) {
				arr[i + 1] = arr[j];
				i++;
			}
		}
		return i + 1;
	}

}
