package Tests;

import java.util.*;

public class ArrayListDemo2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		List<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int items = sc.nextInt();
			arr.add(items);
		}

		int largest = arr.get(0);
		for (int i = 0; i < n; i++) {
			if (arr.get(i) > largest) {
				largest = arr.get(i);
			}
		}
		int secondLargest = -1;
		for (int i = 0; i < n; i++) {
			if (arr.get(i) > secondLargest && arr.get(i) != largest) {
				secondLargest = arr.get(i);

			}
		}
		System.out.println(secondLargest);
	}

}
