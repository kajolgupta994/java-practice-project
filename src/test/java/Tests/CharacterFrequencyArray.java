package Tests;

import java.util.Scanner;

public class CharacterFrequencyArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int chatNum = s.charAt(i) - 'a';
			freq[chatNum]++;
		}
		int q = sc.nextInt();
		while (q > 0) {
			char c = sc.next().charAt(0);

			System.out.println("Frequency of character: " + c + ":" + freq[c - 'a']);

			q--;
		}
		sc.close();

	}

}
