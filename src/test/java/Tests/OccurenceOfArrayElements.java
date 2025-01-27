package Tests;

import java.util.ArrayList;

public class OccurenceOfArrayElements {
	private static ArrayList<String> checkOccarance(int[] arr) {
		ArrayList<String> counts = new ArrayList<>();
		boolean[] visited = new boolean[arr.length];// To track visited elements
		for (int i = 0; i < arr.length; i++) {
			if (visited[i]) {
				// Skip if already processed
				continue;
			}
			int count = 0;
			for (int j = i; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true; // Mark this index as visited
				}
			}

			counts.add(arr[i] + ":" + count);

		}
		return counts;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 2, 5, 6, 4 };
		ArrayList<String> result = checkOccarance(arr);
		System.out.println("Occurrences of array elements:"+result);
		

	}

}
