package Tests;

import java.io.*;
import java.util.*;

public class RecursionStringPalindrome {

	public static void main(String args[]) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] str = new String[n];
		for (int i = 0; i < n; i++) {
			str[i] = sc.nextLine();
		}
		for (String s : str) {
			boolean is = PalindromeString.isPalindrome(s, 0);
			System.out.println(s + " is " + (is ? "true" : "false"));
		}

		sc.close();

	}

	class PalindromeString {
		static boolean isPalindrome(String s, int i) {
			if (i >= s.length() / 2) {
				return true;
			}
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
			return isPalindrome(s, i + 1);

		}

	}

}
