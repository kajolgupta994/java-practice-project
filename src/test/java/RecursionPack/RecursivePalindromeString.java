package RecursionPack;

import java.util.Scanner;

public class RecursivePalindromeString {
	public static boolean reverseString(int i, String str, int n) {
		if (i >= n / 2) {
			return true;
		}
		if (str.charAt(i) != str.charAt(n - i - 1)) {
			return false;
		}
		return reverseString(i + 1, str, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		boolean result = reverseString(0, str, n);
		System.out.println(result);
		sc.close();

	}

}
