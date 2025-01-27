package Tests;

import java.util.*;

public class ArrayFindDuplicateElement {
	public static ArrayList<Integer> findDuplicate(int arr[]) {

		ArrayList<Integer> duplicateElementList = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && !duplicateElementList.contains(arr[i])) {
					duplicateElementList.add(arr[i]);
				}
			}
		}
		return duplicateElementList;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> d = ArrayFindDuplicateElement.findDuplicate(arr);
		System.out.println(d + " ");
		sc.close();

	}

}
