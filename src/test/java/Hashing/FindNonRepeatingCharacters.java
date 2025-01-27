package Hashing;

import java.util.Scanner;

public class FindNonRepeatingCharacters {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();

		// Frequency array to store occurrences of ASCII characters (0-255)
		int[] freq = new int[256];

		// Precompute frequency of each character
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)] += 1;
		}
		 // Find the first non-repeating character
		boolean found = false;
		for (int i = 0; i < str.length(); i++) {
			if (freq[str.charAt(i)] == 1) { 
				System.out.println("First non-repeating character is: " +str.charAt(i));
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("No unique character found.");
		}

		sc.close();
	}

}
