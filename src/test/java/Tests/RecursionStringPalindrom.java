package Tests;

import java.util.*;

public class RecursionStringPalindrom {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		boolean b = PalindromeStrings.isPalindrome(str);
		System.out.println((b) ? "true" : "false");
		sc.close();

	}
}

class PalindromeStrings {
		static boolean isPalindrome(String s) {
			String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
			return checkPalindrome(cleaned, 0);
		}
	
		static boolean checkPalindrome(String str, int i) {
	
			if (i >= str.length() / 2) {
				return true;
			}
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
			return checkPalindrome(str, i + 1);
	
		}

}
