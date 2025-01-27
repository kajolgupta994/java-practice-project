package Hashing;

import java.util.Scanner;
import java.util.*;

public class FindSumAsTwoTargetArrayElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the target sum: ");
		int target = sc.nextInt();
		int[] arr = { 2, 7, 11, 15 };

		// HashSet to store visited elements
		HashSet<Integer> seen = new HashSet<>();

		boolean found = false;
		for (int num : arr) {
			int complement = target - num;

			// Check if complement exists in HashSet
			if (seen.contains(complement)) {
				System.out.println("Pair found: " + complement + " + " + num + " = " + target);
				found = true;
				break; // If only one pair is needed
			}
			seen.add(num);
		}

		if (!found) {
			System.out.println("No such pair found.");
		}
		sc.close();
	}

}
