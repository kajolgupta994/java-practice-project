package RecursionPack;

import java.util.Scanner;

public class RecursivePalindromeNUmber {
	public static int isPalindrome(int number, int revNum) {

		if (number == 0) {
			return revNum;
		}

		int lastDigit = number % 10;
		revNum = revNum * 10 + lastDigit;

		return isPalindrome(number / 10, revNum);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int reversedNum = isPalindrome(number, 0);
		if (number ==  reversedNum) {
			System.out.println(number + " is a Palindrome");
		} else {
			System.out.println(number + " is Not a Palindrome");
		}
		sc.close();

	}

}
