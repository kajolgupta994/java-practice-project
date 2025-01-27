package Hashing;

import java.util.Scanner;

public class FindFrequecyOfCharacters {

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

		System.out.println("Enter number of queries: ");
		int q = sc.nextInt();

		while (q-- > 0) {
			// Enter character to find its frequency
			System.out.println("Enter character to check frequency: ");
			char ch = sc.next().charAt(0);
			// fetch frequencies

			System.out.println(ch + " appears: " + freq[ch] + " times");

		}

		sc.close();
	}

}
