package RecursionPack;

import java.util.Scanner;

public class RecursiveReverseString {
	public static String reverseString(String str, String revStr, int i) {
		if (i >= str.length()) {
			return revStr;
		}

		revStr = revStr + str.charAt(str.length() - i - 1);

		return reverseString(str, revStr, i + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String revStr = "";
		String result = reverseString(str, revStr, 0);
		System.out.println("Reversed string: " + result);
		sc.close();

	}

}
